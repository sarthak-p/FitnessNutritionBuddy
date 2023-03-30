import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FitnessStart extends Application {
	UserInfo user;
	ArrayList<UserInfo> userList;
//	ResturantInfo resturants = new ResturantInfo();
	TextField email;
	TextField password;
	TextField name;
	TextField gender;
	TextField age;
	TextField height;
	TextField weight;

	public static void main(String[] args) {
		launch(args);
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
		label.setTranslateX(50);
		label.setTranslateY(y);
		label.setFont(new Font(20));

		return label;
	}

	public void caloriesDisplay(Stage primaryStage) {
		Label label = new Label("Macros Tracking");
		label.setTranslateX(100);
		label.setTranslateY(30);
		label.setFont(new Font(25));

		Label calories = createLabel( user.calorie + " Calories allowed", 250);
		Label carb = createLabel(user.carb + " g of carbs allowed", 300);
		Label protein  = createLabel(user.protein + " g of protein allowed", 350);
		Label fat = createLabel(user.fat + " g of fat allowed", 400);

		// set background image
		String image = "https://assets.justinmind.com/wp-content/uploads/2018/09/green-progress-bar.png";
		BackgroundImage bi = new BackgroundImage(new Image(image, 300, 300, false, true),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
				BackgroundSize.DEFAULT);
		Background bg = new Background(bi);
		BorderPane bp = new BorderPane();
		bp.setPrefWidth(300);
		bp.setPrefHeight(300);
		bp.setBackground(bg);

		Button backButton = new Button("Back");
		backButton.setTranslateX(10);
		backButton.setTranslateY(10);
		backButton.setOnAction(e -> optionScreen(primaryStage));

		Group root = new Group(bp, label, calories, protein, fat, carb, backButton);

		Scene scene = new Scene(root, 300, 600, Color.MINTCREAM);
		primaryStage.setTitle("Macros Tracking");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	int goal = 1000;

	public Meal getRandomMeal(MealsInfo[] restaurants, String filter) {
		// Filter the restaurants based on the selected filter
		List<MealsInfo> filteredRestaurants = Arrays.stream(restaurants)
				.filter(restaurant -> filter.equals("All") ||
						restaurant.speciality.equals(filter))
				.collect(Collectors.toList());

		if (filteredRestaurants.isEmpty()) {
			return null;
		}

		// Select a random restaurant from the filtered list
		MealsInfo restaurant = filteredRestaurants.get((int) (Math.random() *
				filteredRestaurants.size()));

		// Select a random meal from the restaurant
		Meal[] meals = { restaurant.breakfast, restaurant.lunch, restaurant.dinner };
		Meal meal = meals[(int) (Math.random() * meals.length)];

		return meal;
	}

	private void updateMealLabels(MealsInfo[] restaurants, String filter, Label breakfast, Label lunch, Label dinner) {
		int totalCalories = 0;
		Meal[] selectedMeals = new Meal[3];

		// Select random meals until their total calories exceed `goal`
		while (totalCalories <= goal) {
			// Select a random meal for breakfast, lunch, and dinner
			Meal breakfastMeal = getRandomMeal(restaurants, filter);
			Meal lunchMeal = getRandomMeal(restaurants, filter);
			Meal dinnerMeal = getRandomMeal(restaurants, filter);

			// If any of the meals are null, it means there aren't enough meals for the
			// selected filter
			if (breakfastMeal == null || lunchMeal == null || dinnerMeal == null) {
				break;
			}

			// Calculate the total calories of the three meals
			totalCalories = breakfastMeal.getCalories() + lunchMeal.getCalories() +
					dinnerMeal.getCalories();

			// Save the selected meals
			selectedMeals[0] = breakfastMeal;
			selectedMeals[1] = lunchMeal;
			selectedMeals[2] = dinnerMeal;
		}

		// Update the meal labels
		if (totalCalories > goal) {
			breakfast.setText("Breakfast:\n" + selectedMeals[0].getDescription() + "\n" +
					selectedMeals[0].getCalories()
					+ " calories" + "\n" + "From Restaurant: " + "\n" +
					selectedMeals[0].getName());
			lunch.setText(
					"Lunch:\n" + selectedMeals[1].getDescription() + "\n" +
							selectedMeals[1].getCalories()
							+ " calories" + "\n" + "From Restaurant: " + "\n" +
							selectedMeals[1].getName());
			dinner.setText(
					"Dinner:\n" + selectedMeals[2].getDescription() + "\n" +
							selectedMeals[2].getCalories()
							+ " calories" + "\n" + "From Restaurant: " + "\n" +
							selectedMeals[2].getName());
		} else {
			breakfast.setText("Not enough meal options available for the selected filter.");
			lunch.setText("");
			dinner.setText("");
		}
	}

	public void mealPlanScreen(Stage primaryStage) {
		MealsInfo[] restaurants = new MealsInfo().get_restaurant_array();

		Text title = new Text("Meal Plan");
		title.setFont(Font.font("Arial", 25));
		title.setX(220);
		title.setY(30);

		Label breakfast = createLabel("Breakfast:\n", 100);
		breakfast.setFont(Font.font("Arial", 17));
		Label lunch = createLabel("Lunch:\n", 260);
		lunch.setFont(Font.font("Arial", 17));
		Label dinner = createLabel("Dinner:\n", 420);
		dinner.setFont(Font.font("Arial", 17));

		Button backButton = new Button("Back");
		backButton.setFont(Font.font("Arial", 14));
		backButton.setTranslateX(10);
		backButton.setTranslateY(10);
		backButton.setOnAction(e -> optionScreen(primaryStage));

		// Filter ComboBox
		ComboBox<String> filterOptions = new ComboBox<>();
		filterOptions.getItems().addAll("All", "Keto", "Vegan", "Paleo", "Low Carb",
				"Gluten Free");
		filterOptions.setValue("All");
		filterOptions.setTranslateX(480);
		filterOptions.setTranslateY(50);

		filterOptions.setOnAction(e -> {
			String filter = filterOptions.getValue();
			updateMealLabels(restaurants, filter, breakfast, lunch, dinner);
		});

		String initialFilter = filterOptions.getValue();
		updateMealLabels(restaurants, initialFilter, breakfast, lunch, dinner);

		Button newPlanButton = new Button("New Plan");
		newPlanButton.setFont(Font.font("Arial", 14));
		newPlanButton.setTranslateX(510);
		newPlanButton.setTranslateY(10);
		newPlanButton.setOnAction(e -> {
			String currentFilter = filterOptions.getValue();
			updateMealLabels(restaurants, currentFilter, breakfast, lunch, dinner);
		});
		Group root = new Group(title, breakfast, lunch, dinner, backButton,
				newPlanButton, filterOptions);

		Scene scene = new Scene(root, 675, 600, Color.MINTCREAM);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	int cal_goal = 2000;

	public void changeGoalScreen(Stage primaryStage) {
		Label cur = new Label("Current goal: " + user.calorie + " calories per day");
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
			cal_goal = Integer.parseInt(tf.getText());
			if (cal_goal < 1000) {
				set.setText("Goal is too low, try again");
			} else {
				set.setText("Goal set!");
				double prop = (double) cal_goal / (double) user.calorie;
				user.calorie = cal_goal;
				user.protein *= prop;
				user.carb *= prop;
				user.fat *= prop;
				cur.setText("Current goal: " + user.calorie + " calories per day");
			}
		});

		Button backButton = new Button("Back");
		backButton.setTranslateX(10);
		backButton.setTranslateY(10);
		backButton.setOnAction(e -> optionScreen(primaryStage));

		Group root = new Group(cur, tf, button, backButton, set);

		Scene scene = new Scene(root, 600, 600, Color.MINTCREAM);
		primaryStage.setTitle("Change goal");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private static int caloriesValue = 0;
	private static int totalFatValue = 0;
	private static int sodiumValue = 0;
	private static int carbohydratesValue = 0;
	private static int proteinValue = 0;
	private final String caloriesUnit = " kcal";
	private String totalFatUnit = " g";
	private String sodiumUnit = " mg";
	private String carbohydratesUnit = " g";
	private String proteinUnit = " g";

	public void nutritionScreen(Stage primaryStage) {
		primaryStage.setTitle("Nutrition Tracking");

		Text title = new Text("Nutrition Tracking");
		title.setFont(Font.font("Arial", 25));
		title.setX(120);
		title.setY(40);

		Text caloriesLabel = new Text("Calories: " + caloriesValue);
		caloriesLabel.setFont(Font.font("Arial", 20));
		caloriesLabel.setX(65);
		caloriesLabel.setY(180);

		TextField caloriesInput = new TextField();
		caloriesInput.setPrefWidth(50);
		caloriesInput.setLayoutX(250);
		caloriesInput.setLayoutY(160);
		caloriesInput.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				caloriesValue += Integer.parseInt(caloriesInput.getText().trim());
				caloriesLabel.setText("Calories: " + caloriesValue + caloriesUnit);
				caloriesInput.setVisible(false);
				caloriesLabel.setVisible(true);
			}
		});

		Text totalFatLabel = new Text("Total Fat: " + totalFatValue);
		totalFatLabel.setFont(Font.font("Arial", 20));
		totalFatLabel.setX(65);
		totalFatLabel.setY(265);

		TextField fatInput = new TextField();
		fatInput.setPrefWidth(50);
		fatInput.setLayoutX(250);
		fatInput.setLayoutY(245);
		fatInput.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				totalFatValue += Integer.parseInt(fatInput.getText().trim());
				totalFatLabel.setText("Total Fat: " + totalFatValue + totalFatUnit);
				fatInput.setVisible(false);
				totalFatLabel.setVisible(true);
			}
		});

		Text sodiumLabel = new Text("Sodium: " + sodiumValue);
		sodiumLabel.setFont(Font.font("Arial", 20));
		sodiumLabel.setX(65);
		sodiumLabel.setY(345);

		TextField sodiumInput = new TextField();
		sodiumInput.setPrefWidth(50);
		sodiumInput.setLayoutX(250);
		sodiumInput.setLayoutY(325);
		sodiumInput.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				sodiumValue += Integer.parseInt(fatInput.getText().trim());
				sodiumLabel.setText("Sodium: " + sodiumValue + sodiumUnit);
				sodiumInput.setVisible(false);
				sodiumLabel.setVisible(true);
			}
		});

		Text carbohydratesLabel = new Text("Carbohydrates: " + carbohydratesValue);
		carbohydratesLabel.setFont(Font.font("Arial", 20));
		carbohydratesLabel.setX(65);
		carbohydratesLabel.setY(420);

		TextField carbohydratesInput = new TextField();
		carbohydratesInput.setPrefWidth(50);
		carbohydratesInput.setLayoutX(250);
		carbohydratesInput.setLayoutY(400);
		carbohydratesInput.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				carbohydratesValue += Integer.parseInt(carbohydratesInput.getText().trim());
				carbohydratesLabel.setText("Carbohydrates: " + carbohydratesValue + carbohydratesUnit);
				carbohydratesInput.setVisible(false);
				carbohydratesLabel.setVisible(true);
			}
		});

		Text proteinLabel = new Text("Protein: " + proteinValue);
		proteinLabel.setFont(Font.font("Arial", 20));
		proteinLabel.setX(65);
		proteinLabel.setY(500);

		TextField proteinInput = new TextField();
		proteinInput.setPrefWidth(50);
		proteinInput.setLayoutX(250);
		proteinInput.setLayoutY(480);
		proteinInput.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				proteinValue += Integer.parseInt(proteinInput.getText().trim());
				proteinLabel.setText("Protein: " + proteinValue + proteinUnit);
				proteinInput.setVisible(false);
				proteinLabel.setVisible(true);
			}
		});

		Button changeButton = new Button("Add");
		changeButton.setLayoutX(160);
		changeButton.setLayoutY(80);
		changeButton.setOnAction(e -> {
			caloriesInput.setVisible(true);
			fatInput.setVisible(true);
			sodiumInput.setVisible(true);
			carbohydratesInput.setVisible(true);
			proteinInput.setVisible(true);
		});

		Button resetButton = new Button("Reset");
		resetButton.setLayoutX(155);
		resetButton.setLayoutY(570);
		resetButton.setOnAction(e -> {
			caloriesValue = 0;
			caloriesLabel.setText("Calories: " + caloriesValue + caloriesUnit);

			totalFatValue = 0;
			totalFatLabel.setText("Total Fat: " + totalFatValue + totalFatUnit);

			sodiumValue = 0;
			sodiumLabel.setText("Sodium: " + sodiumValue + sodiumUnit);

			carbohydratesValue = 0;
			carbohydratesLabel.setText("Carbohydrates: " + carbohydratesValue + carbohydratesUnit);

			proteinValue = 0;
			proteinLabel.setText("Protein: " + proteinValue + proteinUnit);

			caloriesInput.setVisible(false);
			fatInput.setVisible(false);
			sodiumInput.setVisible(false);
			carbohydratesInput.setVisible(false);
			proteinInput.setVisible(false);
		});

		caloriesInput.setVisible(false);
		fatInput.setVisible(false);
		sodiumInput.setVisible(false);
		carbohydratesInput.setVisible(false);
		proteinInput.setVisible(false);

		Button backButton = new Button("Back");
		backButton.setLayoutX(20);
		backButton.setLayoutY(20);
		backButton.setOnAction(e -> optionScreen(primaryStage));

		Group root = new Group(title, caloriesLabel, totalFatLabel, sodiumLabel,
				carbohydratesLabel, proteinLabel, backButton, caloriesInput, fatInput,
				sodiumInput, carbohydratesInput, proteinInput, changeButton, resetButton);

		caloriesLabel.setText("Calories: " + caloriesValue + caloriesUnit);
		totalFatLabel.setText("Total Fat: " + totalFatValue + totalFatUnit);
		sodiumLabel.setText("Sodium: " + sodiumValue + sodiumUnit);
		carbohydratesLabel.setText("Carbohydrates: " + carbohydratesValue + carbohydratesUnit);
		proteinLabel.setText("Protein: " + proteinValue + proteinUnit);

		Scene scene = new Scene(root, 375, 667, Color.WHITE);
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

		Button calories = option("Macros", 100);
		calories.setOnAction(e -> caloriesDisplay(primaryStage));

		Button nutrition_plan = option("Nutrition Tracking", (int) (calories.getTranslateY() + offset));
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
		backButton.setOnAction(actionEvent -> signinScreen(primaryStage));

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
			// find account info in database
			String email_input =  email.getText();
			String password_input =  password.getText();
			for (UserInfo i : userList){
				//If email and password is correct
				if (i.check_email(email_input) && i.check_password(password_input)){
					user = i;
					optionScreen(primaryStage);
				}
			}
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
			// add account info to database
			signUpScreen(primaryStage);
		});
		return button;
	}

	public void signUpScreen(Stage primaryStage) {
		primaryStage.setTitle("Sign Up");

		Text title = new Text("Enter Sign Up information");
		title.setFont(Font.font("Arial", 20));

		Label emailLabel = new Label("Email:");
		email = new TextField();
		emailLabel.setFont(Font.font("Arial", 15));
		email.setFont(Font.font("Arial", 15));
		email.setPrefWidth(200);

		Label passwordLabel = new Label("Password:");
		password = new TextField();
		passwordLabel.setFont(Font.font("Arial", 15));
		password.setFont(Font.font("Arial", 15));
		password.setPrefWidth(200);

		Label NameLabel = new Label("Name:");
		name = new TextField();
		NameLabel.setFont(Font.font("Arial", 15));
		name.setFont(Font.font("Arial", 15));
		name.setPrefWidth(200);

		Label GenderLabel = new Label("Gender:");
		gender = new TextField();
		GenderLabel.setFont(Font.font("Arial", 15));
		gender.setFont(Font.font("Arial", 15));
		gender.setPrefWidth(200);

		Label AgeLabel = new Label("Age:");
		age = new TextField();
		AgeLabel.setFont(Font.font("Arial", 15));
		age.setFont(Font.font("Arial", 15));
		age.setPrefWidth(200);

		Label HeightLabel = new Label("Height:");
		height = new TextField();
		HeightLabel.setFont(Font.font("Arial", 15));
		height.setFont(Font.font("Arial", 15));
		height.setPrefWidth(200);

		Label WeightLabel = new Label("Weight:");
		weight = new TextField();
		WeightLabel.setFont(Font.font("Arial", 15));
		weight.setFont(Font.font("Arial", 15));
		weight.setPrefWidth(200);

		// Create back button
		Button backButton = new Button("Back");
		backButton.setOnAction(e -> {
			try {
				start(primaryStage);
			} catch (SQLException ex) {
				throw new RuntimeException(ex);
			}
		});

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
		vbox.getChildren().addAll(titleHBox, emailLabel, email, passwordLabel, password, NameLabel, name, GenderLabel, gender, AgeLabel, age, HeightLabel, height, WeightLabel, weight);

		Button signUp2 = new Button("Sign up");
		signUp2.setPrefWidth(100);
		signUp2.setPrefHeight(30);
		signUp2.setStyle("-fx-base: lightgreen");
		signUp2.setFont(Font.font("Arial", 14));
		signUp2.setOnAction(actionEvent -> {
			// add account info to database
			String email_input =  email.getText();
			String password_input =  password.getText();
			String name_input =  name.getText();
			String gender_input =  gender.getText();
			int age_input =  Integer.parseInt(age.getText());
			int height_input =  Integer.parseInt(height.getText());
			int weight_input =  Integer.parseInt(weight.getText());
			userList.add(new UserInfo(email_input, password_input, name_input, gender_input, age_input, height_input, weight_input,2000,250,65,120));
			user = userList.get(userList.size() - 1);
			optionScreen(primaryStage);
		});


		HBox buttonBox = new HBox(20);
		buttonBox.setPadding(new Insets(0, 30, 50, 30));
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.getChildren().addAll(signUp2);

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

	public void signinScreen(Stage primaryStage) {
		primaryStage.setTitle("Sign In");

		Text title = new Text("Log in or Sign up");
		title.setFont(Font.font("Arial", 20));

		Label emailLabel = new Label("Email:");
		email = new TextField();
		emailLabel.setFont(Font.font("Arial", 15));
		email.setFont(Font.font("Arial", 15));
		email.setPrefWidth(200);

		Label passwordLabel = new Label("Password:");
		password = new TextField();
		passwordLabel.setFont(Font.font("Arial", 15));
		password.setFont(Font.font("Arial", 15));
		password.setPrefWidth(200);

		userList = new ArrayList<>(Arrays.asList(UserInfo.createUserList()));

		// Create back button
		Button backButton = new Button("Back");
		backButton.setOnAction(e -> {
			try {
				start(primaryStage);
			} catch (SQLException ex) {
				throw new RuntimeException(ex);
			}
		});

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
	public void start(Stage primaryStage) throws SQLException {
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
		String image = "data:image/jpeg;base64,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";
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
}