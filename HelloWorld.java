//Justyna
package com.example.week2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HelloWorld extends Application{ //HelloWorld class will have access to all of
    // the methods and properties of the Application class by inheritance
    public static void main(String[] args){ //entry point to application , void - no return value
        //args is array of strings
        launch(args);
    }
    @Override //override start method in application class
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World");
        Button btn = new Button(); //create button object
        btn.setText("Say 'Hello World'"); //adds text to the button
        btn.setOnAction(new EventHandler<ActionEvent>(){ //when the button is clicked - this event is handled
            //and the 'Hello World is executed
            public void handle(ActionEvent event){
                System.out.println("Hello World"); //prints hello world to console when button is clicked
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(btn);// This adds the button (btn) as a child of the StackPane(root)
        primaryStage.setScene(new Scene(root, 300, 250)); //oot node and dimensions of 300 by 250 pixels.
        primaryStage.show();
    }
}





