package com.company;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Main extends Application{

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage){
        Group root = new Group();
        Scene scene = new Scene (root, 350, 215);

        Rectangle body = new Rectangle(0, 0, 400, 300); //створення фігури
        root.getChildren().add(body);
        body.setFill(Color.rgb(0, 0, 128));

        Rectangle home= new Rectangle(60,115,250,80);
        root.getChildren().add(home);
        home.setFill(Color.rgb(128, 0, 0));

        Polygon home2 = new Polygon(180, 70, 60, 115, 310, 115);
        root.getChildren().add(home2);
        home2.setFill(Color.rgb(128, 128, 128));

        Rectangle wind1= new Rectangle(120,135,28,30);
        root.getChildren().add(wind1);
        wind1.setFill(Color.rgb(255, 255, 0));

        Rectangle wind2= new Rectangle(190,135,28,30);
        root.getChildren().add(wind2);
        wind2.setFill(Color.rgb(255, 255, 0));
        //------------------------------------------------------------------
        Rectangle star1= new Rectangle(15,50,13,13);
        root.getChildren().add(star1);
        star1.setFill(Color.rgb(255, 255, 0));

        Rectangle star2= new Rectangle(70,20,13,13);
        root.getChildren().add(star2);
        star2.setFill(Color.rgb(255, 255, 0));

        Rectangle star3= new Rectangle(210,50,13,13);
        root.getChildren().add(star3);
        star3.setFill(Color.rgb(255, 255, 0));

        Rectangle star4= new Rectangle(265,20,13,13);
        root.getChildren().add(star4);
        star4.setFill(Color.rgb(255, 255, 0));
        //--------------------------------------------------------------------
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
