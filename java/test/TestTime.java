public class TestTime {
    public static void testTime(){
        Time t1 = new Time();
        System.out.println("1: "+ t1);
        Time t2 = new Time(10);
        System.out.println("2: "+ t2);
        Time t3 = new Time(10, 20);
        System.out.println("3: "+ t3);
        Time t4 = new Time(12, 30, 45);
        System.out.println("4: "+ t4);
    }
}
