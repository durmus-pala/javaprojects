public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3){
        boolean num4 = true;
        if((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)){
            num4 = true;
        }else{
            num4 = false;
        }
        System.out.println(num4);
        return num4;
    }
    public static boolean isTeen(int num5){
        boolean num6 = true;
        if(num5 >= 13 && num5 <= 19){
            num6 = true;
        }else{
            num6 = false;
        }
        System.out.println(num6);
        return num6;
    }
}
