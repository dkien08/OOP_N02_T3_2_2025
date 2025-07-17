package exercise;
public class Flower {
    int petalCount=0;
    String s = new String("NULL");
    Flower(int petals){petalCount = petals;}
   // Flower(String ss){s =ss;}
    Flower(String s, int petals){
        this(petals);
        this.s=s;
    }
    Flower(){this("hi",47);}
    private static String name;
    public static String getName(){
        return name;
    }
    public static void setName(String newName){
        name = newName;
    }
    }
