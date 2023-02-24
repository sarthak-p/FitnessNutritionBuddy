package com.cs440;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SignInScreen extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button signInButton(Stage primaryStage, TextField email, TextField password) {
        Button button = new Button("Sign In");
        button.setPrefWidth(100);
        button.setPrefHeight(30);
        button.setStyle("-fx-base: lightgreen");
        button.setFont(Font.font("Arial", 14));
        button.setOnAction(actionEvent -> {
            // What happens when the user presses the button
        });

        return button;
    }

    Button signUpButton(Stage primaryStage) {
        Button button = new Button("Sign Up");
        button.setPrefWidth(100);
        button.setPrefHeight(30);
        button.setStyle("-fx-base: lightgreen");
        button.setFont(Font.font("Arial", 14));
        button.setOnAction(actionEvent -> {
            // What happens when the user presses the button?
        });

        return button;
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sign In");

        Text title = new Text("Sign In or Create an Account");
        title.setFont(Font.font("Arial", 20));
        DropShadow shadow = new DropShadow();
        title.setEffect(shadow);

        Label emailLabel = new Label("Email:");
        TextField email = new TextField();
        emailLabel.setFont(Font.font("Arial", 15));
        email.setFont(Font.font("Arial", 15));
        email.setPrefWidth(200);

        Label passwordLabel = new Label("Password:");
        TextField password = new TextField();
        passwordLabel.setFont(Font.font("Arial", 15));
        password.setFont(Font.font("Arial", 15));
        password.setPrefWidth(200);

        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(50, 30, 50, 30));
        vbox.getChildren().addAll(title, emailLabel, email, passwordLabel, password);

        Button signIn = signInButton(primaryStage, email, password);
        Button signUp = signUpButton(primaryStage);

        HBox buttonBox = new HBox(20);
        buttonBox.setPadding(new Insets(0, 30, 50, 30));
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(signIn, signUp);

        BorderPane borderPane = new BorderPane();
        borderPane.setPrefWidth(300);
        borderPane.setPrefHeight(600);
        borderPane.setPadding(new Insets(50, 30, 20, 30));
        borderPane.setTop(title);
        BorderPane.setAlignment(title, Pos.CENTER);
        borderPane.setCenter(vbox);
        borderPane.setBottom(buttonBox);

        Scene scene = new Scene(borderPane, 375, 667, Color.WHITE);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
