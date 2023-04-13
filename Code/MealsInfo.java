public class MealsInfo {
        public String name;
        String speciality;
        String location;
        Meal breakfast;
        Meal lunch;
        Meal dinner;

        public MealsInfo() {
        }

        public MealsInfo(String n, String s, String l, Meal b, Meal l2, Meal d) {
                this.name = n;
                this.speciality = s;
                this.location = l;
                this.breakfast = b;
                this.lunch = l2;
                this.dinner = d;
        }

        public MealsInfo[] get_restaurant_array() {

                Meal c1_b = new Meal("Kenya's Keto Kitchen - Chicago, IL", 400, "Eggs, bacon, avocado");
                Meal c1_l = new Meal("Kenya's Keto Kitchen - Chicago, IL", 600, "Grilled chicken salad");
                Meal c1_d = new Meal("Kenya's Keto Kitchen - Chicago, IL", 800,
                                "Grilled salmon with steamed vegetables");
                MealsInfo c1 = new MealsInfo("Kenya's Keto Kitchen", "Keto", "Chicago, IL", c1_b, c1_l, c1_d);

                Meal c2_b = new Meal("Dirty Root - Chicago, IL", 350, "Greek yogurt with berries and nuts");
                Meal c2_l = new Meal("Dirty Root - Chicago, IL", 500, "Grilled chicken wrap with vegetables");
                Meal c2_d = new Meal("Dirty Root - Chicago, IL", 750, "Grilled steak with roasted vegetables");
                MealsInfo c2 = new MealsInfo("Dirty Root", "Low Carb", "Chicago, IL", c2_b, c2_l, c2_d);

                Meal c3_b = new Meal("CRAFT Donuts + Coffee - Chicago, IL", 450, "Keto donut with coffee");
                Meal c3_l = new Meal("CRAFT Donuts + Coffee - Chicago, IL", 550, "Avocado toast with grilled chicken");
                Meal c3_d = new Meal("CRAFT Donuts + Coffee - Chicago, IL", 750,
                                "Grilled shrimp with zucchini noodles");
                MealsInfo c3 = new MealsInfo("CRAFT Donuts + Coffee", "Keto", "Chicago, IL", c3_b, c3_l, c3_d);

                Meal c4_b = new Meal("Tweet - Chicago, IL", 400, "Eggs, sausage, spinach");
                Meal c4_l = new Meal("Tweet - Chicago, IL", 550, "Grilled chicken sandwich on lettuce wrap");
                Meal c4_d = new Meal("Tweet - Chicago, IL", 700, "Grilled salmon with roasted asparagus");
                MealsInfo c4 = new MealsInfo("Tweet", "Low Carb", "Chicago, IL", c4_b, c4_l, c4_d);

                Meal c5_b = new Meal("The Eating Well - Schaubmurg, IL", 300, "Smoothie bowl with granola and fruit");
                Meal c5_l = new Meal("The Eating Well - Schaubmurg, IL", 450, "Falafel wrap with hummus and veggies");
                Meal c5_d = new Meal("The Eating Well - Schaubmurg, IL", 650, "Vegan lasagna with garlic bread");
                MealsInfo c5 = new MealsInfo("The Eating Well", "Vegan", "Schaumburg, IL", c5_b, c5_l, c5_d);

                Meal c6_b = new Meal("True Food Kitchen - Oak Brook, IL", 350, "Acai bowl with granola and fruit");
                Meal c6_l = new Meal("True Food Kitchen - Oak Brook, IL", 500,
                                "Vegetable wrap with hummus and sweet potato fries");
                Meal c6_d = new Meal("True Food Kitchen - Oak Brook, IL", 700, "Roasted vegetable plate with quinoa");
                MealsInfo c6 = new MealsInfo("True Food Kitchen", "Vegan", "Oak Brook, IL", c6_b, c6_l, c6_d);

                Meal c7_b = new Meal("Kale My Name - Chicago, IL", 300, "Vegan smoothie bowl");
                Meal c7_l = new Meal("Kale My Name - Chicago, IL", 450,
                                "Chickpea and avocado sandwich with sweet potato fries");
                Meal c7_d = new Meal("Kale My Name - Chicago, IL", 650, "Vegan chili with cornbread");
                MealsInfo c7 = new MealsInfo("Kale My Name", "Vegan", "Chicago, IL", c7_b, c7_l, c7_d);

                Meal c8_b = new Meal("The Water Bar - Geneva, IL", 400, "Gluten-free oatmeal with fruit and nuts");
                Meal c8_l = new Meal("The Water Bar - Geneva, IL", 600,
                                "Grilled chicken salad with gluten-free croutons");
                Meal c8_d = new Meal("The Water Bar - Geneva, IL", 800, "Grilled salmon with gluten-free pasta");
                MealsInfo c8 = new MealsInfo("The Water Bar", "Gluten Free", "Geneva, IL", c8_b, c8_l, c8_d);

                Meal c9_b = new Meal("Alice and Friends Vegan Kitchen - Chicago, IL", 350,
                                "Vegan pancakes with fruit compote");
                Meal c9_l = new Meal("Alice and Friends Vegan Kitchen - Chicago, IL", 500,
                                "Vegan burger with sweet potato fries");
                Meal c9_d = new Meal("Alice and Friends Vegan Kitchen - Chicago, IL", 700,
                                "Vegan pizza with roasted vegetables");
                MealsInfo c9 = new MealsInfo("Alice and Friends Vegan Kitchen", "Vegan", "Chicago, IL", c9_b, c9_l,
                                c9_d);

                Meal c10_b = new Meal("Victus Foods - Chicago, IL", 350, "Paleo omelette with spinach and mushrooms");
                Meal c10_l = new Meal("Victus Foods - Chicago, IL", 500, "Paleo turkey and avocado lettuce wraps");
                Meal c10_d = new Meal("Victus Foods - Chicago, IL", 700, "Grilled steak with roasted vegetables");
                MealsInfo c10 = new MealsInfo("Victus Foods", "Paleo", "Chicago, IL", c10_b, c10_l, c10_d);

                Meal c12_b = new Meal("Thai Garden - Chicago, IL", 500, "Grilled chicken with roasted vegetables");
                Meal c12_l = new Meal("Thai Garden - Chicago, IL", 700, "Beef stir-fry with broccoli and mushrooms");
                Meal c12_d = new Meal("Thai Garden - Chicago, IL", 900, "Salmon with cauliflower rice");
                MealsInfo c12 = new MealsInfo("Thai Garden", "Paleo", "Chicago, IL", c12_b, c12_l, c12_d);

                Meal c13_b = new Meal("Protein Bar and Kitchen - Chicago, IL", 400,
                                "Egg white omelette with spinach and mushrooms");
                Meal c13_l = new Meal("Protein Bar and Kitchen - Chicago, IL", 600,
                                "Grilled chicken salad with avocado and mixed greens");
                Meal c13_d = new Meal("Protein Bar and Kitchen - Chicago, IL", 800,
                                "Grilled steak with asparagus and roasted sweet potatoes");
                MealsInfo c13 = new MealsInfo("Protein Bar and Kitchen", "Low Carb", "Chicago, IL", c13_b, c13_l,
                                c13_d);

                Meal c14_b = new Meal("Purple Sprout Concious Organic - Buffalo Grove, IL", 350,
                                "Vegan quinoa bowl with mixed vegetables");
                Meal c14_l = new Meal("Purple Sprout Concious Organic - Buffalo Grove, IL", 500,
                                "Vegan wrap with tofu and avocado");
                Meal c14_d = new Meal("Purple Sprout Concious Organic - Buffalo Grove, IL", 700,
                                "Vegan lentil soup with gluten-free crackers");
                MealsInfo c14 = new MealsInfo("Purple Sprout Concious Organic", "Vegan", "Buffalo Grove, IL", c14_b,
                                c14_l,
                                c14_d);

                Meal c15_b = new Meal("LYFE Kitchen - Chicago, IL", 350,
                                "Vegan breakfast burrito with tofu scramble and vegetables");
                Meal c15_l = new Meal("LYFE Kitchen - Chicago, IL", 500,
                                "Vegan quinoa salad with mixed greens and avocado");
                Meal c15_d = new Meal("LYFE Kitchen - Chicago, IL", 700, "Vegan sweet potato curry with brown rice");
                MealsInfo c15 = new MealsInfo("LYFE Kitchen", "Vegan", "Chicago, IL", c15_b, c15_l, c15_d);

                Meal c16_b = new Meal("Fittingly Delicious - Chicago, IL", 400,
                                "Egg white omelette with spinach and mushrooms");
                Meal c16_l = new Meal("Fittingly Delicious - Chicago, IL", 600,
                                "Grilled chicken salad with avocado and mixed greens");
                Meal c16_d = new Meal("Fittingly Delicious - Chicago, IL", 800,
                                "Grilled steak with asparagus and roasted sweet potatoes");
                MealsInfo c16 = new MealsInfo("Fittingly Delicious", "Low Carb", "Chicago, IL", c16_b, c16_l, c16_d);

                Meal c17_b = new Meal("Harvest Room - Palos Heights, IL", 350,
                                "Vegan breakfast bowl with quinoa and mixed berries");
                Meal c17_l = new Meal("Harvest Room - Palos Heights, IL", 500,
                                "Vegan wrap with hummus and mixed vegetables");
                Meal c17_d = new Meal("Harvest Room - Palos Heights, IL", 700,
                                "Vegan lentil soup with gluten-free crackers");
                MealsInfo c17 = new MealsInfo("Harvest Room", "Vegan", "Palos Heights, IL", c17_b, c17_l, c17_d);

                Meal c18_b = new Meal("Sweet Natalies Gluten Free Bakery/Baby Doll Bakery - Wheaton, IL", 400,
                                "Gluten-free banana bread with almond butter");
                Meal c18_l = new Meal("Sweet Natalies Gluten Free Bakery/Baby Doll Bakery - Wheaton, IL", 600,
                                "Grilled chicken sandwich on gluten-free bread");
                Meal c18_d = new Meal("Sweet Natalies Gluten Free Bakery/Baby Doll Bakery - Wheaton, IL", 800,
                                "Grilled salmon with gluten-free pasta");
                MealsInfo c18 = new MealsInfo("Sweet Natalies Gluten Free Bakery/Baby Doll Bakery", "Gluten Free",
                                "Wheaton, IL", c18_b, c18_l, c18_d);

                Meal c19_b = new Meal("Da Luciano's - Rivers Grove, IL", 400,
                                "Gluten-free oatmeal with fruit and nuts");
                Meal c19_l = new Meal("Da Luciano's - Rivers Grove, IL", 600,
                                "Grilled chicken salad with gluten-free croutons");
                Meal c19_d = new Meal("Da Luciano's - Rivers Grove, IL", 800, "Grilled salmon with gluten-free pasta");
                MealsInfo c19 = new MealsInfo("Da Luciano's", "Gluten Free", "Rivers Grove, IL", c19_b, c19_l, c19_d);

                Meal c20_b = new Meal("Wheat's End Cafe & Bakery - Chicago, IL", 400,
                                "Gluten-free pancakes with maple syrup");
                Meal c20_l = new Meal("Wheat's End Cafe & Bakery - Chicago, IL", 600,
                                "Gluten-free grilled cheese with tomato soup");
                Meal c20_d = new Meal("Wheat's End Cafe & Bakery - Chicago, IL", 800,
                                "Gluten-free pasta with meatballs");
                MealsInfo c20 = new MealsInfo("Wheat's End Cafe & Bakery", "Gluten Free", "Chicago, IL", c20_b, c20_l,
                                c20_d);

                Meal c21_b = new Meal("Maggiano's Little Italy - Schaumburg, IL", 400,
                                "Gluten-free bruschetta with tomato and basil");
                Meal c21_l = new Meal("Maggiano's Little Italy - Schaumburg, IL", 600,
                                "Gluten-free chicken parmesan with spaghetti");
                Meal c21_d = new Meal("Maggiano's Little Italy - Schaumburg, IL", 800,
                                "Gluten-free steak with mashed potatoes");
                MealsInfo c21 = new MealsInfo("Maggiano's Little Italy", "Gluten Free", "Schaumburg, IL", c21_b, c21_l,
                                c21_d);

                Meal c22_b = new Meal("Moretti's - Bartlett, IL", 400,
                                "Gluten-free smoothie bowl with mixed berries and granola");
                Meal c22_l = new Meal("Moretti's - Bartlett, IL", 600, "Gluten-free burger with sweet potato fries");
                Meal c22_d = new Meal("Moretti's - Bartlett, IL", 800, "Gluten-free pizza with mixed vegetables");
                MealsInfo c22 = new MealsInfo("Moretti's", "Gluten Free", "Bartlett, IL", c22_b, c22_l, c22_d);

                Meal c23_b = new Meal("Augustino's Rock and Roll Deli and Grill - Carol Stream, IL", 400,
                                "Gluten-free breakfast sandwich with bacon and eggs");
                Meal c23_l = new Meal("Augustino's Rock and Roll Deli and Grill - Carol Stream, IL", 600,
                                "Grilled chicken salad with gluten-free croutons");
                Meal c23_d = new Meal("Augustino's Rock and Roll Deli and Grill - Carol Stream, IL", 800,
                                "Grilled salmon with gluten-free pasta");
                MealsInfo c23 = new MealsInfo("Augustino's Rock and Roll Deli and Grill", "Gluten Free",
                                "Carol Stream, IL",
                                c23_b,
                                c23_l, c23_d);

                Meal c24_b = new Meal("Nature's Best Cafe - Naperville, IL", 350,
                                "Vegan breakfast bowl with quinoa and mixed berries");
                Meal c24_l = new Meal("Nature's Best Cafe - Naperville, IL", 500,
                                "Vegan wrap with hummus and mixed vegetables");
                Meal c24_d = new Meal("Nature's Best Cafe - Naperville, IL", 700,
                                "Vegan sweet potato curry with brown rice");
                MealsInfo c24 = new MealsInfo("Nature's Best Cafe", "Vegan", "Naperville, IL", c24_b, c24_l, c24_d);

                Meal c25_b = new Meal("Sweetgreen - Schaumburg, IL", 400,
                                "Kale salad with roasted vegetables and vinaigrette");
                Meal c25_l = new Meal("Sweetgreen - Schaumburg, IL", 600, "Roasted chicken bowl with mixed vegetables");
                Meal c25_d = new Meal("Sweetgreen - Schaumburg, IL", 800, "Grilled salmon with asparagus and quinoa");
                MealsInfo c25 = new MealsInfo("Sweetgreen", "Low Protien", "Schaumburg, IL", c25_b, c25_l, c25_d);

                Meal c26_b = new Meal("Low Carb Kitchen - Downers Grove, IL", 400,
                                "Egg white omelette with spinach and mushrooms");
                Meal c26_l = new Meal("Low Carb Kitchen - Downers Grove, IL", 600,
                                "Grilled chicken salad with avocado and mixed greens");
                Meal c26_d = new Meal("Low Carb Kitchen - Downers Grove, IL", 800,
                                "Grilled steak with asparagus and roasted sweet potatoes");
                MealsInfo c26 = new MealsInfo("Low Carb Kitchen", "Low Carb", "Downers Grove, IL", c26_b, c26_l, c26_d);

                Meal c27_b = new Meal("Egg Harbor Cafe - Naperville, IL", 400, "Gluten-free pancakes with maple syrup");
                Meal c27_l = new Meal("Egg Harbor Cafe - Naperville, IL", 600,
                                "Grilled chicken salad with gluten-free croutons");
                Meal c27_d = new Meal("Egg Harbor Cafe - Naperville, IL", 800, "Grilled salmon with gluten-free pasta");
                MealsInfo c27 = new MealsInfo("Egg Harbor Cafe", "Gluten Free", "Naperville, IL", c27_b, c27_l, c27_d);

                Meal c28_b = new Meal("Panera Bread - Chicago, IL", 400, "Keto-friendly avocado toast with eggs");
                Meal c28_l = new Meal("Panera Bread - Chicago, IL", 600, "Keto-friendly chicken caesar salad");
                Meal c28_d = new Meal("Panera Bread - Chicago, IL", 800, "Keto-friendly steak with cauliflower rice");
                MealsInfo c28 = new MealsInfo("Panera Bread", "Keto", "Chicago, IL", c28_b, c28_l, c28_d);

                Meal c29_b = new Meal("Panera Bread - Berwyn, IL", 400, "Keto-friendly avocado toast with eggs");
                Meal c29_l = new Meal("Panera Bread - Berwyn, IL", 600, "Keto-friendly chicken caesar salad");
                Meal c29_d = new Meal("Panera Bread - Berwyn, IL", 800, "Keto-friendly steak with cauliflower rice");
                MealsInfo c29 = new MealsInfo("Panera Bread", "Keto", "Berwyn, IL", c29_b, c29_l, c29_d);

                Meal c30_b = new Meal("Panera Bread - River Forest, IL", 400, "Keto-friendly avocado toast with eggs");
                Meal c30_l = new Meal("Panera Bread - River Forest, IL", 600, "Keto-friendly chicken caesar salad");
                Meal c30_d = new Meal("Panera Bread - River Forest, IL", 800,
                                "Keto-friendly steak with cauliflower rice");
                MealsInfo c30 = new MealsInfo("Panera Bread", "Keto", "River Forest, IL", c30_b, c30_l, c30_d);

                Meal c31_b = new Meal("Panera Bread - Elmwood Park, IL", 400, "Keto-friendly avocado toast with eggs");
                Meal c31_l = new Meal("Panera Bread - Elmwood Park, IL", 600, "Keto-friendly chicken caesar salad");
                Meal c31_d = new Meal("Panera Bread - Elmwood Park, IL", 800,
                                "Keto-friendly steak with cauliflower rice");
                MealsInfo c31 = new MealsInfo("Panera Bread", "Keto", "Emlwood Park, IL", c31_b, c31_l, c31_d);

                Meal c32_b = new Meal("Panera Bread - Norridge, IL", 400, "Keto-friendly avocado toast with eggs");
                Meal c32_l = new Meal("Panera Bread - Norridge, IL", 600, "Keto-friendly chicken caesar salad");
                Meal c32_d = new Meal("Panera Bread - Norridge, IL", 800, "Keto-friendly steak with cauliflower rice");
                MealsInfo c32 = new MealsInfo("Panera Bread", "Keto", "Norridge, IL", c32_b, c32_l, c32_d);

                Meal c33_b = new Meal("Panera Bread - Oak Lawn, IL", 400, "Keto-friendly avocado toast with eggs");
                Meal c33_l = new Meal("Panera Bread - Oak Lawn, IL", 600, "Keto-friendly chicken caesar salad");
                Meal c33_d = new Meal("Panera Bread - Oak Lawn, IL", 800, "Keto-friendly steak with cauliflower rice");
                MealsInfo c33 = new MealsInfo("Panera Bread", "Keto", "Oak Lawn, IL", c33_b, c33_l, c33_d);

                Meal c34_b = new Meal("Taco Bell - Chicago, IL", 400, "Keto-friendly steak and egg breakfast burrito");
                Meal c34_l = new Meal("Taco Bell - Chicago, IL", 600,
                                "Keto-friendly chicken power bowl with avocado and cheese");
                Meal c34_d = new Meal("Taco Bell - Chicago, IL", 800, "Keto-friendly steak fajita bowl with guacamole");
                MealsInfo c34 = new MealsInfo("Taco Bell", "Keto", "Chicago, IL", c34_b, c34_l, c34_d);

                Meal c35_b = new Meal("Taco Bell - Hanover Park, IL", 400,
                                "Keto-friendly scrambled eggs with steak and cheese");
                Meal c35_l = new Meal("Taco Bell - Hanover Park, IL", 600,
                                "Keto-friendly grilled chicken with mixed vegetables and avocado");
                Meal c35_d = new Meal("Taco Bell - Hanover Park, IL", 800,
                                "Keto-friendly steak and shrimp fajitas with guacamole and sour cream");
                MealsInfo c35 = new MealsInfo("Taco Bell", "Keto", "Hanover Park, IL", c35_b, c35_l, c35_d);

                Meal c36_b = new Meal("Taco Bell - Addison, IL", 400,
                                "Keto-friendly breakfast taco with steak and eggs");
                Meal c36_l = new Meal("Taco Bell - Addison, IL", 600,
                                "Keto-friendly grilled chicken power bowl with avocado and cheese");
                Meal c36_d = new Meal("Taco Bell - Addison, IL", 800,
                                "Keto-friendly steak and shrimp fajitas with guacamole and sour cream");
                MealsInfo c36 = new MealsInfo("Taco Bell", "Keto", "Addison, IL", c36_b, c36_l, c36_d);

                Meal c37_b = new Meal("Taco Bell - Aurora, IL", 400,
                                "Keto-friendly breakfast taco with steak and eggs");
                Meal c37_l = new Meal("Taco Bell - Aurora, IL", 600,
                                "Keto-friendly grilled chicken with mixed vegetables and avocado");
                Meal c37_d = new Meal("Taco Bell - Aurora, IL", 800,
                                "Keto-friendly steak and shrimp fajitas with guacamole and sour cream");
                MealsInfo c37 = new MealsInfo("Taco Bell", "Keto", "Aurora, IL", c37_b, c37_l, c37_d);

                Meal c38_b = new Meal("Chili's Grill & Bar - Aurora, IL", 400,
                                "Keto-friendly grilled chicken salad with avocado and cheese");
                Meal c38_l = new Meal("Chili's Grill & Bar - Aurora, IL", 600,
                                "Keto-friendly steak and shrimp fajitas with guacamole and sour cream");
                Meal c38_d = new Meal("Chili's Grill & Bar - Aurora, IL", 800,
                                "Keto-friendly grilled salmon with steamed vegetables and side salad");
                MealsInfo c38 = new MealsInfo("Chili's Grill & Bar", "Keto", "Aurora, IL", c38_b, c38_l, c38_d);

                Meal c39_b = new Meal("Chili's Grill & Bar - Bolingbrook, IL", 400,
                                "Keto-friendly scrambled eggs with steak and cheese");
                Meal c39_l = new Meal("Chili's Grill & Bar - Bolingbrook, IL", 600,
                                "Keto-friendly grilled chicken with mixed vegetables and avocado");
                Meal c39_d = new Meal("Chili's Grill & Bar - Bolingbrook, IL", 800,
                                "Keto-friendly steak and shrimp fajitas with guacamole and sour cream");
                MealsInfo c39 = new MealsInfo("Chili's Grill & Bar", "Keto", "Bolingbrook, IL", c39_b, c39_l, c39_d);

                Meal c40_b = new Meal("Chili's Grill & Bar - Naperville, IL", 400,
                                "Keto-friendly breakfast burrito with steak and eggs");
                Meal c40_l = new Meal("Chili's Grill & Bar - Naperville, IL", 600,
                                "Keto-friendly grilled chicken power bowl with avocado and cheese");
                Meal c40_d = new Meal("Chili's Grill & Bar - Naperville, IL", 800,
                                "Keto-friendly steak and shrimp fajitas with guacamole and sour cream");
                MealsInfo c40 = new MealsInfo("Chili's Grill & Bar", "Keto", "Naperville, IL", c40_b, c40_l, c40_d);

                Meal c41_b = new Meal("Chili's Grill & Bar - Oswego, IL", 400,
                                "Keto-friendly breakfast taco with steak and eggs");
                Meal c41_l = new Meal("Chili's Grill & Bar - Oswego, IL", 600,
                                "Keto-friendly grilled chicken with mixed vegetables and avocado");
                Meal c41_d = new Meal("Chili's Grill & Bar - Oswego, IL", 800,
                                "Keto-friendly steak fajita bowl with guacamole");
                MealsInfo c41 = new MealsInfo("Chili's Grill & Bar", "Keto", "Oswego, IL", c41_b, c41_l, c41_d);

                Meal c42_b = new Meal("Chili's Grill & Bar - Plainfield, IL", 400,
                                "Keto-friendly breakfast burrito with steak and eggs");
                Meal c42_l = new Meal("Chili's Grill & Bar - Plainfield, IL", 600,
                                "Keto-friendly grilled chicken with mixed vegetables and avocado");
                Meal c42_d = new Meal("Chili's Grill & Bar - Plainfield, IL", 800,
                                "Keto-friendly grilled salmon with steamed vegetables and side salad");
                MealsInfo c42 = new MealsInfo("Chili's Grill & Bar", "Keto", "Plainfield, IL", c42_b, c42_l, c42_d);

                Meal c43_b = new Meal("Chili's Grill & Bar - Batavia, IL", 400,
                                "Keto-friendly scrambled eggs with steak and cheese");
                Meal c43_l = new Meal("Chili's Grill & Bar - Batavia, IL", 600,
                                "Keto-friendly grilled chicken with mixed vegetables and avocado");
                Meal c43_d = new Meal("Chili's Grill & Bar - Batavia, IL", 800,
                                "Keto-friendly steak fajita bowl with guacamole");
                MealsInfo c43 = new MealsInfo("Chili's Grill & Bar", "Keto", "Batavia, IL", c43_b, c43_l, c43_d);

                Meal c44_b = new Meal("The Green Kitchen - Evanston, IL", 350, "Harvest Salad");
                Meal c44_l = new Meal("The Green Kitchen - Evanston, IL", 500, "Tofu Stir Fry");
                Meal c44_d = new Meal("The Green Kitchen - Evanston, IL", 450, "Roasted Veggie Panini");
                MealsInfo c44 = new MealsInfo("The Green Kitchen", "Keto", "Evanston, IL", c44_b, c44_l, c44_d);

                Meal c45_b = new Meal("Keto Kitchen - Chicago, IL", 450,
                                "Keto Breakfast Bowl with Eggs, Bacon, and Avocado");
                Meal c45_l = new Meal("Keto Kitchen - Chicago, IL", 550,
                                "Keto Cobb Salad with Grilled Chicken and Avocado");
                Meal c45_d = new Meal("Keto Kitchen - Chicago, IL", 650,
                                "Keto Beef Stroganoff with Zucchini Noodles");
                MealsInfo c45 = new MealsInfo("Keto Kitchen", "Keto", "Chicago, IL", c45_b, c45_l, c45_d);

                Meal c46_b = new Meal("Good Karma Cafe - Wheaton, IL", 400, "Green Curry Tofu Bowl");
                Meal c46_l = new Meal("Good Karma Cafe - Wheaton, IL", 550, "Veggie Burger with Sweet Potato Fries");
                Meal c46_d = new Meal("Good Karma Cafe - Wheaton, IL", 650, "Lentil Shepherd's Pie");
                MealsInfo c46 = new MealsInfo("Good Karma Cafe", "Keto", "Wheaton, IL", c46_b, c46_l, c46_d);

                Meal c47_b = new Meal("The Garden Spot - Naperville, IL", 500, "Spicy Black Bean Wrap");
                Meal c47_l = new Meal("The Garden Spot - Naperville, IL", 400, "Mediterranean Salad with Falafel");
                Meal c47_d = new Meal("The Garden Spot - Naperville, IL", 600,
                                "Butternut Squash and Lentil Soup");
                MealsInfo c47 = new MealsInfo("The Garden Spot", "Keto", "Naperville, IL", c47_b, c47_l, c47_d);

                Meal c48_b = new Meal("The Organic Bistro - Geneva, IL", 350, "Sweet Potato Breakfast Burrito");
                Meal c48_l = new Meal("The Organic Bistro - Geneva, IL", 550, "Vegan Chili");
                Meal c48_d = new Meal("The Organic Bistro - Geneva, IL", 700, "Wild Mushroom Risotto");
                MealsInfo c48 = new MealsInfo("The Organic Bistro", "Keto", "Geneva, IL", c48_b, c48_l, c48_d);

                Meal c49_b = new Meal("The Chicago Diner - Chicago, IL", 450,
                                "Vegan Omelette with Tofu Scramble and Spinach");
                Meal c49_l = new Meal("The Chicago Diner - Chicago, IL", 600, "BBQ Jackfruit Sandwich with Cole Slaw");
                Meal c49_d = new Meal("The Chicago Diner - Chicago, IL", 750,
                                "Vegan Deep Dish Pizza with Roasted Vegetables");
                MealsInfo c49 = new MealsInfo("The Chicago Diner", "Vegan", "Chicago, IL", c49_b, c49_l, c49_d);

                Meal c50_b = new Meal("Vegan Plate - Aurora, IL", 400,
                                "Vegan Waffle with Fresh Berries and Coconut Whip");
                Meal c50_l = new Meal("Vegan Plate - Aurora, IL", 550,
                                "Vegan Raw Burger with Cashew Cheese and Onion Rings");
                Meal c50_d = new Meal("Vegan Plate - Aurora, IL", 700, "Vegan Seitan Fajitas with Cashew Sour Cream");
                MealsInfo c50 = new MealsInfo("Vegan Plate", "Vegan", "Aurora, IL", c50_b, c50_l, c50_d);

                Meal c51_b = new Meal("The Green Room - Normal, IL", 350, "Vegan Avocado Toast with Fresh Tomatoes");
                Meal c51_l = new Meal("The Green Room - Normal, IL", 500, "Vegan Grilled Cheese with Tomato Soup");
                Meal c51_d = new Meal("The Green Room - Normal, IL", 650,
                                "Vegan Lentil Loaf with Mashed Potatoes and Gravy");
                MealsInfo c51 = new MealsInfo("The Green Room", "Vegan", "Normal, IL", c51_b, c51_l, c51_d);

                Meal c52_b = new Meal("The Amazing Kale Burger - Oak Park, IL", 400,
                                "Vegan Kale Omelette with Tomato and Mushroom");
                Meal c52_l = new Meal("The Amazing Kale Burger - Oak Park, IL", 220,
                                "Vegan Chickpea Tuna Sandwich with Chips");
                Meal c52_d = new Meal("The Amazing Kale Burger - Oak Park, IL", 700,
                                "Vegan Chick'n and Waffles with Maple Syrup and Gravy");
                MealsInfo c52 = new MealsInfo("The Amazing Kale Burger", "Vegan", "Oak Park, IL", c52_b, c52_l, c52_d);

                Meal c53_b = new Meal("B'Gabs Goodies - Chicago, IL", 100,
                                "Vegan Chia Pudding with Fresh Fruit and Almonds");
                Meal c53_l = new Meal("B'Gabs Goodies - Chicago, IL", 500,
                                "Vegan Tofu and Vegetable Stir Fry with Brown Rice");
                Meal c53_d = new Meal("B'Gabs Goodies - Chicago, IL", 700,
                                "Vegan Thai Green Curry with Seitan and Vegetables");
                MealsInfo c53 = new MealsInfo("B'Gabs Goodies", "Vegan", "Chicago, IL", c53_b, c53_l, c53_d);

                Meal c54_b = new Meal("Egg Harbor Cafe - Libertyville, IL", 400,
                                "Paleo Omelette with Grilled Chicken and Vegetables");
                Meal c54_l = new Meal("Egg Harbor Cafe - Libertyville, IL", 550,
                                "Paleo Grass-fed Steak Salad with Avocado and Almonds");
                Meal c54_d = new Meal("Egg Harbor Cafe - Libertyville, IL", 700,
                                "Paleo Grilled Pork Chop with Charred Brussels Sprouts and Chimichurri Sauce");
                MealsInfo c54 = new MealsInfo("Egg Harbor Cafe", "Paleo", "Libertyville, IL",
                                c54_b, c54_l,
                                c54_d);

                Meal c55_b = new Meal("Yolk - Chicago, IL", 450, "Paleo Sweet Potato Hash with Bacon and Eggs");
                Meal c55_l = new Meal("Yolk - Chicago, IL", 600,
                                "Paleo Grilled Shrimp and Avocado Salad with Citrus Vinaigrette");
                Meal c55_d = new Meal("Yolk - Chicago, IL", 750,
                                "Paleo Grass-fed Beef Brisket with Roasted Vegetables");
                MealsInfo c55 = new MealsInfo("Yolk", "Paleo", "Chicago, IL", c55_b, c55_l,
                                c55_d);

                Meal c56_b = new Meal("LePeep Cafe - Mount Prospect, IL", 400,
                                "Paleo Scramble with Grilled Chicken and Roasted Vegetables");
                Meal c56_l = new Meal("LePeep Cafe - Mount Prospect, IL", 550,
                                "Paleo Bison Burger with Avocado and Sweet Potato Fries");
                Meal c56_d = new Meal("LePeep Cafe - Mount Prospect, IL", 700,
                                "Paleo Grilled Salmon with Asparagus and Lemon Butter Sauce");
                MealsInfo c56 = new MealsInfo("LePeep Cafe", "Paleo", "Mount Prospect, IL",
                                c56_b, c56_l, c56_d);

                Meal c57_b = new Meal("The Original Pancake House - Chicago, IL", 450,
                                "Paleo Breakfast Plate with Steak and Eggs");
                Meal c57_l = new Meal("The Original Pancake House - Chicago, IL", 600,
                                "Paleo Grilled Octopus with Vegetables and Olive Oil");
                Meal c57_d = new Meal("The Original Pancake House - Chicago, IL", 750,
                                "Paleo Grilled Chicken with Mushrooms and Spinach");
                MealsInfo c57 = new MealsInfo("The Original Pancake House", "Paleo",
                                "Chicago, IL", c57_b, c57_l,
                                c57_d);

                Meal c58_b = new Meal("Wildberry Pancakes and Cafe - Schaumburg, IL", 400,
                                "Paleo Breakfast Bowl with Sweet Potato and Grilled Chicken");
                Meal c58_l = new Meal("Wildberry Pancakes and Cafe - Schaumburg, IL", 550,
                                "Paleo Bone-in Ribeye with Grilled Vegetables and Chimichurri Sauce");
                Meal c58_d = new Meal("Wildberry Pancakes and Cafe - Schaumburg, IL", 700,
                                "Paleo Grilled Scallops with Cauliflower Puree and Pea Shoots");
                MealsInfo c58 = new MealsInfo("Wildberry Pancakes and Cafe", "Paleo",
                                "Schaumburg, IL", c58_b, c58_l,
                                c58_d);

                // Meal c59_1
                Meal c59_b = new Meal("Einstein Bros Bagels - Chicago, IL", 300,
                                "Low Carb Bacon and Cheese Egg Sandwich on Thin Bagel");
                Meal c59_l = new Meal("Einstein Bros Bagels - Chicago, IL", 450,
                                "Low Carb Grilled Chicken Salad with Broccoli and Almonds");
                Meal c59_d = new Meal("Einstein Bros Bagels - Chicago, IL", 650,
                                "Low Carb Grilled Salmon with Grilled Vegetables and Dijon Mustard Sauce");
                MealsInfo c59 = new MealsInfo("Einstein Bros Bagels", "Low Carb", "Chicago, IL", c59_b, c59_l,
                                c59_d);

                // Meal c59_2
                Meal c60_b = new Meal("Naf Naf Grill - Schaumburg, IL", 350,
                                "Low Carb Chicken Shawarma Bowl with Salad and Tzatziki Sauce");
                Meal c60_l = new Meal("Naf Naf Grill - Schaumburg, IL", 500,
                                "Low Carb Steak Kabob Plate with Salad and Vinaigrette");
                Meal c60_d = new Meal("Naf Naf Grill - Schaumburg, IL", 700,
                                "Low Carb Grilled Mahi-Mahi with Cauliflower Rice and Asparagus");
                MealsInfo c60 = new MealsInfo("Naf Naf Grill", "Low Carb", "Schaumburg, IL",
                                c60_b, c60_l,
                                c60_d);

                // Meal c59_3
                Meal c61_b = new Meal("Eggsperience - Glenview, IL", 300,
                                "Low Carb Mushroom and Swiss Omelette with Bacon");
                Meal c61_l = new Meal("Eggsperience - Glenview, IL", 450,
                                "Low Carb Grass-fed Beef Burger with Lettuce Wrap and Side Salad");
                Meal c61_d = new Meal("Eggsperience - Glenview, IL", 650,
                                "Low Carb Grilled Chicken Breast with Grilled Vegetables and Roasted Garlic Butter");
                MealsInfo c61 = new MealsInfo("Eggsperience", "Low Carb", "Glenview, IL",
                                c61_b, c61_l, c61_d);

                Meal c62_b = new Meal("The Protein Bar - Chicago, IL", 350,
                                "Low Carb Scramble Bowl with Grilled Chicken and Spinach");
                Meal c62_l = new Meal("The Protein Bar - Chicago, IL", 500,
                                "Low Carb Grass-fed Beef Chili with Side Salad");
                Meal c62_d = new Meal("The Protein Bar - Chicago, IL", 700,
                                "Low Carb Grilled Atlantic Salmon with Grilled Asparagus and Lemon Butter Sauce");
                MealsInfo c62 = new MealsInfo("The Protein Bar", "Low Carb", "Chicago, IL",
                                c62_b,
                                c62_l,
                                c62_d);

                Meal c63_b = new Meal("The Original Pancake House - Glenview, IL", 300,
                                "Low Carb Spinach and Bacon Omelette with Fresh Fruit");
                Meal c63_l = new Meal("The Original Pancake House - Glenview, IL", 450,
                                "Low Carb Grilled Steak Salad with Avocado and Red Wine Vinaigrette");
                Meal c63_d = new Meal("The Original Pancake House - Glenview, IL", 200,
                                "Low Carb Chicken with Chocolate Chip Pancakes");
                MealsInfo c63 = new MealsInfo("The Original Pancake House", "Low Carb",
                                "Glenview, IL", c63_b,
                                c63_l, c63_d);

                Meal c64_b = new Meal("True Food Kitchen - Chicago, IL", 400,
                                "Paleo Huevos Rancheros with Grass-fed Steak");
                Meal c64_l = new Meal("True Food Kitchen - Chicago, IL", 550,
                                "Paleo Roasted Cauliflower Steak with Grilled Chicken");
                Meal c64_d = new Meal("True Food Kitchen - Chicago, IL", 750,
                                "Grilled Grass-fed Steak with Sautéed Vegetables");
                MealsInfo c64 = new MealsInfo("True Food Kitchen", "Paleo", "Chicago, IL", c64_b, c64_l, c64_d);

                Meal c65_b = new Meal("Ema - Chicago, IL", 300, "Paleo Shakshuka with Grass-fed Lamb");
                Meal c65_l = new Meal("Ema - Chicago, IL", 500,
                                "Paleo Chicken and Avocado Salad with Lemon Vinaigrette");
                Meal c65_d = new Meal("Ema - Chicago, IL", 700,
                                "Grilled Grass-fed Steak with Roasted Vegetables");
                MealsInfo c65 = new MealsInfo("Ema", "Paleo", "Chicago, IL", c65_b, c65_l, c65_d);

                Meal c66_b = new Meal("RPM Italian - Chicago, IL", 400,
                                "Paleo Smoked Salmon Benedict with Mixed Greens");
                Meal c66_l = new Meal("RPM Italian - Chicago, IL", 550,
                                "Paleo Grilled Chicken Salad with Cilantro Lime Vinaigrette");
                Meal c66_d = new Meal("RPM Italian - Chicago, IL", 800,
                                "Dry Aged Ribeye with Roasted Broccoli and Garlic Butter");
                MealsInfo c66 = new MealsInfo("RPM Italian", "Paleo", "Chicago, IL", c66_b, c66_l, c66_d);

                Meal c67_b = new Meal("Beatrix Market - Chicago, IL", 350,
                                "Paleo Steak and Egg Bowl with Sweet Potato");
                Meal c67_l = new Meal("Beatrix Market - Chicago, IL", 500,
                                "Paleo Grass-fed Steak Salad with Avocado and Tomatoes");
                Meal c67_d = new Meal("Beatrix Market - Chicago, IL", 750,
                                "Grilled Branzino with Roasted Vegetables and Lemon-Caper Vinaigrette");
                MealsInfo c67 = new MealsInfo("Beatrix Market", "Paleo", "Chicago, IL", c67_b, c67_l, c67_d);

                Meal c68_b = new Meal("Aloha Poke Co. - Chicago, IL", 400,
                                "Paleo Poke Bowl with Ahi Tuna and Mixed Greens");
                Meal c68_l = new Meal("Aloha Poke Co. - Chicago, IL", 550,
                                "Paleo Grilled Salmon with Charred Broccoli and Lemon-Garlic Vinaigrette");
                Meal c68_d = new Meal("Aloha Poke Co. - Chicago, IL", 800,
                                "Grilled Grass-fed Ribeye with Roasted Mushrooms and Truffle Butter");
                MealsInfo c68 = new MealsInfo("Aloha Poke Co.", "Paleo", "Chicago, IL", c68_b, c68_l, c68_d);

                Meal c69_b = new Meal("Wildberry Pancakes and Cafe - Schaumburg, IL", 400,
                                "Gluten-Free Belgian Waffles with Mixed Berries");
                Meal c69_l = new Meal("Wildberry Pancakes and Cafe - Schaumburg, IL", 550,
                                "Gluten-Free Grilled Chicken Sandwich with Avocado");
                Meal c69_d = new Meal("Wildberry Pancakes and Cafe - Schaumburg, IL", 750,
                                "Gluten-Free Grilled Steak with Roasted Vegetables");
                MealsInfo c69 = new MealsInfo("Wildberry Pancakes and Cafe", "Gluten-Free", "Schaumburg, IL", c69_b,
                                c69_l, c69_d);

                Meal c70_b = new Meal("Hash - Chicago, IL", 350,
                                "Gluten-Free Breakfast Hash with Kale and Sweet Potato");
                Meal c70_l = new Meal("Hash - Chicago, IL", 500,
                                "Gluten-Free Chicken Pot Pie with Seasonal Vegetables");
                Meal c70_d = new Meal("Hash - Chicago, IL", 700,
                                "Grilled Grass-fed Hanger Steak with Sautéed Mushrooms");
                MealsInfo c70 = new MealsInfo("Hash", "Gluten-Free", "Chicago, IL", c70_b, c70_l, c70_d);

                Meal c71_b = new Meal("The Biscuit Man - Chicago, IL", 400,
                                "Gluten-Free Biscuit Sandwich with Scrambled Eggs and Bacon");
                Meal c71_l = new Meal("The Biscuit Man - Chicago, IL", 550,
                                "Gluten-Free Quinoa Crunch Bowl with Grilled Chicken");
                Meal c71_d = new Meal("The Biscuit Man - Chicago, IL", 800,
                                "Gluten-Free Grilled Lamb Chops with Roasted Root Vegetables");
                MealsInfo c71 = new MealsInfo("The Biscuit Man", "Gluten-Free", "Chicago, IL", c71_b, c71_l, c71_d);

                Meal c72_b = new Meal("Dove's Luncheonette - Chicago, IL", 350,
                                "Gluten-Free Chorizo and Egg Tacos with Avocado Salsa");
                Meal c72_l = new Meal("Dove's Luncheonette - Chicago, IL", 500,
                                "Gluten-Free Chicken Salad Sandwich on Gluten-Free Bread");
                Meal c72_d = new Meal("Dove's Luncheonette - Chicago, IL", 700,
                                "Grilled Eggplant with Roasted Tomatoes and Cashew Cream");
                MealsInfo c72 = new MealsInfo("Dove's Luncheonette", "Gluten-Free", "Chicago, IL", c72_b, c72_l, c72_d);

                Meal c73_b = new Meal("Sapori Antichi Bar Italiano - Chicago, IL", 400,
                                "Gluten-Free Frittata with Spinach and Goat Cheese");
                Meal c73_l = new Meal("Sapori Antichi Bar Italiano - Chicago, IL", 550,
                                "Gluten-Free Grass-fed Steak Salad with Avocado and Tomatoes");
                Meal c73_d = new Meal("Sapori Antichi Bar Italiano - Chicago, IL", 800,
                                "Grilled Grass-fed Skirt Steak with Caramelized Onion and Guacamole");
                MealsInfo c73 = new MealsInfo("Sapori Antichi Bar Italiano", "Gluten-Free", "Chicago, IL", c73_b, c73_l,
                                c73_d);

                MealsInfo[] meals = new MealsInfo[72];

                meals[0] = c1;
                meals[1] = c2;
                meals[2] = c3;
                meals[3] = c4;
                meals[4] = c5;
                meals[5] = c6;
                meals[6] = c7;
                meals[7] = c8;
                meals[8] = c9;
                meals[9] = c10;
                meals[10] = c12;
                meals[11] = c13;
                meals[12] = c14;
                meals[13] = c15;
                meals[14] = c16;
                meals[15] = c17;
                meals[16] = c18;
                meals[17] = c19;
                meals[18] = c20;
                meals[19] = c21;
                meals[20] = c22;
                meals[21] = c23;
                meals[22] = c24;
                meals[23] = c25;
                meals[24] = c26;
                meals[25] = c27;
                meals[26] = c28;
                meals[27] = c29;
                meals[28] = c30;
                meals[29] = c31;
                meals[30] = c32;
                meals[31] = c33;
                meals[32] = c34;
                meals[33] = c35;
                meals[34] = c36;
                meals[35] = c37;
                meals[36] = c38;
                meals[37] = c39;
                meals[38] = c40;
                meals[39] = c41;
                meals[40] = c42;
                meals[41] = c43;
                meals[42] = c44;
                meals[43] = c45;
                meals[44] = c46;
                meals[45] = c47;
                meals[46] = c48;
                meals[47] = c49;
                meals[48] = c50;
                meals[49] = c51;
                meals[50] = c52;
                meals[51] = c53;
                meals[52] = c54;
                meals[53] = c55;
                meals[54] = c56;
                meals[55] = c57;
                meals[56] = c58;
                meals[57] = c59;
                meals[58] = c60;
                meals[59] = c61;
                meals[60] = c62;
                meals[61] = c63;
                meals[62] = c64;
                meals[63] = c65;
                meals[64] = c66;
                meals[65] = c67;
                meals[66] = c68;
                meals[67] = c69;
                meals[68] = c70;
                meals[69] = c71;
                meals[70] = c72;
                meals[71] = c73;

                return meals;

        }
}
