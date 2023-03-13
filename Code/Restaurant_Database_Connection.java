import java.sql.Connection;  
import java.sql.DriverManager; 
import java.sql.DatabaseMetaData; 
import java.sql.SQLException; 
import java.sql.Statement;
import java.sql.PreparedStatement;
   
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
        PreparedStatement pstmt1 = conn.prepareStatement(addr1); 
        PreparedStatement pstmt2 = conn.prepareStatement(addr2); 
        PreparedStatement pstmt3 = conn.prepareStatement(addr3); 
        PreparedStatement pstmt4 = conn.prepareStatement(addr4); 
        PreparedStatement pstmt5 = conn.prepareStatement(addr5);
        PreparedStatement pstmt6 = conn.prepareStatement(addr6); 
        PreparedStatement pstmt7 = conn.prepareStatement(addr7); 
        PreparedStatement pstmt8 = conn.prepareStatement(addr8); 
        PreparedStatement pstmt9 = conn.prepareStatement(addr9);
        PreparedStatement pstmt10 = conn.prepareStatement(addr10); 
        PreparedStatement pstmt11 = conn.prepareStatement(addr11); 
        PreparedStatement pstmt12 = conn.prepareStatement(addr12); 
        PreparedStatement pstmt13 = conn.prepareStatement(addr13);
        PreparedStatement pstmt14 = conn.prepareStatement(addr14); 
        PreparedStatement pstmt15 = conn.prepareStatement(addr15); 
        PreparedStatement pstmt16 = conn.prepareStatement(addr16); 
        PreparedStatement pstmt17 = conn.prepareStatement(addr17);
        PreparedStatement pstmt18 = conn.prepareStatement(addr18); 
        PreparedStatement pstmt19 = conn.prepareStatement(addr19); 
        PreparedStatement pstmt20 = conn.prepareStatement(addr20); 
        PreparedStatement pstmt21 = conn.prepareStatement(addr21);
        PreparedStatement pstmt22 = conn.prepareStatement(addr22); 
        PreparedStatement pstmt23 = conn.prepareStatement(addr23); 
        PreparedStatement pstmt24 = conn.prepareStatement(addr24); 
        PreparedStatement pstmt25 = conn.prepareStatement(addr25);
        PreparedStatement pstmt26 = conn.prepareStatement(addr26); 
        PreparedStatement pstmt27 = conn.prepareStatement(addr27); 
        PreparedStatement pstmt28 = conn.prepareStatement(addr28); 
        PreparedStatement pstmt29 = conn.prepareStatement(addr29);
        PreparedStatement pstmt30 = conn.prepareStatement(addr30); 
        PreparedStatement pstmt31 = conn.prepareStatement(addr31); 
        PreparedStatement pstmt32 = conn.prepareStatement(addr32); 
        PreparedStatement pstmt33 = conn.prepareStatement(addr33);
        PreparedStatement pstmt34 = conn.prepareStatement(addr34); 
        PreparedStatement pstmt35 = conn.prepareStatement(addr35); 
        PreparedStatement pstmt36 = conn.prepareStatement(addr36); 
        PreparedStatement pstmt37 = conn.prepareStatement(addr37);
        PreparedStatement pstmt38 = conn.prepareStatement(addr38); 
        PreparedStatement pstmt39 = conn.prepareStatement(addr39); 
        PreparedStatement pstmt40 = conn.prepareStatement(addr40); 
        PreparedStatement pstmt41 = conn.prepareStatement(addr41);
        
    } catch (SQLException e) {  
        //Handle   
    }  
  }
