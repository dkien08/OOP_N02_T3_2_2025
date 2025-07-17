package exercise;
import java.util.Random;
public class MyRandom{
    public static int testRandom(){
        Random r = new Random();
        int num = r.nextInt(100);
        System.out.println(num);
        return num;
    }
}
