package com.example.javafxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DateColorPickerDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        TextArea ta=new TextArea();
        ta.setPrefColumnCount(400);
        ta.setPrefRowCount(20);

        Slider sl=new Slider(10,50,10);
        sl.setMajorTickUnit(10);
        sl.setShowTickMarks(true);

        sl.valueProperty().addListener(e->ta.setFont(Font.font(sl.getValue())));

        DatePicker dp=new DatePicker();
        dp.setShowWeekNumbers(true);
        dp.setOnAction(e->ta.setText("Date: "+dp.getValue()+"\n"+ta.getText()));


        ColorPicker cp=new ColorPicker();
        cp.setOnAction(e->{
            ta.setStyle("-fx-text-fill:#"+cp.getValue().toString().substring(2,8));
            ta.setText(cp.getValue()+"\n"+ta.getText());
        });

        Button b=new Button("Open file");
        b.setOnAction(e->{
            FileChooser fc=new FileChooser();
            java.io.File file=fc.showOpenDialog(stage);

            try {
                Scanner scan=new Scanner(new FileInputStream(file));

                String str="";
                while (scan.hasNext())
                    str=str+scan.nextLine()+"\n";
                ta.setText(str);
            } catch (Exception ex) {

            }
        });
        VBox vb=new VBox();
        vb.getChildren().addAll(ta,sl,dp,cp,b);
        vb.setAlignment(Pos.TOP_CENTER);

        Scene sc=new Scene(vb,500,500);
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
