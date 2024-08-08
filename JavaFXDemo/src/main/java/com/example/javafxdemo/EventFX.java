package com.example.javafxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class EventFX extends Application{
    Button b;
    int count=0;
    @Override
    public void start(Stage stage) throws Exception {

        b=new Button("Count");
        b.setPrefSize(200,100);

        FlowPane fp=new FlowPane(b);
        Scene sc=new Scene(fp,600,600);
        stage.setScene(sc);
        stage.show();

        //b.setOnAction(this);

        //OR USING LAMBDA EXPRESSION

        b.setOnAction(e->b.setText(""+ ++count));

    }

    public static void main(String[] args) {
        launch(args);
    }

    /*@Override
    public void handle(ActionEvent ae) {
        count++;
        b.setText(count+"");
    }*/
}
