public class Test {
    public static int testif(int Val,int target){
         System.out.println("Test if else , return");
        int result =0;
        if(Val>target)
            result=1;
        else if(Val<target)
            result=-1;
        else {
            System.out.println("They are equal");
            result=0;
        }
        return result;
    }
}
