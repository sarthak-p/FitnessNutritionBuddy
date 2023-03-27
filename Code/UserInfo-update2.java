class UserInfo {
    public String email;
    public String password;
    public String name;
    public String gender;
    public int age;
    public int height;
    public int weight;
    public int calorie;
    public int carb;
    public int fat;
    public int protein;

    public int caloriesConsumed;

    public int carbsConsumed;

    public int fatConsumed;

    public int proteinConsumed;

    public int sodiumConsumed;

    //Constructor
    public UserInfo() {
        // placeholder
    }

    public UserInfo(String email, String password, String name, String gender, int age, int height, int weight, int calorie, int carb, int fat, int protein){
        this.email= email;
        this.password= password;
        this.name= name;
        this.gender= gender;
        this.age = age;
        this.height= height;
        this.weight= weight;
        this.calorie= calorie;
        this.carb= carb;
        this.fat= fat;
        this.protein= protein;
        this.caloriesConsumed = 0;
        this.carbsConsumed = 0;
        this.fatConsumed = 0;
        this.proteinConsumed = 0;
        this.sodiumConsumed = 0;
    }

    public static UserInfo[] createUserList(){
        UserInfo[] result = new UserInfo[20];

        result[0] = new UserInfo("john@gmail.com", "abcd", "John Smith" , "Male", 19, 170, 151, 2571, 352, 86, 98);
        result[1] = new UserInfo("matt@gmail.com", "bcde","Matt Smith" , "Male", 30, 183, 175, 2781, 373, 93, 114);
        result[2] = new UserInfo("jessica@gmail.com", "cdef","Jessica Smith" , "Female", 29, 160, 148, 2471, 320, 59, 143 );
        result[3] = new UserInfo("kevin@gmail.com", "defg","Kevin Smith" , "Male", 35, 175, 182, 2600, 329, 67, 67 );
        result[4] = new UserInfo("lisa@gmail.com", "efgh","Lisa Smith" , "Female", 40, 155, 167, 2871, 252, 76, 108 );
        result[5] = new UserInfo("jenny@gmail.com", "fghi","Jenny Smith" , "Female", 18, 177, 143, 2541, 342, 80, 132);
        result[6] = new UserInfo("jayden@gmail.com", "ghij","Jayden Smith" , "Male", 25, 161, 160, 1980, 302, 63, 101);
        result[7] = new UserInfo("howard@gmail.com", "hijk","Howard Smith" , "Male", 27, 182, 195, 2174, 320, 92, 90);
        result[8] = new UserInfo("james@gmail.com", "ijkl","James Smith" , "Male", 31, 158, 144, 2711, 369, 83, 92);
        result[9] = new UserInfo("david@gmail.com", "jklm","David Smith" , "Male", 60, 177, 163, 2482, 373, 86, 100 );

        result[10] = new UserInfo("rachel@gmail.com", "klmn","Rachel Smith" , "Female", 25, 160, 141, 2691, 372, 60, 160 );
        result[11] = new UserInfo("naomi@gmail.com", "lmno","Naomi Smith" , "Female", 23, 174, 171, 2485, 311, 71, 123);
        result[12] = new UserInfo("harry@gmail.com", "mnop","Harry Smith" , "Male", 54, 176, 188, 2364, 244, 68, 102);
        result[13] = new UserInfo("peter@gmail.com", "nopq","Peter Smith" , "Male", 38, 182, 196, 3051, 422, 111, 178);
        result[14] = new UserInfo("mark@gmail.com", "opqr","Mark Smith" , "Male", 32, 184, 180, 3167, 431, 102, 198);
        result[15] = new UserInfo("joeln@gmail.com", "pqrs","Joel Smith" , "Male", 21, 169, 178, 2364, 252, 57, 97);
        result[16] = new UserInfo("patricia@gmail.com", "qrst","Patricia Smith" , "Female", 24, 152, 138, 2184, 296, 74, 107);
        result[17] = new UserInfo("linda@gmail.com", "rstu","Linda Smith" , "Female", 28, 173, 186, 2432, 289, 77, 125);
        result[18] = new UserInfo("katy@gmail.com", "stuv","Katy Smith" , "Female", 58, 157, 151, 1989, 248, 59, 110);
        result[19] = new UserInfo("julia@gmail.com", "tuvw","Julia Smith" , "Female", 46, 172, 164, 2057, 267, 70, 90);

        return result;
    }

    public boolean check_email(String e){
        if(this.email.equals(e)){
          return true;
        }
        else{
          return false;
        }
    }

    public boolean check_password(String p){
        if(this.password.equals(p)){
          return true;
        }
        else{
          return false;
        }
    }

  
}