public class ResturantInfo{  
	
	String name;
	String speciality;
	String location;
	
	public ResturantInfo() {}
	
	public ResturantInfo(String n, String s, String l) {
		this.name = n;
		this.speciality = s;
		this.location = l;
	}
	
	public ResturantInfo[] get_resturant_array(){
		ResturantInfo c1 = new ResturantInfo("Kenya's Keto Kitchen", "Keto", "Chicago, IL");
		ResturantInfo c2 = new ResturantInfo("Dirty Root", "Low Carb", "Chicago, IL");
		ResturantInfo c3 = new ResturantInfo("CRAFT Donuts + Coffee", "Keto", "Chicago");
		ResturantInfo c4 = new ResturantInfo("Tweet", "Low Carb", "Chicago, IL");
		ResturantInfo c5 = new ResturantInfo("The Eating Well", "Vegan", "Schaumburg, IL");
		ResturantInfo c6 = new ResturantInfo("True Food Kitchen", "Vegan", "Oak Brook, IL");
		ResturantInfo c8 = new ResturantInfo("Kale My Name", "Vegan", "Chicago, IL");
		ResturantInfo c9 = new ResturantInfo("The Water Bar", "Gluten Free", "Geneva, IL");
		ResturantInfo c10 = new ResturantInfo("Alice and Friends Vegan Kitchen", "Vegan", "Chicago, IL");
		ResturantInfo c11 = new ResturantInfo("Victus Foods", "Paleo", "Chicago, IL");
		ResturantInfo c12 = new ResturantInfo("THAI GARDEN", "Paleo", "Chicago, IL");
		ResturantInfo c13 = new ResturantInfo("Protien Bar and Kitchen", "Low Carb", "Chicago, IL");
		ResturantInfo c14 = new ResturantInfo("Purple Sprout Concious Organic", "Vegan", "Buffalo Grove, IL");
		ResturantInfo c15 = new ResturantInfo("LYFE Kitchen", "Vegan", "Chicago, IL");
		ResturantInfo c16 = new ResturantInfo("Fittingly Delicious", "Low Carb", "Chicago, IL");
		ResturantInfo c17 = new ResturantInfo("Harvest Room", "Vegan", "Palos Heights, IL");
		ResturantInfo c18 = new ResturantInfo("Sweet Natalies Gluten Free Bakery/Baby Doll Bakery", "Gluten Free", "Wheaton, IL");
		ResturantInfo c19 = new ResturantInfo("Da Luciano's", "Gluten Free", "Rivers Grove");
		ResturantInfo c20 = new ResturantInfo("Wheat's End Cafe & Bakery", "Gluten Free", "Chicago, IL");
		ResturantInfo c21 = new ResturantInfo("Maggiano's Little Italy", "Gluten Free", "Schaumburg, IL");
		ResturantInfo c22 = new ResturantInfo("Moretti's", "Gluten Free", "Bartlett, IL");
		ResturantInfo c23 = new ResturantInfo("Augustino's Rock and Roll Deli and Grill", "Gluten Free", "Carol Stream");
		ResturantInfo c24 = new ResturantInfo("Nature's Best Cafe", "Vegan", "Naperville, IL");
		ResturantInfo c25 = new ResturantInfo("sweetgreen", "Low Protien", "Schaumburg");
		ResturantInfo c26 = new ResturantInfo("Low Carb Kitchen", "Low Carb", "Downers Grove, IL");
		ResturantInfo c27 = new ResturantInfo("Egg Harbor Cafe", "Gluten Free", "Naperville, IL");
		ResturantInfo c28 = new ResturantInfo("Panera Bread", "Keto", "Chicago, IL");
		ResturantInfo c29 = new ResturantInfo("Panera Bread", "Keto", "Berwyn, IL");
		ResturantInfo c30 = new ResturantInfo("Panera Bread", "Keto", "River Forest, IL");
		ResturantInfo c31 = new ResturantInfo("Panera Bread", "Keto", "Emlwood Park, IL");
		ResturantInfo c32 = new ResturantInfo("Panera Bread", "Keto", "Norridge, IL");
		ResturantInfo c33 = new ResturantInfo("Panera Bread", "Keto", "Oak Lawn, IL");
		ResturantInfo c34 = new ResturantInfo("Taco Bell", "Keto", "Chicago, IL");
		ResturantInfo c35 = new ResturantInfo("Taco Bell", "Keto", "Hanover Park, IL");
		ResturantInfo c36 = new ResturantInfo("Taco Bell", "Keto", "Addison, IL");
		ResturantInfo c37 = new ResturantInfo("Taco Bell", "Keto", "Aurora, IL");
		ResturantInfo c38 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Aurora, IL");
		ResturantInfo c39 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Bolingbrook, IL");
		ResturantInfo c40 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Naperville, IL");
		ResturantInfo c41 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Oswego, IL");
		ResturantInfo c42 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Plainfield, IL");
		ResturantInfo c43 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Batavia, IL");
		
		ResturantInfo[] db = new ResturantInfo[42];
		db[0] = c1;
		db[1] = c2;
		db[2] = c3;
		db[3] = c4;
		db[4] = c5;
		db[5] = c6;
		db[6] = c8;
		db[7] = c9;
		db[8] = c10;
		db[9] = c11;
		db[10] = c12;
		db[11] = c13;
		db[12] = c14;
		db[13] = c15;
		db[14] = c16;
		db[15] = c17;
		db[16] = c18;
		db[17] = c19;
		db[18] = c20;
		db[19] = c21;
		db[20] = c22;
		db[21] = c23;
		db[22] = c24;
		db[23] = c25;
		db[24] = c26;
		db[25] = c27;
		db[26] = c28;
		db[27] = c29;
		db[28] = c30;
		db[29] = c31;
		db[30] = c32;
		db[31] = c33;
		db[32] = c34;
		db[33] = c35;
		db[34] = c36;
		db[35] = c37;
		db[36] = c38;
		db[37] = c39;
		db[38] = c40;
		db[39] = c41;
		db[40] = c42;
		db[41] = c43;
		
		return db;
		
	}
}