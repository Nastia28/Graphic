package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Fir_tree extends Application {
    public static void main(String[] args) { launch(args);}

    @Override
    public void start(Stage primaryStage){
        Group root = new Group();
        Scene scene = new Scene(root, 700, 400);
        scene.setFill(Color.rgb(253, 202, 201));

        //tree
        Ellipse el1 = new Ellipse(100,245,30,10);
        el1.setFill(Color.rgb(100, 62, 52));
        el1.setStrokeWidth(1);
        el1.setStroke(Color.BLACK);
        root.getChildren().add(el1);

        Ellipse el2 = new Ellipse(100,240,30,10);
        el2.setFill(Color.rgb(100, 62, 52));
        el2.setStrokeWidth(1);
        el2.setStroke(Color.BLACK);
        root.getChildren().add(el2);

        Rectangle r = new Rectangle(93,190,15,50);
        r.setFill(Color.rgb(100, 62, 52));
        r.setStrokeWidth(1);
        r.setStroke(Color.BLACK);
        root.getChildren().add(r);

        Ellipse el3 = new Ellipse(100,175,70,50);
        el3.setFill(Color.rgb(0, 148, 1));
        el3.setStrokeWidth(1);
        el3.setStroke(Color.BLACK);
        root.getChildren().add(el3);

        Circle c1 = new Circle(5,105,100);
        c1.setFill(Color.rgb(253, 202, 201));
        root.getChildren().add(c1);

        Circle c2 = new Circle(205,105,100);
        c2.setFill(Color.rgb(253, 202, 201));
        root.getChildren().add(c2);

        Ellipse el4 = new Ellipse(100,152,55,40);
        el4.setFill(Color.rgb(0, 148, 1));
        el4.setStrokeWidth(1);
        el4.setStroke(Color.BLACK);
        root.getChildren().add(el4);

        Circle c3 = new Circle(15,80,100);
        c3.setFill(Color.rgb(253, 202, 201));
        root.getChildren().add(c3);

        Circle c4 = new Circle(195,80,100);
        c4.setFill(Color.rgb(253, 202, 201));
        root.getChildren().add(c4);

        Ellipse el5 = new Ellipse(100,130,40,30);
        el5.setFill(Color.rgb(0, 148, 1));
        el5.setStrokeWidth(1);
        el5.setStroke(Color.BLACK);
        root.getChildren().add(el5);

        Circle c5 = new Circle(20,55,100);
        c5.setFill(Color.rgb(253, 202, 201));
        root.getChildren().add(c5);

        Circle c6 = new Circle(185,55,100);
        c6.setFill(Color.rgb(253, 202, 201));
        root.getChildren().add(c6);
        //tree end

        Circle sh1 = new Circle(90,130,5);
        sh1.setFill(Color.rgb(19, 255, 0));
        sh1.setStrokeWidth(1);
        sh1.setStroke(Color.BLACK);
        root.getChildren().add(sh1);

        Circle sh3 = new Circle(92,190,5);
        sh3.setFill(Color.rgb(19, 255, 0));
        sh3.setStrokeWidth(1);
        sh3.setStroke(Color.BLACK);
        root.getChildren().add(sh3);

        Circle sh2 = new Circle(68,218,5);
        sh2.setFill(Color.rgb(19, 255, 0));
        sh2.setStrokeWidth(1);
        sh2.setStroke(Color.BLACK);
        root.getChildren().add(sh2);


        Circle sh4 = new Circle(105,142,5);
        sh4.setFill(Color.rgb(17, 3, 255));
        sh4.setStrokeWidth(1);
        sh4.setStroke(Color.BLACK);
        root.getChildren().add(sh4);

        Circle sh5 = new Circle(120,187,5);
        sh5.setFill(Color.rgb(17, 3, 255));
        sh5.setStrokeWidth(1);
        sh5.setStroke(Color.BLACK);
        root.getChildren().add(sh5);

        Circle sh6 = new Circle(63,200,5);
        sh6.setFill(Color.rgb(17, 3, 255));
        sh6.setStrokeWidth(1);
        sh6.setStroke(Color.BLACK);
        root.getChildren().add(sh6);

        Circle sh7 = new Circle(82,155,5);
        sh7.setFill(Color.rgb(255, 0, 246));
        sh7.setStrokeWidth(1);
        sh7.setStroke(Color.BLACK);
        root.getChildren().add(sh7);

        Circle sh8 = new Circle(130,160,5);
        sh8.setFill(Color.rgb(255, 0, 246));
        sh8.setStrokeWidth(1);
        sh8.setStroke(Color.BLACK);
        root.getChildren().add(sh8);

        Circle sh9 = new Circle(110,205,5);
        sh9.setFill(Color.rgb(255, 0, 246));
        sh9.setStrokeWidth(1);
        sh9.setStroke(Color.BLACK);
        root.getChildren().add(sh9);

        Circle sh10 = new Circle(92,145,5);
        sh10.setFill(Color.rgb(252, 150, 0));
        sh10.setStrokeWidth(1);
        sh10.setStroke(Color.BLACK);
        root.getChildren().add(sh10);

        Circle sh11 = new Circle(107,187,5);
        sh11.setFill(Color.rgb(252, 150, 0));
        sh11.setStrokeWidth(1);
        sh11.setStroke(Color.BLACK);
        root.getChildren().add(sh11);

        Circle s12 = new Circle(105,220,5);
        s12.setFill(Color.rgb(252, 150, 0));
        s12.setStrokeWidth(1);
        s12.setStroke(Color.BLACK);
        root.getChildren().add(s12);

        Circle sh13 = new Circle(110,173,5);
        sh13.setFill(Color.rgb(246, 249, 0));
        sh13.setStrokeWidth(1);
        sh13.setStroke(Color.BLACK);
        root.getChildren().add(sh13);

        Circle sh14 = new Circle(129,197,5);
        sh14.setFill(Color.rgb(246, 249, 0));
        sh14.setStrokeWidth(1);
        sh14.setStroke(Color.BLACK);
        root.getChildren().add(sh14);

        Circle sh15 = new Circle(86,202,5);
        sh15.setFill(Color.rgb(246, 249, 0));
        sh15.setStrokeWidth(1);
        sh15.setStroke(Color.BLACK);
        root.getChildren().add(sh15);

        Circle sh16 = new Circle(96,160,5);
        sh16.setFill(Color.rgb(15, 252, 255));
        sh16.setStrokeWidth(1);
        sh16.setStroke(Color.BLACK);
        root.getChildren().add(sh16);

        Circle s17 = new Circle(125,218,5);
        s17.setFill(Color.rgb(15, 252, 255));
        s17.setStrokeWidth(1);
        s17.setStroke(Color.BLACK);
        root.getChildren().add(s17);

        Circle sh18 = new Circle(120,147,5);
        sh18.setFill(Color.rgb(252, 0, 0));
        sh18.setStrokeWidth(1);
        sh18.setStroke(Color.BLACK);
        root.getChildren().add(sh18);

        Circle s19 = new Circle(72,177,5);
        s19.setFill(Color.rgb(252, 0, 0));
        s19.setStrokeWidth(1);
        s19.setStroke(Color.BLACK);
        root.getChildren().add(s19);

        Circle sh20 = new Circle(140,207,5);
        sh20.setFill(Color.rgb(252, 0, 0));
        sh20.setStrokeWidth(1);
        sh20.setStroke(Color.BLACK);
        root.getChildren().add(sh20);

        Circle sh21 = new Circle(88,217,5);
        sh21.setFill(Color.rgb(252, 0, 0));
        sh21.setStrokeWidth(1);
        sh21.setStroke(Color.BLACK);
        root.getChildren().add(sh21);

        Polygon star = new Polygon(
                106,115, 108,121,
                        116,123, 110,125,
                        112,133, 106,127,
                        100,133, 102,125,
                        96,123, 104,121,
                106,115);
        star.setFill(Color.rgb(252, 0, 0));
        star.setStrokeWidth(1);
        star.setStroke(Color.BLACK);
        root.getChildren().add(star);

        // Animation
        int cycleCount = 4;
        int time = 2000;

        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(time), root);
        scaleTransition.setToX(2);
        scaleTransition.setToY(2);
        scaleTransition.setAutoReverse(true);

        RotateTransition rotateTransition = new RotateTransition(Duration.millis(time), root);
        rotateTransition.setByAngle(360f);
        rotateTransition.setCycleCount(cycleCount);
        rotateTransition.setAutoReverse(true);

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(time), root);
        translateTransition.setFromX(150);
        translateTransition.setToX(500);
        translateTransition.setCycleCount(cycleCount + 1);
        translateTransition.setAutoReverse(true);

        TranslateTransition translateTransition2 = new TranslateTransition(Duration.millis(time), root);
        translateTransition2.setFromX(50);
        translateTransition2.setToX(500);
        translateTransition2.setCycleCount(cycleCount + 1);
        translateTransition2.setAutoReverse(true);

        ScaleTransition scaleTransition2 = new ScaleTransition(Duration.millis(time), root);
        scaleTransition2.setToX(0.1);
        scaleTransition2.setToY(0.1);
        scaleTransition2.setCycleCount(cycleCount);
        scaleTransition2.setAutoReverse(true);

        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(
                rotateTransition,
                scaleTransition,
                scaleTransition2,
                translateTransition
        );
        parallelTransition.setCycleCount(Timeline.INDEFINITE);
        parallelTransition.play();
//        // End of animation

        //End
        primaryStage.setResizable(true);
        primaryStage.setTitle("Lab 3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
