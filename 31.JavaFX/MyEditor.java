package com.example.javafxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyEditor extends Application implements EventHandler<ActionEvent> {
    Text t;
    RadioButton r1,r2,r3;
    CheckBox c1,c2,c3;
    ChoiceBox<Integer> cb;

    @Override
    public void start(Stage stage) throws Exception {

        t=new Text("Hello World");
        HBox hbt=new HBox();
        hbt.getChildren().add(t);

        r1=new RadioButton("Red");
        r2=new RadioButton("Green");
        r3=new RadioButton("Blue");
        ToggleGroup tg=new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);
        HBox hb=new HBox();
        hb.getChildren().addAll(r1,r2,r3);
        hb.setSpacing(15);
        hb.setPadding(new Insets(10,10,10,10));

        c1=new CheckBox("Normal");
        c2=new CheckBox("Bold");
        c3=new CheckBox("Italic");
        HBox hb2=new HBox();
        hb2.getChildren().addAll(c1,c2,c3);
        hb2.setSpacing(15);
        hb2.setPadding(new Insets(10,10,10,10));

        cb=new ChoiceBox<>();
        cb.getItems().addAll(10,20,30,40,50);

        VBox vb=new VBox();
        vb.getChildren().addAll(hbt,hb,hb2,cb);
        vb.setSpacing(15);
        vb.setPadding(new Insets(10,10,10,10));

        r1.setOnAction(this);
        r2.setOnAction(this);
        r3.setOnAction(this);
        c1.setOnAction(this);
        c2.setOnAction(this);
        c3.setOnAction(this);
        cb.setOnAction(this);

        FlowPane fp=new FlowPane(vb);
        Scene sc=new Scene(fp,600,600);
        stage.setScene(sc);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent ae) {

        FontWeight fw=FontWeight.NORMAL;
        FontPosture fp=FontPosture.REGULAR;

        if(r1.isSelected())
            t.setFill(Paint.valueOf("RED"));
        if(r2.isSelected())
            t.setFill(Paint.valueOf("GREEN"));
        if(r3.isSelected())
            t.setFill(Paint.valueOf("BLUE"));

        if(c2.isSelected())
            fw=FontWeight.BOLD;
        if(c3.isSelected())
            fp=FontPosture.ITALIC;

        t.setFont(Font.font("Times New Roman",fw,fp,cb.getValue()));
    }
}
