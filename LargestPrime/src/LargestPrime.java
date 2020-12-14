public class LargestPrime {
    public static int getLargestPrime(int number) {
        int primedivisor = 0;
        for (int i = 2; i <= number; i++) {
            int num = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    num++;
                }
            }
            if (num == 0) {
                if(number % i == 0){
                    primedivisor = i;
                }
            }
        }
        if ((number <= 0) || (number == 1)) {
            return -1;
        }
        return primedivisor;
    }
}

