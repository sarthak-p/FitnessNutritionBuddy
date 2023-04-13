public class ResturantInfo {

        String name;
        String speciality;
        String location;
        double latitude;
        double longitude;

        public ResturantInfo() {
        }

        public ResturantInfo(String n, String s, String l, double lat, double lon) {
                this.name = n;
                this.speciality = s;
                this.location = l;
                this.latitude = lat;
                this.longitude = lon;
        }

        public static ResturantInfo[] get_resturant_array() {
                ResturantInfo c1 = new ResturantInfo("Kenya's Keto Kitchen", "Keto", "Chicago, IL", 41.878702,
                                -87.626983);
                ResturantInfo c2 = new ResturantInfo("Dirty Root", "Low Carb", "Chicago, IL", 41.879143, -87.631782);
                ResturantInfo c3 = new ResturantInfo("CRAFT Donuts + Coffee", "Keto", "Chicago, IL", 41.884174, -87.618072);
                ResturantInfo c4 = new ResturantInfo("Tweet", "Low Carb", "Chicago, IL", 41.886875, -87.649141);
                ResturantInfo c5 = new ResturantInfo("The Eating Well", "Vegan", "Schaumburg, IL", 42.037117,
                                -88.080583);
                ResturantInfo c6 = new ResturantInfo("True Food Kitchen", "Vegan", "Oak Brook, IL", 41.832825,
                                -87.977329);
                ResturantInfo c8 = new ResturantInfo("Kale My Name", "Vegan", "Chicago, IL", 41.899023, -87.625347);
                ResturantInfo c9 = new ResturantInfo("The Water Bar", "Gluten Free", "Geneva, IL", 41.883660,
                                -88.316140);
                ResturantInfo c10 = new ResturantInfo("Alice and Friends Vegan Kitchen", "Vegan", "Chicago, IL",
                                41.965784,
                                -87.714499);
                ResturantInfo c11 = new ResturantInfo("Victus Foods", "Paleo", "Chicago, IL", 41.910849, -87.677726);
                ResturantInfo c12 = new ResturantInfo("THAI GARDEN", "Paleo", "Chicago, IL", 41.910323, -87.677682);
                ResturantInfo c13 = new ResturantInfo("Protein Bar and Kitchen", "Low Carb", "Chicago, IL", 41.893373,
                                -87.636069);
                ResturantInfo c14 = new ResturantInfo("Purple Sprout Concious Organic", "Vegan", "Buffalo Grove, IL",
                                42.170436, -87.961375);
                ResturantInfo c15 = new ResturantInfo("LYFE Kitchen", "Vegan", "Chicago, IL", 41.896828, -87.634872);
                ResturantInfo c16 = new ResturantInfo("Fittingly Delicious", "Low Carb", "Chicago, IL", 41.895111,
                                -87.638302);
                ResturantInfo c17 = new ResturantInfo("Harvest Room", "Vegan", "Palos Heights, IL", 41.665699,
                                -87.793569);
                ResturantInfo c18 = new ResturantInfo("Sweet Natalies Gluten Free Bakery/Baby Doll Bakery",
                                "Gluten Free",
                                "Wheaton, IL", 41.867495, -88.110026);
                ResturantInfo c19 = new ResturantInfo("Da Luciano's", "Gluten Free", "River Grove, IL", 41.926032,
                                -87.838930);
                ResturantInfo c20 = new ResturantInfo("Wheat's End Cafe & Bakery", "Gluten Free", "Chicago, IL",
                                41.947200,
                                -87.656400);
                ResturantInfo c21 = new ResturantInfo("Maggiano's Little Italy", "Gluten Free", "Schaumburg, IL",
                                42.045400,
                                -88.053000);
                ResturantInfo c22 = new ResturantInfo("Moretti's", "Gluten Free", "Bartlett, IL", 41.969800,
                                -88.185500);
                ResturantInfo c23 = new ResturantInfo("Augustino's Rock and Roll Deli and Grill", "Gluten Free",
                                "Carol Stream, IL", 41.918000, -88.122800);
                ResturantInfo c24 = new ResturantInfo("Nature's Best Cafe", "Vegan", "Naperville, IL", 41.776800,
                                -88.146300);
                ResturantInfo c25 = new ResturantInfo("Sweetgreen", "Low Protein", "Schaumburg, IL", 42.0462, -88.0395);
                ResturantInfo c26 = new ResturantInfo("Low Carb Kitchen", "Low Carb", "Downers Grove, IL", 41.8083,
                                -88.0112);
                ResturantInfo c27 = new ResturantInfo("Egg Harbor Cafe", "Gluten Free", "Naperville, IL", 41.7723,
                                -88.1535);
                ResturantInfo c28 = new ResturantInfo("Panera Bread", "Keto", "Chicago, IL", 41.8868, -87.6267);
                ResturantInfo c29 = new ResturantInfo("Panera Bread", "Keto", "Berwyn, IL", 41.8304, -87.7954);
                ResturantInfo c30 = new ResturantInfo("Panera Bread", "Keto", "River Forest, IL", 41.8971, -87.8207);
                ResturantInfo c31 = new ResturantInfo("Panera Bread", "Keto", "Emlwood Park, IL", 41.9033, -87.8167);
                ResturantInfo c32 = new ResturantInfo("Panera Bread", "Keto", "Norridge, IL", 41.9581, -87.8388);
                ResturantInfo c33 = new ResturantInfo("Panera Bread", "Keto", "Oak Lawn, IL", 41.7183, -87.7555);
                ResturantInfo c34 = new ResturantInfo("Taco Bell", "Keto", "Chicago, IL", 41.8869, -87.6278);
                ResturantInfo c35 = new ResturantInfo("Taco Bell", "Keto", "Hanover Park, IL", 41.9810, -88.1460);
                ResturantInfo c36 = new ResturantInfo("Taco Bell", "Keto", "Addison, IL", 41.9301, -88.0178);
                ResturantInfo c37 = new ResturantInfo("Taco Bell", "Keto", "Aurora, IL", 41.751546, -88.269834);
                ResturantInfo c38 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Aurora, IL", 41.759736,
                                -88.240015);
                ResturantInfo c39 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Bolingbrook, IL", 41.702768,
                                -88.030024);
                ResturantInfo c40 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Naperville, IL", 41.809305,
                                -88.134797);
                ResturantInfo c41 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Oswego, IL", 41.692903,
                                -88.351526);
                ResturantInfo c42 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Plainfield, IL", 41.622188,
                                -88.203064);
                ResturantInfo c43 = new ResturantInfo("Chili's Grill & Bar", "Keto", "Batavia, IL", 41.843520,
                                -88.306846);

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
