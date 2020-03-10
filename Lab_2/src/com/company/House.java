package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.GeneralPath;
import javax.swing.*;

@SuppressWarnings("serial")

public class House extends JPanel implements ActionListener {
    private static int maxWidth;
    private static int maxHeight;

    double[][] points ={{210,250},{310,210},{460,250}};
    Timer timer;
    // Для анімації масштабування
    private double scale = 1;
    private int scaleDirection = 1;
    private double delta = 0.01;
    // Для анімації руху
    private double tx = 1;
    private double ty = 0;
    private double deltaX = 1;
    private int radius = 150;

    public House() {
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);

        g2d.setBackground(new Color(0,0,128));
        g2d.clearRect(0, 0, maxWidth+5, maxHeight+5);

        g2d.setColor(new Color(0,0,0));
        BasicStroke bs2 = new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        g2d.setStroke(bs2);
        g2d.drawRect(10, 10, maxWidth-20, maxHeight-20);

        g2d.translate(tx, ty);
        g2d.scale(scale, scale);

        g2d.setColor(new Color(128,0,0));
        g2d.fillRect(210, 250, 250, 90);

        GradientPaint gp = new GradientPaint(25, 1,
                new Color(128,128,128), 25, 35, new Color(66, 66, 66), true);
        g2d.setPaint(gp);
        GeneralPath h = new GeneralPath();
        h.moveTo(points[0][0], points[0][1]);
        for (int k = 1; k < points.length; k++)
            h.lineTo(points[k][0], points[k][1]);
        h.closePath();
        g2d.fill(h);

        g2d.setColor(new Color(255,255,0));

        g2d.fillRect(260, 270, 28, 30);
        g2d.fillRect(340, 270, 28, 30);

        g2d.fillRect(175, 205, 13, 13);
        g2d.fillRect(230, 175, 13, 13);
        g2d.fillRect(380, 205, 13, 13);
        g2d.fillRect(435, 175, 13, 13);

        // Перетворення для анімації масштабу

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("КП-73, Берещенко, Lab_2");
        frame.add(new House());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 550);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setVisible(true);
        Dimension size = frame.getSize();
        Insets insets = frame.getInsets();
        maxWidth = size.width - insets.left - insets.right - 1;
        maxHeight = size.height - insets.top - insets.bottom - 1;
    }

    public void actionPerformed(ActionEvent e) {
        if (scale < 0.01) {
            delta = -delta;
        } else if (scale > 0.99) {
            delta = -delta;
        }
        double radiusInSquare = Math.pow(radius, 2);
        if (tx <= 0 && ty < 0){
            tx -= deltaX;
            ty = (-1) * Math.abs(Math.sqrt(radiusInSquare - Math.pow(tx, 2)));
        }else if(tx > 0 && ty <= 0){
            tx -= deltaX;
            ty = (-1) * Math.abs(Math.sqrt(radiusInSquare - Math.pow(tx, 2)));
        }else if(tx >= 0 && ty > 0){
            tx += deltaX;
            ty = Math.abs(Math.sqrt(radiusInSquare - Math.pow(tx, 2)));
        }else if(tx < 0 && ty >= 0){
            tx += deltaX;
            ty = Math.abs(Math.sqrt(radiusInSquare - Math.pow(tx, 2)));
        }



        scale += delta;

        repaint();
    }

}