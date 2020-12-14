public class EqualSumChecker{
    public static boolean hasEqualSum(int num1, int num2, int num3){
        boolean num4 = true;
        if(num1 + num2 == num3){
            num4 = true;
        }else{
            num4 = false;
        }
        System.out.println(num4);
        return num4;
    }
}
