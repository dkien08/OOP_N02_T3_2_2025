import exercise.Number;
import exercise.PassObject;

public class TestPassObject {
   public static void testF(){
    System.out.println("Test Pass Object");
    Number n = new Number();
    n.i =14;
    PassObject.f(n);
    System.out.println(n.i);
   }
    
}
