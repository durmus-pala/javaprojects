public class SumOddRange {
    public static boolean isOdd(int num1){
        if(num1 < 0){
            return false;
        }else if(num1 % 2 == 1){
            return true;
        }
        return false;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if((end < start) || (start < 0 || end < 0)){
            return -1;
        }
        for(int i = start; i <= end; i++){
            if(isOdd(i) == true){
                sum += i;
            }
        }
        return sum;
    }
}
