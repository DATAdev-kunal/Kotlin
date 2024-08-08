package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PropertyDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button b=new Button("_Click Me");
        b.setTextFill(Color.DARKCYAN);
        b.setMnemonicParsing(true);

        Tooltip tp=new Tooltip("Click to save Data");
        b.setTooltip(tp);
        b.setStyle("-fx-border-color:red;-fx-background-color:yellow;");

        Alert a=new Alert(Alert.AlertType.INFORMATION,"Your data is saved! Return back");
        b.setOnAction(e->a.show());
        FlowPane fp=new FlowPane(b);
        Scene sc=new Scene(fp,600,600);

        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
    launch();
    }
}
