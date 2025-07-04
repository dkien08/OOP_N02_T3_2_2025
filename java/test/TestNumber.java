public class TestNumber{
public static void testkien(){
     System.out.println("Test Number");
    Number n1= new Number();
    Number n2= new Number();
    n1.i = 2;
    n2.i = 5;
    n1 = n2;
    n2.i = 10;
    System.out.println("test cua dkien" +n1.i);

    n1.i= 20;
    System.out.println(n2.i);

}
}
