public class TestPassObject {
   public static void testF(){
    Number2 n = new Number2();
    n.i =14;
    PassObject.f(n);
    System.out.println(n.i);
   }
    
}
