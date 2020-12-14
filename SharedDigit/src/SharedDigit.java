public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)){
            return false;
        }
        int firstdigitnum1 = num1 / 10;
        int seconddigitnum1 = num1 % 10;
        int firstdigitnum2 = num2 / 10;
        int seconddigitnum2 = num2 % 10;
        if ((firstdigitnum1 == firstdigitnum2) || (firstdigitnum1 == seconddigitnum2)
                || (seconddigitnum1 == firstdigitnum2) || (seconddigitnum1 == seconddigitnum2)){
            return true;
        }
        return false;
    }
}
