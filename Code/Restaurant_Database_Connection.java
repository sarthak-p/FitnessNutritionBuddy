import java.sql.Connection;  
import java.sql.DriverManager; 
import java.sql.DatabaseMetaData; 
import java.sql.SQLException; 
import java.sql.Statement;  
   
public class Database {  
  public Connection con;

  //Construction
  public Database(){
    try{
      String url = "jdbc:sqlite:C:/sqlite/JTP.db";    
      this.con = DriverManager.getConnection(url);
    }
    catch (SQLException e) {  
      //Handle later
    }
  }

  //Create table 
  public void createRestaurantTable() {    
    // SQL statement for creating a new table  
    String create_table = "CREATE TABle resturants(id INTEGER Primary Key AUTOINCREMENT, name STRING, speciality STRING, location STRING)";  
    String addr1 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Kenya's Keto Kitchen" + ", " + "Keto" + ", "+ "Chicago, IL"+ ")";
    String addr2 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Dirty Root"+  ", " + "Low Carb" + ", " + "Chicago, IL";
    String addr3 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "CRAFT Donuts + Coffee" +", " + "Keto" + ", " + "Chicago, IL" + ")";
    String addr4 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Tweet" + ", " + "Low Carb" + ", " + "Chicago, IL" + ")";
    String addr5 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "The Eating Well" + ", " + "Vegan" + ", " + "Schaumburg, IL" + ")";
    String addr6 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "True Food Kitchen" + ", " + "Vegan" + ", " + "Oak Brook, IL" + ")";
    String addr7 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Kale My Name" + ", " + "Vegan" + ", " + "Chicago, IL" + ")";
    String addr8 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "The Water Bar" + ", " + "Gluten Free" + ", " + "Geneva, IL" + ")";
    String addr9 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Alice and Friends Vegan Kitchen" + ", " + "Vegan" + ", " + "Chicago, IL" + ")";
    String addr10 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Victus Foods" + ", " + "Paleo" + ", " + "Chicago, IL" + ")";
    String addr11 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "THAI GARDEN" + ", " + "Paleo" + ", " + "Chicago, IL" + ")";
    String addr12 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Protien Bar and Kitchen" + ", " + "Low Carb" + ", " + "Chicago, IL" + ")";
    String addr13 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Purple Sprout Concious Organic" + ", " + "Vegan" + ", " + "Chicago, IL" + ")";
    String addr14 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Fittingly Delicious" + ", " + "Low Carb" + ", " + "Chicago, IL" + ")";
    String addr15 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Harvest Room" + ", " + "Vegan" + ", " + "Palos Heights, IL" + ")";
    String addr16 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Sweet Natalies Gluten Free Bakery/Baby Doll Bakery" + ", " + "Gluten Free" + ", " + "Wheaton, IL" + ")";
    String addr17 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Da Luciano's" + ", " + "Gluten Free" + ", " + "Rivers Grove" + ")";
    String addr18 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Wheat's End Cafe & Bakery" + ", " + "Gluten Free" + ", " + "Bartlett, IL" + ")";
    String addr19 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Augustino's Rock and Roll Deli and Grill" + ", " + "Gluten Free" + ", " + "Bartlett, IL" + ")";
    String addr20 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Maggiano's Little Italy" + ", " + "Gluten Free" + ", " + "Schaumburg, IL" + ")";
    String addr21 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Moretti's" + ", " + "Gluten Free" + ", " + "Bartlett, IL" + ")";
    String addr22 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Nature's Best Cafe" + ", " + "Vegan" + ", " + "Naperville, IL" + ")";
    String addr23 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "sweetgreen" + ", " + "Low Protien" + ", " + "Schaumburg" + ")";
    String addr24 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Low Carb Kitchen" + ", " + "Low Carb" + ", " + "Downers Grove, IL" + ")";
    String addr25 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Egg Harbor Cafe" + ", " + "Gluten Free" + ", " + "Naperville, IL" + ")";
    String addr26 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Panera Bread" + ", " + "Keto" + ", " + "Chicago, IL" + ")";
    String addr27 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Panera Bread" + ", " + "Keto" + ", " + "Berwyn, IL" + ")";
    String addr28 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Panera Bread" + ", " + "Keto" + ", " + "River Forest, IL" + ")";
    String addr29 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Panera Bread" + ", " + "Keto" + ", " + "Emlwood Park, IL" + ")";
    String addr30 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Panera Bread" + ", " + "Keto" + ", " + "Norridge, IL" + ")";
    String addr31 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Panera Bread" + ", " + "Keto" + ", " + "Oak Lawn, IL" + ")";
    String addr32 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Taco Bell" + ", " + "Keto" + ", " + "Chicago, IL" + ")";
    String addr33 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Taco Bell" + ", " + "Keto" + ", " + "Hanover Park, IL" + ")";
    String addr34 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Taco Bell" + ", " + "Keto" + ", " + "Addison, IL" + ")";
    String addr35 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Taco Bell" + ", " + "Keto" + ", " + "Aurora, IL" + ")";
    String addr36 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Chili's Grill & Bar" + ", " + "Keto" + ", " + "Aurora, IL" + ")";
    String addr37 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Chili's Grill & Bar" + ", " + "Keto" + ", " + "Bolingbrook, IL" + ")";
    String addr38 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Chili's Grill & Bar" + ", " + "Keto" + ", " + "Naperville, IL" + ")";
    String addr39 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Chili's Grill & Bar" + ", " + "Keto" + ", " + "Oswego, IL" + ")";
    String addr40 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Chili's Grill & Bar" + ", " + "Keto" + ", " + "Plainfield, IL" + ")";
    String addr41 = "INSERT INTO resturants (name, speciality, location) VALUES(" + "Chili's Grill & Bar" + ", " + "Keto" + ", " + "Batavia, IL" + ")";
    
      
    try{    
        Statement stmt = this.con.createStatement();  
        stmt.execute(create_table);
        stmt.execute(addr1);
        stmt.execute(addr2);
        stmt.execute(addr3);
        stmt.execute(addr4);
        stmt.execute(addr5);
        stmt.execute(addr6);
        stmt.execute(addr7);
        stmt.execute(addr8);
        stmt.execute(addr9);
        stmt.execute(addr10);
        stmt.execute(addr11);
        stmt.execute(addr12);
        stmt.execute(addr13);
        stmt.execute(addr14);
        stmt.execute(addr15);
        stmt.execute(addr16);
        stmt.execute(addr17);
        stmt.execute(addr18);
        stmt.execute(addr19);
        stmt.execute(addr20);
        stmt.execute(addr21);
        stmt.execute(addr22);
        stmt.execute(addr23);
        stmt.execute(addr24);
        stmt.execute(addr25);
        stmt.execute(addr26);
        stmt.execute(addr27);
        stmt.execute(addr28);
        stmt.execute(addr29);
        stmt.execute(addr30);
        stmt.execute(addr31);
        stmt.execute(addr32);
        stmt.execute(addr33);
        stmt.execute(addr34);
        stmt.execute(addr35);
        stmt.execute(addr36);
        stmt.execute(addr37);
        stmt.execute(addr38);
        stmt.execute(addr39);
        stmt.execute(addr40);
        stmt.execute(addr41);
    } catch (SQLException e) {  
        //Handle   
    }  
  }
}