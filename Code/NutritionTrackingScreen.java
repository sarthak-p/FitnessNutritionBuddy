package com.cs440;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NutritionTrackingScreen extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Nutrition Tracking");

        Text title = new Text("Nutrition Tracking");
        title.setFont(Font.font("Arial", 20));
        BorderPane.setAlignment(title, Pos.CENTER);
        Pane titlePane = new Pane(title);
        titlePane.setPadding(new Insets(20, 0, 10, 30));
        BorderPane.setAlignment(titlePane, Pos.TOP_CENTER);

        Text caloriesLabel = new Text("Calories:");
        caloriesLabel.setFont(Font.font("Arial", 20));
        Text caloriesValue = new Text("400");
        caloriesValue.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        HBox caloriesBox = new HBox(caloriesLabel, caloriesValue);
        caloriesBox.setAlignment(Pos.CENTER_LEFT);
        caloriesBox.setPadding(new Insets(40, 30, 20, 30));

        Text totalFatLabel = new Text("Total Fat:");
        totalFatLabel.setFont(Font.font("Arial", 20));
        Text totalFatValue = new Text("0mg");
        totalFatValue.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        HBox totalFatBox = new HBox(totalFatLabel, totalFatValue);
        totalFatBox.setAlignment(Pos.CENTER_LEFT);
        totalFatBox.setPadding(new Insets(20, 30, 20, 30));

        Text sodiumLabel = new Text("Sodium:");
        sodiumLabel.setFont(Font.font("Arial", 20));
        Text sodiumValue = new Text("30mg");
        sodiumValue.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        HBox sodiumBox = new HBox(sodiumLabel, sodiumValue);
        sodiumBox.setAlignment(Pos.CENTER_LEFT);
        sodiumBox.setPadding(new Insets(20, 30, 20, 30));

        Text carbohydratesLabel = new Text("Carbohydrates:");
        carbohydratesLabel.setFont(Font.font("Arial", 20));
        Text carbohydratesValue = new Text("50g");
        carbohydratesValue.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        HBox carbohydratesBox = new HBox(carbohydratesLabel, carbohydratesValue);
        carbohydratesBox.setAlignment(Pos.CENTER_LEFT);
        carbohydratesBox.setPadding(new Insets(20, 30, 20, 30));

        Text proteinLabel = new Text("Protein:");
        proteinLabel.setFont(Font.font("Arial", 20));
        Text proteinValue = new Text("20g");
        proteinValue.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        HBox proteinBox = new HBox(proteinLabel, proteinValue);
        proteinBox.setAlignment(Pos.CENTER_LEFT);
        proteinBox.setPadding(new Insets(20, 30, 40, 30));

        VBox resultBox = new VBox(title, caloriesBox, totalFatBox, sodiumBox, carbohydratesBox, proteinBox);
        resultBox.setPadding(new Insets(20, 0, 80, 0));
        resultBox.setSpacing(20);
        resultBox.setAlignment(Pos.TOP_CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setPrefWidth(375);
        borderPane.setPrefHeight(667);
        borderPane.setCenter(resultBox);

        Scene scene = new Scene(borderPane, 375, 667, Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
