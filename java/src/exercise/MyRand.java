package exercise;
import java.util.Random;
public class MyRand{
    public static int testRandom(){
        Random r = new Random();
        int num = r.nextInt(100);
        return num;
    }
}
