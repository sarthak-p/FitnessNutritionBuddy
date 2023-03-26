package com.cs440;

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
        Meal c1_d = new Meal("Kenya's Keto Kitchen - Chicago, IL", 800, "Grilled salmon with steamed vegetables");
        MealsInfo c1 = new MealsInfo("Kenya's Keto Kitchen", "Keto", "Chicago, IL", c1_b, c1_l, c1_d);

        Meal c2_b = new Meal("Dirty Root - Chicago, IL", 350, "Greek yogurt with berries and nuts");
        Meal c2_l = new Meal("Dirty Root - Chicago, IL", 500, "Grilled chicken wrap with vegetables");
        Meal c2_d = new Meal("Dirty Root - Chicago, IL", 750, "Grilled steak with roasted vegetables");
        MealsInfo c2 = new MealsInfo("Dirty Root", "Low Carb", "Chicago, IL", c2_b, c2_l, c2_d);

        Meal c3_b = new Meal("CRAFT Donuts + Coffee - Chicago, IL", 450, "Keto donut with coffee");
        Meal c3_l = new Meal("CRAFT Donuts + Coffee - Chicago, IL", 550, "Avocado toast with grilled chicken");
        Meal c3_d = new Meal("CRAFT Donuts + Coffee - Chicago, IL", 750, "Grilled shrimp with zucchini noodles");
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
        Meal c8_l = new Meal("The Water Bar - Geneva, IL", 600, "Grilled chicken salad with gluten-free croutons");
        Meal c8_d = new Meal("The Water Bar - Geneva, IL", 800, "Grilled salmon with gluten-free pasta");
        MealsInfo c8 = new MealsInfo("The Water Bar", "Gluten Free", "Geneva, IL", c8_b, c8_l, c8_d);

        Meal c9_b = new Meal("Alice and Friends Vegan Kitchen - Chicago, IL", 350, "Vegan pancakes with fruit compote");
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
        MealsInfo c13 = new MealsInfo("Protein Bar and Kitchen", "Low Carb", "Chicago, IL", c13_b, c13_l, c13_d);

        Meal c14_b = new Meal("Purple Sprout Concious Organic - Buffalo Grove, IL", 350,
                "Vegan quinoa bowl with mixed vegetables");
        Meal c14_l = new Meal("Purple Sprout Concious Organic - Buffalo Grove, IL", 500,
                "Vegan wrap with tofu and avocado");
        Meal c14_d = new Meal("Purple Sprout Concious Organic - Buffalo Grove, IL", 700,
                "Vegan lentil soup with gluten-free crackers");
        MealsInfo c14 = new MealsInfo("Purple Sprout Concious Organic", "Vegan", "Buffalo Grove, IL", c14_b, c14_l,
                c14_d);

        Meal c15_b = new Meal("LYFE Kitchen - Chicago, IL", 350,
                "Vegan breakfast burrito with tofu scramble and vegetables");
        Meal c15_l = new Meal("LYFE Kitchen - Chicago, IL", 500, "Vegan quinoa salad with mixed greens and avocado");
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
        Meal c17_l = new Meal("Harvest Room - Palos Heights, IL", 500, "Vegan wrap with hummus and mixed vegetables");
        Meal c17_d = new Meal("Harvest Room - Palos Heights, IL", 700, "Vegan lentil soup with gluten-free crackers");
        MealsInfo c17 = new MealsInfo("Harvest Room", "Vegan", "Palos Heights, IL", c17_b, c17_l, c17_d);

        Meal c18_b = new Meal("Sweet Natalies Gluten Free Bakery/Baby Doll Bakery - Wheaton, IL", 400,
                "Gluten-free banana bread with almond butter");
        Meal c18_l = new Meal("Sweet Natalies Gluten Free Bakery/Baby Doll Bakery - Wheaton, IL", 600,
                "Grilled chicken sandwich on gluten-free bread");
        Meal c18_d = new Meal("Sweet Natalies Gluten Free Bakery/Baby Doll Bakery - Wheaton, IL", 800,
                "Grilled salmon with gluten-free pasta");
        MealsInfo c18 = new MealsInfo("Sweet Natalies Gluten Free Bakery/Baby Doll Bakery", "Gluten Free",
                "Wheaton, IL", c18_b, c18_l, c18_d);

        Meal c19_b = new Meal("Da Luciano's - Rivers Grove, IL", 400, "Gluten-free oatmeal with fruit and nuts");
        Meal c19_l = new Meal("Da Luciano's - Rivers Grove, IL", 600,
                "Grilled chicken salad with gluten-free croutons");
        Meal c19_d = new Meal("Da Luciano's - Rivers Grove, IL", 800, "Grilled salmon with gluten-free pasta");
        MealsInfo c19 = new MealsInfo("Da Luciano's", "Gluten Free", "Rivers Grove, IL", c19_b, c19_l, c19_d);

        Meal c20_b = new Meal("Wheat's End Cafe & Bakery - Chicago, IL", 400, "Gluten-free pancakes with maple syrup");
        Meal c20_l = new Meal("Wheat's End Cafe & Bakery - Chicago, IL", 600,
                "Gluten-free grilled cheese with tomato soup");
        Meal c20_d = new Meal("Wheat's End Cafe & Bakery - Chicago, IL", 800, "Gluten-free pasta with meatballs");
        MealsInfo c20 = new MealsInfo("Wheat's End Cafe & Bakery", "Gluten Free", "Chicago, IL", c20_b, c20_l, c20_d);

        Meal c21_b = new Meal("Maggiano's Little Italy - Schaumburg, IL", 400,
                "Gluten-free bruschetta with tomato and basil");
        Meal c21_l = new Meal("Maggiano's Little Italy - Schaumburg, IL", 600,
                "Gluten-free chicken parmesan with spaghetti");
        Meal c21_d = new Meal("Maggiano's Little Italy - Schaumburg, IL", 800,
                "Gluten-free steak with mashed potatoes");
        MealsInfo c21 = new MealsInfo("Maggiano's Little Italy", "Gluten Free", "Schaumburg, IL", c21_b, c21_l, c21_d);

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
        MealsInfo c23 = new MealsInfo("Augustino's Rock and Roll Deli and Grill", "Gluten Free", "Carol Stream, IL",
                c23_b,
                c23_l, c23_d);

        Meal c24_b = new Meal("Nature's Best Cafe - Naperville, IL", 350,
                "Vegan breakfast bowl with quinoa and mixed berries");
        Meal c24_l = new Meal("Nature's Best Cafe - Naperville, IL", 500,
                "Vegan wrap with hummus and mixed vegetables");
        Meal c24_d = new Meal("Nature's Best Cafe - Naperville, IL", 700, "Vegan sweet potato curry with brown rice");
        MealsInfo c24 = new MealsInfo("Nature's Best Cafe", "Vegan", "Naperville, IL", c24_b, c24_l, c24_d);

        Meal c25_b = new Meal("Sweetgreen - Schaumburg, IL", 400, "Kale salad with roasted vegetables and vinaigrette");
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
        Meal c30_d = new Meal("Panera Bread - River Forest, IL", 800, "Keto-friendly steak with cauliflower rice");
        MealsInfo c30 = new MealsInfo("Panera Bread", "Keto", "River Forest, IL", c30_b, c30_l, c30_d);

        Meal c31_b = new Meal("Panera Bread - Elmwood Park, IL", 400, "Keto-friendly avocado toast with eggs");
        Meal c31_l = new Meal("Panera Bread - Elmwood Park, IL", 600, "Keto-friendly chicken caesar salad");
        Meal c31_d = new Meal("Panera Bread - Elmwood Park, IL", 800, "Keto-friendly steak with cauliflower rice");
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

        Meal c36_b = new Meal("Taco Bell - Addison, IL", 400, "Keto-friendly breakfast taco with steak and eggs");
        Meal c36_l = new Meal("Taco Bell - Addison, IL", 600,
                "Keto-friendly grilled chicken power bowl with avocado and cheese");
        Meal c36_d = new Meal("Taco Bell - Addison, IL", 800,
                "Keto-friendly steak and shrimp fajitas with guacamole and sour cream");
        MealsInfo c36 = new MealsInfo("Taco Bell", "Keto", "Addison, IL", c36_b, c36_l, c36_d);

        Meal c37_b = new Meal("Taco Bell - Aurora, IL", 400, "Keto-friendly breakfast taco with steak and eggs");
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

        MealsInfo[] meals = new MealsInfo[42];

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

        return meals;

    }
}
