import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                count++;
                sum += number;
            }else{
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        double avg =  (double) ((double)sum / (double)count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
