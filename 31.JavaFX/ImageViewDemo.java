package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class ImageViewDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ImageView iv1=new ImageView(new Image(new FileInputStream("/home/kunal/Downloads/1.png")));
        ImageView iv2=new ImageView(new Image(new FileInputStream("/home/kunal/Downloads/2.jpg")));
        ImageView iv3=new ImageView(new Image(new FileInputStream("/home/kunal/Downloads/3.jpg")));

        ScrollPane scp1=new ScrollPane(iv1);
        ScrollPane scp2=new ScrollPane(iv2);
        ScrollPane scp3=new ScrollPane(iv3);

        /*
        SplitPane sp=new SplitPane(scp1,scp2,scp3);
        sp.setDividerPositions(0.33,0.66);
        */

        /*
        Tab t1=new Tab("Reputation Tour",scp1);
        Tab t2=new Tab("Solo",scp2);
        Tab t3=new Tab("Lover Tour",scp3);
        */

        TitledPane t1=new TitledPane("Reputation Tour",scp1);
        TitledPane t2=new TitledPane("Solo",scp2);
        TitledPane t3=new TitledPane("Lover Tour",scp3);

        Accordion acc=new Accordion();
        acc.getPanes().addAll(t1,t2,t3);

        Scene sc=new Scene(acc,600,600);
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
