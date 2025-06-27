public class TestShortCircuit {
   public static void testShortCircuit(){
   System.out.println("Test Short Circuit");
    if(ShortCircuit.test1(0)&&
        ShortCircuit.test2(2)&&
        ShortCircuit.test3(2))
     System.out.println("Expression is true");
    else System.out.println("Expression is false");
   }
}
