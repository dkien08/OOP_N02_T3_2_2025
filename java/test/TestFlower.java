public class TestFlower {
public static void testFlower(){
    Flower f = new Flower(5);
    System.out.println("Test flower: "+ f.petalCount);
    Flower.setName("Rose");
    System.out.println("Name of flower: " + Flower.getName() );
}
}
