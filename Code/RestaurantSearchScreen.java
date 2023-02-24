package com.cs440;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class RestaurantSearchScreen extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button filterButton(Stage primaryStage) {
        Button button = new Button("Filter");
        button.setPrefWidth(100);
        button.setPrefHeight(30);
        button.setStyle("-fx-base: lightgreen");
        button.setFont(Font.font("Arial", 14));

        // Create popup
        Popup popup = new Popup();
        popup.setAutoHide(true);

        // Create VBox for options
        VBox optionsBox = new VBox();
        optionsBox.setSpacing(10);
        optionsBox.setPadding(new Insets(10));
        optionsBox.setStyle("-fx-background-color: white;");

        // Add options
        String[] options = { "Indian", "Italian", "Mexican", "Vegan", "Vegetarian", "Gluten-Free" };
        for (String option : options) {
            Button optionButton = new Button(option);
            optionButton.setPrefWidth(200);
            optionButton.setAlignment(Pos.CENTER);
            optionButton.setFont(Font.font("Arial", 14));
            optionButton.setOnAction(event -> {
                // Handle option selection
                System.out.println("Selected: " + option);
                popup.hide();
            });
            optionsBox.getChildren().add(optionButton);
        }

        // Add VBox to popup
        popup.getContent().add(optionsBox);

        // Set popup position and show when button is clicked
        button.setOnAction(event -> {
            if (popup.isShowing()) {
                popup.hide();
            } else {
                popup.show(button.getScene().getWindow());
                popup.setX(button.localToScreen(0, 0).getX());
                popup.setY(button.localToScreen(button.getLayoutBounds().getHeight(), 0).getY());
            }
        });

        return button;
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Restaurant Search");

        Text title = new Text("Restaurant Search");
        title.setFont(Font.font("Arial", 20));
        BorderPane.setAlignment(title, Pos.CENTER);
        BorderPane.setMargin(title, new Insets(40, 0, 10, 30));

        ImageView searchIcon = new ImageView(new Image(
                "https://www.citypng.com/public/uploads/preview/download-blue-search-icon-button-png-11640084027s0fkuhz2lb.png"));
        searchIcon.setFitWidth(20);
        searchIcon.setFitHeight(20);

        TextField searchField = new TextField();
        searchField.setPrefWidth(325);
        searchField.setFont(Font.font("Arial", 14));
        HBox searchBox = new HBox(searchIcon, searchField);
        searchBox.setAlignment(Pos.CENTER_LEFT);
        searchBox.setPadding(new Insets(0, 30, 20, 30));

        Button filter = filterButton(primaryStage);
        HBox filterBox = new HBox(filter);
        filterBox.setAlignment(Pos.CENTER);
        filterBox.setPadding(new Insets(0, 30, 20, 30));

        VBox centerBox = new VBox(searchBox, filterBox);
        centerBox.setAlignment(Pos.CENTER);
        centerBox.setSpacing(10);

        VBox resultBox = new VBox();
        resultBox.setPadding(new Insets(10, 30, 30, 30));
        resultBox.setSpacing(10);

        Text resultTitle = new Text("Search results:");
        resultTitle.setFont(Font.font("Arial", 20));
        BorderPane.setMargin(resultTitle, new Insets(5, 0, 10, 30));
        resultBox.getChildren().add(resultTitle);

        Text result1 = new Text("Chipotle\n123 Downing Street\nChicago\nIL\n49779");
        result1.setFont(Font.font("Arial", 14));
        resultBox.getChildren().add(result1);

        Text result2 = new Text("Chick-Fil-A\n84 Gradent Avenue\nChicago\nIL\n49779");
        result2.setFont(Font.font("Arial", 14));
        resultBox.getChildren().add(result2);

        Text result3 = new Text(
                "Panda Express\n760 Express Lane\nChicago\nIL\n49778");
        result3.setFont(Font.font("Arial", 14));
        resultBox.getChildren().add(result3);

        Text result4 = new Text("Subway\n818 North Avenue\nChicago\nIL\n49777");
        result4.setFont(Font.font("Arial", 14));
        resultBox.getChildren().add(result4);

        BorderPane borderPane = new BorderPane();
        borderPane.setPrefWidth(375);
        borderPane.setPrefHeight(667);
        borderPane.setTop(title);
        borderPane.setCenter(centerBox);
        borderPane.setBottom(resultBox);

        Scene scene = new Scene(borderPane, Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
