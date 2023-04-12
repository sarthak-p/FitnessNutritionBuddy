import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MyTest {
	
	static UserInfo users;
	static ResturantInfo restaurants;
	static MealsInfo meals;
	
	
	@BeforeAll
	static void setup(){
		users = new UserInfo ("john@gmail.com", "abcd", "John Smith" , "Male", 19, 170, 151, 2571, 352, 86, 98);
		restaurants = new ResturantInfo("Kenya's Keto Kitchen", "Keto", "Chicago", "3101 W Lake St", "IL 60612");
		Meal m1 = new Meal("Kenya's Keto Kitchen - Chicago, IL", 400, "Eggs, bacon, avocado");
        Meal m2 = new Meal("Kenya's Keto Kitchen - Chicago, IL", 600, "Grilled chicken salad");
        Meal m3 = new Meal("Kenya's Keto Kitchen - Chicago, IL", 800, "Grilled salmon with steamed vegetables");
        meals = new MealsInfo("Kenya's Keto Kitchen", "Keto", "Chicago, IL", m1,m2,m3);
	}
	
	@Test
	void UserInfo_test1 () {
		assertEquals("john@gmail.com", users.email, "User email test");
	}

	@Test
	void UserInfo_test2 () {
		assertEquals("abcd", users.password, " User password test");
	}
	
	@Test
	void UserInfo_test3 () {
		assertEquals("John Smith", users.name, "User name test");
	}
	
	@Test
	void UserInfo_test4 () {
		assertEquals(19, users.age, "User age test");
	}

	@Test
	void UserInfo_test5 () {
		assertEquals(170, users.height, "User height test");
	}
	
	@Test
	void RestaurantInfo_test1 () {
		assertEquals("Kenya's Keto Kitchen", restaurants.name, "Restaurant name test");
	}
	@Test
	void RestaurantInfo_test2 () {
		assertEquals("Keto", restaurants.specialty, "Restaurant specialty test");
	}
	@Test
	void RestaurantInfo_test3 () {
		assertEquals("Chicago", restaurants.location, "Restaurant location test");
	}
	@Test
	void RestaurantInfo_test4 () {
		assertEquals("3101 W Lake St", restaurants.street, "Restaurant street test");
	}
	@Test
	void RestaurantInfo_test5 () {
		assertEquals("IL 60612", restaurants.state_zip, "Restaurant state zip test");
	}
	
	@Test
	void MealtInfo_test1 () {
		assertEquals("Kenya's Keto Kitchen", meals.name, "Meal name test");
	}
	@Test
	void MealtInfo_test2 () {
		assertEquals("Keto", meals.speciality, "Meal specialty test");
	}
	@Test
	void MealtInfo_test3 () {
		assertEquals("Chicago, IL", meals.location, "Meal location test");
	}
	@Test
	void MealtInfo_test4 () {
		assertEquals("Eggs, bacon, avocado", meals.breakfast.getDescription(), "Meal breakfast test");
	}
	@Test
	void MealtInfo_test5 () {
		assertEquals("Kenya's Keto Kitchen - Chicago, IL", meals.lunch.getName(), "Meal lunch test");
	}
	@Test
	void MealtInfo_test6 () {
		assertEquals(800, meals.dinner.getCalories(), "Meal dinner test");
	}


}
