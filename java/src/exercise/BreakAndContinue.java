package exercise;
public class BreakAndContinue {
    public static void testbac() {
        System.out.println("Break an Continue Test: ");
        for (int i = 0; i < 100; i++) {
            if (i == 74){
                System.out.println("Gia tri cua i: "+ i);
                break;
            }
            if (i % 9 != 0)
                continue;
            System.out.println(i);
        }

    }

}
