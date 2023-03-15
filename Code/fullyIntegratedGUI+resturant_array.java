import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class fullyIntegratedGUI extends Application{

	public static void main(String[] args) {
		launch(args);
		//System.out.print("This works");
		
//		Create c = new Create();
//		c.createRestaurantTable();
	}
	
	public void createdb() {
		Create c1 = new Create("Kenya's Keto Kitchen", "Keto", "Chicago, IL");
		Create c2 = new Create("Dirty Root", "Low Carb", "Chicago, IL");
		Create c3 = new Create("CRAFT Donuts + Coffee", "Keto", "Chicago");
		Create c4 = new Create("Tweet", "Low Carb", "Chicago, IL");
		Create c5 = new Create("The Eating Well", "Vegan", "Schaumburg, IL");
		Create c6 = new Create("True Food Kitchen", "Vegan", "Oak Brook, IL");
		Create c8 = new Create("Kale My Name", "Vegan", "Chicago, IL");
		Create c9 = new Create("The Water Bar", "Gluten Free", "Geneva, IL");
		Create c10 = new Create("Alice and Friends Vegan Kitchen", "Vegan", "Chicago, IL");
		Create c11 = new Create("Victus Foods", "Paleo", "Chicago, IL");
		Create c12 = new Create("THAI GARDEN", "Paleo", "Chicago, IL");
		Create c13 = new Create("Protien Bar and Kitchen", "Low Carb", "Chicago, IL");
		Create c14 = new Create("Purple Sprout Concious Organic", "Vegan", "Buffalo Grove, IL");
		Create c15 = new Create("LYFE Kitchen", "Vegan", "Chicago, IL");
		Create c16 = new Create("Fittingly Delicious", "Low Carb", "Chicago, IL");
		Create c17 = new Create("Harvest Room", "Vegan", "Palos Heights, IL");
		Create c18 = new Create("Sweet Natalies Gluten Free Bakery/Baby Doll Bakery", "Gluten Free", "Wheaton, IL");
		Create c19 = new Create("Da Luciano's", "Gluten Free", "Rivers Grove");
		Create c20 = new Create("Wheat's End Cafe & Bakery", "Gluten Free", "Chicago, IL");
		Create c21 = new Create("Maggiano's Little Italy", "Gluten Free", "Schaumburg, IL");
		Create c22 = new Create("Moretti's", "Gluten Free", "Bartlett, IL");
		Create c23 = new Create("Augustino's Rock and Roll Deli and Grill", "Gluten Free", "Carol Stream");
		Create c24 = new Create("Nature's Best Cafe", "Vegan", "Naperville, IL");
		Create c25 = new Create("sweetgreen", "Low Protien", "Schaumburg");
		Create c26 = new Create("Low Carb Kitchen", "Low Carb", "Downers Grove, IL");
		Create c27 = new Create("Egg Harbor Cafe", "Gluten Free", "Naperville, IL");
		Create c28 = new Create("Panera Bread", "Keto", "Chicago, IL");
		Create c29 = new Create("Panera Bread", "Keto", "Berwyn, IL");
		Create c30 = new Create("Panera Bread", "Keto", "River Forest, IL");
		Create c31 = new Create("Panera Bread", "Keto", "Emlwood Park, IL");
		Create c32 = new Create("Panera Bread", "Keto", "Norridge, IL");
		Create c33 = new Create("Panera Bread", "Keto", "Oak Lawn, IL");
		Create c34 = new Create("Taco Bell", "Keto", "Chicago, IL");
		Create c35 = new Create("Taco Bell", "Keto", "Hanover Park, IL");
		Create c36 = new Create("Taco Bell", "Keto", "Addison, IL");
		Create c37 = new Create("Taco Bell", "Keto", "Aurora, IL");
		Create c38 = new Create("Chili's Grill & Bar", "Keto", "Aurora, IL");
		Create c39 = new Create("Chili's Grill & Bar", "Keto", "Bolingbrook, IL");
		Create c40 = new Create("Chili's Grill & Bar", "Keto", "Naperville, IL");
		Create c41 = new Create("Chili's Grill & Bar", "Keto", "Oswego, IL");
		Create c42 = new Create("Chili's Grill & Bar", "Keto", "Plainfield, IL");
		Create c43 = new Create("Chili's Grill & Bar", "Keto", "Batavia, IL");
		
		ArrayList<Create> db = new ArrayList<Create>();
		db.add(c1);
		db.add(c2);
		db.add(c3);
		db.add(c4);
		db.add(c5);
		db.add(c6);
		//db.add(c7);
		db.add(c8);
		db.add(c9);
		db.add(c10);
		db.add(c11);
		db.add(c12);
		db.add(c13);
		db.add(c14);
		db.add(c15);
		db.add(c16);
		db.add(c17);
		db.add(c18);
		db.add(c19);
		db.add(c20);
		db.add(c21);
		db.add(c22);
		db.add(c23);
		db.add(c24);
		db.add(c25);
		db.add(c26);
		db.add(c27);
		db.add(c28);
		db.add(c29);
		db.add(c30);
		db.add(c31);
		db.add(c32);
		db.add(c33);
		db.add(c34);
		db.add(c35);
		db.add(c36);
		db.add(c37);
		db.add(c38);
		db.add(c39);
		db.add(c40);
		db.add(c41);
		db.add(c42);
		db.add(c43);
		
		for(int i = 0; i < db.size(); i++) {
			System.out.print("Name: \t");
			System.out.print(db.get(i).name + "\n");
			System.out.print("Speciality: \t");
			System.out.print(db.get(i).speciality + "\n");
			System.out.print("Location: \t");
			System.out.print(db.get(i).location + "\n");
		}
		
	}

	Button option(String s, int offset) {
		Button button = new Button(s);
		button.setPrefWidth(150);
		button.setPrefHeight(50);
		button.setTranslateX(225);
		button.setTranslateY(offset);
		button.setStyle("-fx-base: lightgreen");

		return button;
	}

	public Label createLabel(String string, int y) {
		Label label = new Label(string);
		label.setTranslateX(80);
		label.setTranslateY(y);
		label.setFont(new Font(20));

		return label;
	}

	public void caloriesDisplay(Stage primaryStage) {
		Label label = new Label("Calorie Tracking");
		label.setTranslateX(220);
		label.setTranslateY(30);
		label.setFont(new Font(25));

		Label allowance = createLabel("X Calories allowed", 250);
		Label consumed = createLabel("Consumed x calories today", 300);
		Label remaining = createLabel("X Calories remaining", 350);

		// set background image
		String image = "https://assets.justinmind.com/wp-content/uploads/2018/09/green-progress-bar.png";
		BackgroundImage bi = new BackgroundImage(new Image(image, 300, 300, false, true),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
				BackgroundSize.DEFAULT);
		Background bg = new Background(bi);
		BorderPane bp = new BorderPane();
		bp.setPrefWidth(600);
		bp.setPrefHeight(300);
		bp.setBackground(bg);

		Button backButton = new Button("Back");
		backButton.setTranslateX(10);
		backButton.setTranslateY(10);
		backButton.setOnAction(e -> optionScreen(primaryStage));

		Group root = new Group(bp, label, allowance, consumed, remaining, backButton);

		Scene scene = new Scene(root, 600, 600, Color.MINTCREAM);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void mealPlanScreen(Stage primaryStage) {
		Label label = new Label("Meal Plan");
		label.setTranslateX(220);
		label.setTranslateY(30);
		label.setFont(new Font(25));

		Label breakfast = createLabel("Breakfast:\n Example meal\n X calories\n From Restaurant X", 100);
		Label lunch = createLabel("Lunch:\n Example meal\n X calories\n From Restaurant X", 260);
		Label dinner = createLabel("Dinner:\n Example meal\n X calories\n From Restaurant X", 420);

		Button backButton = new Button("Back");
		backButton.setTranslateX(10);
		backButton.setTranslateY(10);
		backButton.setOnAction(e -> optionScreen(primaryStage));

		Group root = new Group(label, breakfast, lunch, dinner, backButton);

		Scene scene = new Scene(root, 600, 600, Color.MINTCREAM);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	int goal = 2000;

	public void changeGoalScreen(Stage primaryStage) {
		Label cur = new Label("Current goal: " + goal + " calories per day");
		cur.setTranslateX(150);
		cur.setTranslateY(100);
		cur.setFont(Font.font(20));

		TextField tf = new TextField("Enter new goal: ");
		tf.setTranslateX(150);
		tf.setTranslateY(250);

		Label set = new Label();
		set.setTranslateX(150);
		set.setTranslateY(300);
		set.setFont(Font.font(15));

		Button button = new Button("Set goal");
		button.setTranslateX(350);
		button.setTranslateY(250);
		button.setOnAction(actionEvent -> {
			goal = Integer.parseInt(tf.getText());
			if (goal < 1000) {
				set.setText("Goal is too low, try again");
			} else {
				set.setText("Goal set!");
				cur.setText("Current goal: " + goal + " calories per day");
			}
		});

		Button backButton = new Button("Back");
		backButton.setTranslateX(10);
		backButton.setTranslateY(10);
		backButton.setOnAction(e -> optionScreen(primaryStage));

		Group root = new Group(cur, tf, button, backButton, set);

		Scene scene = new Scene(root, 600, 600, Color.MINTCREAM);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void nutritionScreen(Stage primaryStage) {
		primaryStage.setTitle("Nutrition Tracking");
		// create title and add it to a HBox with the back button and the empty panes
		Text title = new Text("Nutrition Tracking");
		title.setFont(Font.font("Arial", 20));

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

		// Create back button
		Button backButton = new Button("Back");
		backButton.setOnAction(e -> optionScreen(primaryStage));
		HBox.setMargin(backButton, new Insets(10, 0, 0, 10));

		// Create layout
		BorderPane borderPane = new BorderPane();

		HBox backButtonBox = new HBox();
		backButtonBox.setAlignment(Pos.CENTER_LEFT);
		backButtonBox.getChildren().add(backButton);

		StackPane titlePane = new StackPane();
		titlePane.setAlignment(Pos.CENTER);
		titlePane.getChildren().add(title);

		HBox topBox = new HBox();
		topBox.setAlignment(Pos.CENTER);
		topBox.getChildren().addAll(backButtonBox, titlePane);
		HBox.setHgrow(titlePane, Priority.ALWAYS);

		VBox resultBox = new VBox();
		resultBox.setAlignment(Pos.CENTER);
		resultBox.getChildren().addAll(caloriesBox, totalFatBox, sodiumBox, carbohydratesBox, proteinBox);

		borderPane.setCenter(resultBox);
		borderPane.setTop(topBox);

		Scene scene = new Scene(borderPane, 375, 667, Color.WHITE);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	Button filterButton() {
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
		optionsBox.setStyle("-fx-background-color: MINTCREAM;");

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

	public void restaurantScreen(Stage primaryStage) {
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

		Button filter = filterButton();
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

		// Create back button
		Button backButton = new Button("Back");
		backButton.setOnAction(e -> optionScreen(primaryStage));
		HBox.setMargin(backButton, new Insets(10, 0, 0, 10));

		// Create layout
		BorderPane borderPane = new BorderPane();

		HBox backButtonBox = new HBox();
		backButtonBox.setAlignment(Pos.CENTER_LEFT);
		backButtonBox.getChildren().add(backButton);

		StackPane titlePane = new StackPane();
		titlePane.setAlignment(Pos.CENTER);
		titlePane.getChildren().add(title);

		HBox topBox = new HBox();
		topBox.setAlignment(Pos.CENTER);
		topBox.getChildren().addAll(backButtonBox, titlePane);
		HBox.setHgrow(titlePane, Priority.ALWAYS);

		borderPane.setPrefWidth(375);
		borderPane.setPrefHeight(667);
		borderPane.setTop(topBox);
		borderPane.setCenter(centerBox);
		borderPane.setBottom(resultBox);

		Scene scene = new Scene(borderPane, Color.MINTCREAM);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void mapScreen(Stage primaryStage) {
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

		// Create back button
		Button backButton = new Button("Back");
		backButton.setOnAction(e -> optionScreen(primaryStage));
		HBox.setMargin(backButton, new Insets(10, 0, 0, 10));

		// Create layout
		BorderPane borderPane = new BorderPane();
		borderPane.setPrefWidth(375);
		borderPane.setPrefHeight(667);

		HBox backButtonBox = new HBox();
		backButtonBox.setAlignment(Pos.CENTER_LEFT);
		backButtonBox.getChildren().add(backButton);

		StackPane titlePane = new StackPane();
		titlePane.setAlignment(Pos.CENTER);
		titlePane.getChildren().add(title);

		HBox topBox = new HBox();
		topBox.setAlignment(Pos.CENTER);
		topBox.getChildren().addAll(backButtonBox, titlePane);
		HBox.setHgrow(titlePane, Priority.ALWAYS);

		borderPane.setTop(topBox);

		VBox centerBox = new VBox();
		centerBox.setAlignment(Pos.CENTER);
		centerBox.getChildren().add(mapImageView);

		borderPane.setCenter(centerBox);
		BorderPane.setAlignment(centerBox, Pos.CENTER);

		borderPane.setBottom(resultBox);
		BorderPane.setAlignment(resultBox, Pos.CENTER);

		Scene scene = new Scene(borderPane, 375, 667, Color.MINTCREAM);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void optionScreen(Stage primaryStage) {
		Label label = new Label("Choose an option");
		label.setTranslateX(220);
		label.setTranslateY(30);
		label.setFont(new Font(25));

		int offset = 70;

		Button calories = option("Calories", 100);
		calories.setOnAction(e -> caloriesDisplay(primaryStage));

		Button nutrition_plan = option("Nutrition Plan", (int) (calories.getTranslateY() + offset));
		nutrition_plan.setOnAction(e -> nutritionScreen(primaryStage));

		Button meal_plan = option("Meal Plan", (int) (nutrition_plan.getTranslateY() + offset));
		meal_plan.setOnAction(e -> mealPlanScreen(primaryStage));

		Button change_goal = option("Change Goal", (int) (meal_plan.getTranslateY() + offset));
		change_goal.setOnAction(e -> changeGoalScreen(primaryStage));

		Button restaurant_search = option("Restaurant Search", (int) (change_goal.getTranslateY() + offset));
		restaurant_search.setOnAction(e -> restaurantScreen(primaryStage));

		Button map = option("Map", (int) (restaurant_search.getTranslateY() + offset));
		map.setOnAction(e -> mapScreen(primaryStage));

		Button backButton = new Button("Back");
		backButton.setTranslateX(10);
		backButton.setTranslateY(10);
		backButton.setOnAction(actionEvent -> {
			signinScreen(primaryStage);
		});

		Group root = new Group(label, calories, nutrition_plan, meal_plan, change_goal, restaurant_search, map,
				backButton);

		Scene scene = new Scene(root, 600, 600, Color.MINTCREAM);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	Button startButton(Stage primaryStage) {
		Button button = new Button("Start");
		button.setPrefWidth(150);
		button.setPrefHeight(50);
		button.setTranslateX(225);
		button.setTranslateY(350);
		button.setStyle("-fx-base: lightgreen");

		button.setOnAction(actionEvent -> signinScreen(primaryStage));

		return button;
	}

	Button exit() {
		Button button = new Button("Exit");
		button.setPrefWidth(150);
		button.setPrefHeight(50);
		button.setTranslateX(225);
		button.setTranslateY(425);
		button.setStyle("-fx-base: lightgreen");

		button.setOnAction(actionEvent -> System.exit(0));

		return button;
	}

	Button signInButton(Stage primaryStage, TextField email, TextField password) {
		Button button = new Button("Sign In");
		button.setPrefWidth(100);
		button.setPrefHeight(30);
		button.setStyle("-fx-base: lightgreen");
		button.setFont(Font.font("Arial", 14));
		button.setOnAction(actionEvent -> {
			// TODO add account info to database
			optionScreen(primaryStage);
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
			// TODO add account info to database
			optionScreen(primaryStage);
		});

		return button;
	}

	public void signinScreen(Stage primaryStage) {
		primaryStage.setTitle("Sign In");

		Text title = new Text("Sign In or Create an Account");
		title.setFont(Font.font("Arial", 20));

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

		// Create back button
		Button backButton = new Button("Back");
		backButton.setOnAction(e -> start(primaryStage));

		VBox titleBox = new VBox(10);
		titleBox.setAlignment(Pos.TOP_LEFT);
		titleBox.setPadding(new Insets(10, 0, 0, 10));
		titleBox.getChildren().add(backButton);

		HBox titleHBox = new HBox();
		titleHBox.setAlignment(Pos.CENTER);
		titleHBox.getChildren().add(title);
		titleHBox.setPadding(new Insets(50, 0, 50, 0));

		VBox vbox = new VBox(10);
		vbox.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(20, 30, 50, 30));
		vbox.getChildren().addAll(titleHBox, emailLabel, email, passwordLabel, password);

		Button signIn = signInButton(primaryStage, email, password);
		Button signUp = signUpButton(primaryStage);

		HBox buttonBox = new HBox(20);
		buttonBox.setPadding(new Insets(0, 30, 50, 30));
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.getChildren().addAll(signIn, signUp);

		BorderPane borderPane = new BorderPane();
		borderPane.setPrefWidth(300);
		borderPane.setPrefHeight(600);
		borderPane.setPadding(new Insets(0, 0, 20, 0));
		borderPane.setTop(titleBox);
		borderPane.setCenter(vbox);
		borderPane.setBottom(buttonBox);

		Scene scene = new Scene(borderPane, 375, 667, Color.MINTCREAM);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	@Override
	public void start(Stage primaryStage) {
		
		createdb();
		
		primaryStage.setTitle("Welcome to the Fitness and Nutrition Buddy!");

		Text text = new Text("Fitness and Nutrition Buddy");
		text.setTranslateX(150);
		text.setTranslateY(150);
		text.setFont(Font.font(25));
		DropShadow shadow = new DropShadow();
		text.setEffect(shadow);

		Button start = startButton(primaryStage);
		Button exit = exit();

		// set background image
		String image = "https://www.creativefabrica.com/wp-content/uploads/2021/01/15/Watercolor-Dark-Green-Background-Graphics-7806036-1.jpg";
		BackgroundImage bi = new BackgroundImage(new Image(image, 600, 300, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		Background bg = new Background(bi);
		BorderPane bp = new BorderPane();
		bp.setPrefWidth(600);
		bp.setPrefHeight(300);
		bp.setBackground(bg);

		Group root = new Group(start, exit, bp, text);

		Scene scene = new Scene(root, 600, 600, Color.MINTCREAM);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public class Create{  
		
		String name;
		String speciality;
		String location;
		
		public Create(String n, String s, String l) {
			this.name = n;
			this.speciality = s;
			this.location = l;
		}
	}
}


