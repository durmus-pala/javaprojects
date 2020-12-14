public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }

        for (int row = 1; row <= number; row++) {
            if (row == 1 || row == number) {
                for (int i = 1; i <= number; i++) {
                    System.out.print("*");
                }
                System.out.println();
                continue;
            }
            for (int column = 1; column <= number; column++) {
                if (column == 1 || row == column || column == number - row + 1) {
                    System.out.print("*");
                    continue;
                }
                if (column == number) {
                    System.out.print("*");
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}



