package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LayoutsDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Button b1,b2,b3,b4,b5,b6;

        b1=new Button("Test 1");
        b2=new Button("Test 2");
        b3=new Button("Test 3");
        b4=new Button("Test 4");
        b5=new Button("Test 5");
        b6=new Button("Test 6");

        /*
        FlowPane fp=new FlowPane();
        fp.getChildren().addAll(b1,b2,b3,b4,b5,b6);
        fp.setHgap(10);
        */

        /*
        VBox vb=new VBox();

        vb.getChildren().addAll(b1,b2,b3,b4,b5,b6);

        BorderPane bp=new BorderPane();
        bp.setBottom(vb);
        */

        GridPane gp=new GridPane();

        gp.add(b1,1,0);
        gp.add(b2,0,1);
        gp.add(b3,7,2);
        gp.add(b4,0,3);
        Scene sc=new Scene(gp,400,400);
        stage.setScene(sc);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
