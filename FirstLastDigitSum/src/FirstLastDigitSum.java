public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int lastdigit = number % 10;
        int firstdigit = 0;
        int num = number;
        while(num >= 10){
           num = num / 10;
        }
        firstdigit = num;
        int sum = lastdigit + firstdigit;
        return sum;
    }
}
