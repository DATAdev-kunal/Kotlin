package com.example.javafxdemo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

class Customer
{
    private int custId;
    private String name;
    private  String address;

    public Customer(int custId, String name, String address) {
        this.custId = custId;
        this.name = name;
        this.address = address;
    }

    public int getCustId() {
        return custId;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
public class CustomerEntry extends Application {
    int count=0;
    @Override
    public void start(Stage stage) throws Exception {
        HashMap<Integer,Customer> hm=new HashMap<>();

        Label l1,l2,l3;
        TextField t1,t2;

        ComboBox<Integer> cb;
        Button b1,b2;

        Font f=new Font("Times New Roman",20);

        l1=new Label("Customer ID");l1.setFont(f);
        l2=new Label("Name");l2.setFont(f);
        l3=new Label("Address");l3.setFont(f);

        t1=new TextField();t1.setFont(f);
        t2=new TextField();t2.setFont(f);
        t1.setPrefColumnCount(15);
        t2.setPrefColumnCount(20);

        b1=new Button("Save");b1.setFont(f);
        b2=new Button("Create");b2.setFont(f);

        cb=new ComboBox<>();
        cb.setStyle("-fx-font-size-20");

        HBox hb0=new HBox();hb0.setAlignment(Pos.CENTER);
        HBox hb1=new HBox();hb1.setAlignment(Pos.CENTER);
        HBox hb2=new HBox();hb2.setAlignment(Pos.CENTER);
        HBox hb3=new HBox();hb3.setAlignment(Pos.CENTER);
        hb0.getChildren().addAll(l1,cb);
        hb1.getChildren().addAll(l2,t1);
        hb2.getChildren().addAll(l3,t2);
        hb3.getChildren().addAll(b1,b2);


        VBox vb=new VBox();
        vb.setSpacing(20);
        vb.getChildren().addAll(hb0,hb1,hb2,hb3);

        b1.setOnAction(e->{
            ++count;
            cb.getItems().add(count);
            cb.setValue(count);
            t1.setText("");
            t2.setText("");
        });

        b2.setOnAction(ae->{
            Customer c=new Customer(cb.getValue(), t1.getText(),t2.getText());
            hm.put(count,c);

            try (PrintStream ps=new PrintStream(new FileOutputStream("/home/kunal/IdeaProjects/JavaFXDemo/src/main/java/com/example/javafxdemo/Customers.txt"))){
                for(Customer cu:hm.values())
                {
                    ps.println(cu.getCustId());
                    ps.println(cu.getName());
                    ps.println(cu.getAddress());
                }

            } catch (Exception e) { }
        });

        try (Scanner scan=new Scanner(new FileInputStream("/home/kunal/IdeaProjects/JavaFXDemo/src/main/java/com/example/javafxdemo/Customers.txt"))){
            int cID;
            String n,a;
            System.out.println("hi");
            while(scan.hasNext())
            {
                cID= scan.nextInt();
                n= scan.next();
                a= scan.next();
                hm.put(cID,new Customer(cID,n,a));
                if(cID>count)
                    count=cID;
                cb.getItems().add(cID);
            }

        } catch (Exception e){}

        cb.valueProperty().addListener(e->{
            int c=cb.getValue();
            Customer ct=hm.get(c);
            t1.setText(ct.getName());
            t2.setText(ct.getAddress());
        });


        Scene sc=new Scene(vb,600,600);
        stage.setScene(sc);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
