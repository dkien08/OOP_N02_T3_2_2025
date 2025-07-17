package exercise;
public class PassObject {
    public static void f(Number m){
        m.i = 15;
       }
    
public class TestPassObject {
   public static void testF(){
    System.out.println("Test Pass Object");
    Number n = new Number();
    n.i =14;
    PassObject.f(n);
    System.out.println(n.i);
   }
    
}
}
