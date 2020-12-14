public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum){
        int number1 = (int) (firstNum * 1000);
        int number2 = (int) (secondNum * 1000);
        if(number1 == number2){
            System.out.println(number1 + " It's equal " + number2);
            return  true;
        } else {
            System.out.println("It's not");
            return false;
        }
    }
}