public class ResturantInfo{  
	
	String name;
	String speciality;
	String location;
	String state_zip;
	String street;
	
	public ResturantInfo() {}
	
	public ResturantInfo(String n, String s, String l, String st, String sz) {
		this.name = n;
		this.speciality = s;
		this.location = l;
		this.street = st;
		this.state_zip = sz;
	}
	
	public ResturantInfo[] get_resturant_array(){
		ResturantInfo c1 = new ResturantInfo("Kenya's Keto Kitchen", "Keto", "Chicago", "3101 W Lake St", "IL 60612");
		ResturantInfo c2 = new ResturantInfo("Dirty Root", "Low Carb", "Chicago", "939 W Randolph St", "IL 60607");
		ResturantInfo c3 = new ResturantInfo("CRAFT Donuts + Coffee", "Keto", "Des Plaines", "1501 Miner St", "IL 60016");
		ResturantInfo c4 = new ResturantInfo("Tweet", "Low Carb", "Chicago", "5020 N Sheridan Rd", "IL 60640");
		ResturantInfo c5 = new ResturantInfo("The Eating Well", "Vegan", "Schaumburg", "951 W Wise Rd", "IL 60193");
		ResturantInfo c6 = new ResturantInfo("True Food Kitchen", "Vegan", "Oak Brook", "105 Oakbrook Center", "IL 60523");
		ResturantInfo c8 = new ResturantInfo("Kale My Name", "Vegan", "Chicago", "3300 W Montrose Ave", "IL 60618");
		ResturantInfo c9 = new ResturantInfo("The Water Bar", "Gluten Free", "Geneva", "315 W State St", "IL 60134");
		ResturantInfo c10 = new ResturantInfo("Alice and Friends Vegan Kitchen", "Vegan", "Chicago", "5812 N Broadway", "IL 60660");
		ResturantInfo c11 = new ResturantInfo("Victus Foods", "Paleo", "Libertyville", "748 E Park Ave", "IL 60048");
		ResturantInfo c12 = new ResturantInfo("THAI GARDEN", "Paleo", "Schaumburg", "225 W Golf Rd", "IL 60195");
		ResturantInfo c13 = new ResturantInfo("Protien Bar and Kitchen", "Low Carb", "Chicago", "352 N Clark St", "IL 60654");
		ResturantInfo c14 = new ResturantInfo("Purple Sprout Concious Organic", "Vegan", "Buffalo Grove", "364 Lexington Dr", "IL 60089");
		ResturantInfo c15 = new ResturantInfo("LYFE Kitchen", "Vegan", "Chicago", "270 E Ontario St", "IL 60611");
		ResturantInfo c16 = new ResturantInfo("Fittingly Delicious", "Low Carb", "Chicago", "3939 W Irving Park Rd", "IL 60618");
		ResturantInfo c17 = new ResturantInfo("Harvest Room", "Vegan", "Palos Heights", "7164 W 127th St", "IL 60463");
		ResturantInfo c18 = new ResturantInfo("Sweet Natalies Gluten Free Bakery/Baby Doll Bakery", "Gluten Free", "Wheaton", "207 S Hale St", "IL 60187");
		ResturantInfo c19 = new ResturantInfo("Da Luciano's", "Gluten Free", "Rivers Grove", "8343 Grand Ave", "IL 60171");
		ResturantInfo c20 = new ResturantInfo("Wheat's End Cafe & Bakery", "Gluten Free", "Chicago", "543 W Diversey Pkwy", "IL 60614");
		ResturantInfo c21 = new ResturantInfo("Maggiano's Little Italy", "Gluten Free", "Schaumburg", "1901 Woodfield Rd", "IL 60173");
		ResturantInfo c22 = new ResturantInfo("Moretti's", "Gluten Free", "Bartlett", "1175 W Lake St", "IL 60103");
		ResturantInfo c23 = new ResturantInfo("Augustino's Rock and Roll Deli and Grill", "Gluten Free", "Carol Stream", "246 S Schmale Rd", "IL 60188");
		ResturantInfo c24 = new ResturantInfo("Nature's Best Cafe", "Vegan", "Naperville", "1904 Brookdale Rd", "IL 60563");
		ResturantInfo c25 = new ResturantInfo("sweetgreen", "Low Protien", "Schaumburg", "1320 N Meacham Rd", "IL 60173");
		ResturantInfo c26 = new ResturantInfo("Low Carb Kitchen", "Low Carb", "Downers Grove", "5129 Belmont Rd", "IL 60515");
		ResturantInfo c27 = new ResturantInfo("Egg Harbor Cafe", "Gluten Free", "Naperville", "175 Jackson Ave", "IL 60540");
		ResturantInfo c28 = new ResturantInfo("Panera Bread", "Keto", "Chicago", "1101 S Canal St Ste 106", "IL 60607");
		ResturantInfo c29 = new ResturantInfo("Panera Bread", "Keto", "Berwyn", "7050 Cermak Rd", "IL 60402");
		ResturantInfo c30 = new ResturantInfo("Panera Bread", "Keto", "River Forest", "7349 Lake St", "IL 60305");
		ResturantInfo c31 = new ResturantInfo("Panera Bread", "Keto", "Emlwood Park", "7400 W North Ave", "IL 60707");
		ResturantInfo c32 = new ResturantInfo("Panera Bread", "Keto", "Norridge", "4244 N Harlem Ave", "IL 60706");
		ResturantInfo c33 = new ResturantInfo("Panera Bread", "Keto", "Oak Lawn", "10553 S Cicero Ave", "IL 60453");
		ResturantInfo c34 = new ResturantInfo("Taco Bell", "Keto", "Chicago", "2432 N Milwaukee Ave", "IL 60647");
		ResturantInfo c35 = new ResturantInfo("Taco Bell", "Keto", "Hanover Park", "7660 Barrington Rd", "IL 60133");
		ResturantInfo c36 = new ResturantInfo("Taco Bell", "Keto", "Addison", "555 W Lake St", "IL 60101");
		ResturantInfo c37 = new ResturantInfo("Taco Bell", "Keto", "Aurora", "1000 N Farnsworth Ave", "IL 60506");
		ResturantInfo c38 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Aurora", "1290 N Orchard Rd", "IL 60506");
		ResturantInfo c39 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Bolingbrook", "1275 W Boughton Rd", "IL 60440");
		ResturantInfo c40 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Naperville", "264 Illinois Rte 59", "IL 60540");
		ResturantInfo c41 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Oswego", "2820 Walter Payton Memorial Hwy", "IL 60543");
		ResturantInfo c42 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Plainfield", "12740 Illinois Rte 59", "IL 60544");
		ResturantInfo c43 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Batavia", "491 N Randall Rd", "IL 60510");
		
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
