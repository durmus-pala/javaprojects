public class GreatestCommonDivisor {
    public static int getGeratestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)){
            return -1;
        }
        int divisor = 1;
        if (first <= second) {
            for (int i = 1; i <= first; i++) {
                if ((first % i == 0) && (second % i == 0)) {
                    divisor = i;
                }
            }
        }
        if (first > second) {
            for (int j = 1; j <= second; j++) {
                if ((first % j == 0) && (second % j == 0)) {
                    divisor = j;
                }
            }
        }
        return divisor;
    }
}

