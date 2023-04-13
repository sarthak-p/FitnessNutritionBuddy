	private static final double minLatitude = 41.6600;
	private static final double maxLatitude = 42.0500;
	private static final double minLongitude = -88.3400;
	private static final double maxLongitude = -87.6200;

	public void mapScreen(Stage primaryStage) {

		Random random = new Random();
		Label instruction = new Label("Enter Location:");
		instruction.setTranslateX(100);
		instruction.setTranslateY(80);
		instruction.setFont(Font.font("Arial", 20));

		TextField locationField = new TextField();
		locationField.setPrefWidth(250);
		locationField.setTranslateX(100);
		locationField.setTranslateY(120);

		// Create a canvas to draw a simple static map
		Canvas canvas = new Canvas(350, 350);
		canvas.setTranslateX(100);
		canvas.setTranslateY(200);
		GraphicsContext gc = canvas.getGraphicsContext2D();

		Label results = new Label("Search Results:");
		results.setTranslateX(550);
		results.setTranslateY(120);
		results.setFont(Font.font("Arial", 20));

		VBox searchResultsBox = new VBox();
		searchResultsBox.setTranslateX(550);
		searchResultsBox.setTranslateY(200);
		searchResultsBox.setSpacing(10);

		// Draw a simple rectangle to represent the map
		gc.setStroke(Color.BLACK);
		gc.strokeRect(0, 0, 350, 350);
		gc.setFill(Color.LIGHTBLUE);
		gc.fillRect(1, 1, 348, 348);

		Button searchButton = new Button("Search");
		searchButton.setFont(Font.font("Arial", 14));
		searchButton.setTranslateX(380);
		searchButton.setTranslateY(120);
		searchButton.setOnAction(actionEvent -> {
			String location = locationField.getText();

			// Clear the map
			gc.setFill(Color.LIGHTBLUE);
			gc.fillRect(1, 1, 348, 348);

			// Clear previous search results
			searchResultsBox.getChildren().clear();

			ResturantInfo[] allRestaurants = ResturantInfo.get_resturant_array();

			int resultNumber = 1;
			for (ResturantInfo restaurant : allRestaurants) {
				if (restaurant.location.equalsIgnoreCase(location)) {
					// Normalize the latitudes and longitudes to fit the canvas dimensions
					double x = (restaurant.longitude - minLongitude) / (maxLongitude - minLongitude) * 280 + 10;
					double y = (restaurant.latitude - minLatitude) / (maxLatitude - minLatitude) * 280 + 10;

					// Add a random offset to space the markers
					double offsetX = (random.nextDouble() * 20) - 10;
					double offsetY = (random.nextDouble() * 20) - 10;

					// Draw a circle to represent the restaurant marker
					gc.setFill(Color.RED);
					gc.fillOval(x + offsetX, y + offsetY, 20, 20);

					gc.setFill(Color.WHITE);
					gc.setFont(Font.font("Arial", FontWeight.BOLD, 12));
					gc.fillText(String.valueOf(resultNumber), x + offsetX + 6, y + offsetY + 14);

					// Add the restaurant to the search results
					Label resultLabel = new Label(resultNumber + ". " + restaurant.name);
					resultLabel.setFont(Font.font("Arial", FontWeight.NORMAL, 14));
					searchResultsBox.getChildren().add(resultLabel);
					resultNumber++;
				}
			}
		});

		// Add a mouse event listener to the canvas
		canvas.setOnMouseClicked(mouseEvent -> {
			double mouseX = mouseEvent.getX();
			double mouseY = mouseEvent.getY();

			ResturantInfo[] allRestaurants = ResturantInfo.get_resturant_array();

			for (ResturantInfo restaurant : allRestaurants) {
				if (restaurant.location.equalsIgnoreCase(locationField.getText())) {
					// Normalize the latitudes and longitudes to fit the canvas dimensions
					double x = (restaurant.longitude - minLongitude) / (maxLongitude - minLongitude) * 280 + 10;
					double y = (restaurant.latitude - minLatitude) / (maxLatitude - minLatitude) * 280 + 10;

					// Check if the click is within the bounds of a restaurant marker
					if (Math.sqrt(Math.pow(mouseX - x, 2) + Math.pow(mouseY - y, 2)) <= 20) {
						// Create a popup displaying the restaurant details
						Stage popup = new Stage();
						popup.initModality(Modality.APPLICATION_MODAL);
						popup.initStyle(StageStyle.UTILITY);
						popup.initOwner(primaryStage);
						popup.setTitle("Restaurant Details");

						Label nameLabel = new Label("Name: " + restaurant.name);
						nameLabel.setFont(Font.font("Arial"));
						Label specialityLabel = new Label("Speciality: " + restaurant.speciality);
						specialityLabel.setFont(Font.font("Arial"));
						Label locationLabel = new Label("Location: " + restaurant.location);
						locationLabel.setFont(Font.font("Arial"));
						VBox popupContent = new VBox(10, nameLabel, specialityLabel, locationLabel);
						popupContent.setPadding(new Insets(10, 10, 10, 10));
						popupContent.setAlignment(Pos.CENTER);

						Scene popupScene = new Scene(popupContent, 300, 150);
						popup.setScene(popupScene);
						popup.showAndWait();
						break;
					}
				}
			}
		});

		Button backButton = new Button("Back");
		backButton.setTranslateX(10);
		backButton.setTranslateY(10);
		backButton.setOnAction(e -> optionScreen(primaryStage));

		Group root = new Group(instruction, locationField, searchButton, backButton, canvas, searchResultsBox, results);

		Scene scene = new Scene(root, 800, 600, Color.MINTCREAM);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
