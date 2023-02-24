package com.cs440;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MapScreen extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Map");

        // Create title
        Text title = new Text("Map");
        title.setFont(Font.font("Arial", 20));

        // Create map image
        Image mapImage = new Image("https://upload.wikimedia.org/wikipedia/commons/f/f7/Soho_-_map_1.png");
        ImageView mapImageView = new ImageView(mapImage);
        mapImageView.setFitWidth(300);
        mapImageView.setFitHeight(300);

        // Create container pane
        Pane containerPane = new Pane();
        containerPane.getChildren().addAll(title, mapImageView);
        containerPane.setPadding(new Insets(40));

        // Create restaurant details
        Text result1 = new Text("Chipotle - Chicken Burrito Bowl\n800 Calories\n46g Protein\n30g Fats\n124g Carbs");
        result1.setFont(Font.font("Arial", 14));
        Text result2 = new Text("Chick-Fil-A - Chicken Sandwich\n380 Calories\n28g Protein\n11g Fats\n44g Carbs");
        result2.setFont(Font.font("Arial", 14));
        Text result3 = new Text(
                "Panda Express - Chicken Teriyaki Bowl w/ Veggies\n300 Calories\n36g Protein\n13g Fats\n2g Carbs");
        result3.setFont(Font.font("Arial", 14));

        VBox resultBox = new VBox(10);
        resultBox.setPadding(new Insets(20));
        resultBox.getChildren().addAll(result1, result2, result3);

        // Create layout
        BorderPane borderPane = new BorderPane();
        borderPane.setPrefWidth(375);
        borderPane.setPrefHeight(667);

        HBox topBox = new HBox();
        topBox.setAlignment(Pos.CENTER);
        topBox.getChildren().add(title);

        VBox centerBox = new VBox();
        centerBox.setAlignment(Pos.CENTER);
        centerBox.getChildren().add(mapImageView);

        borderPane.setTop(topBox);
        BorderPane.setAlignment(topBox, Pos.CENTER);
        borderPane.setCenter(centerBox);
        BorderPane.setAlignment(centerBox, Pos.CENTER);
        borderPane.setBottom(resultBox);
        BorderPane.setAlignment(resultBox, Pos.CENTER);

        Scene scene = new Scene(borderPane, 375, 667, Color.WHITE);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
