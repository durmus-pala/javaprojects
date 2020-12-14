public class NumberToWords {
    public static void numbersToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        int number1 = reverse(number);
        int num = getDigitCount(number);
        for(int i = 0; i < num; i++){
            int lastdigit = number1 % 10;
            number1 = number1 / 10;
            switch (lastdigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }
    public static int reverse(int num1){
        int reversenum = 0;
        while(num1 != 0){
            int lastdigit = num1 % 10;
            reversenum = (reversenum * 10) + lastdigit;
            num1 = num1 / 10;
        }
        return reversenum;
    }
    public static int getDigitCount(int number){
        int count = 0;
        if(number < 0){
            return -1;
        }
        if(number == 0){
            count = 1;
        }
        while(number != 0){
            count ++;
            number = number /10;
        }
        return count;
    }
}
