public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        boolean LeapYear;
        if (year <= 1 || year >= 9999) {
            LeapYear = false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            LeapYear = true;
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            LeapYear = true;
        }else{
            LeapYear = false;
        }
        System.out.println(LeapYear);
        return LeapYear;
    }
    public static int getDaysInMonth(int month, int year){
        int numberofday = 31;
        if((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        }
        switch(month){
            case 1:
                numberofday = 31;
                System.out.println(numberofday);
                break;
            case 2:
                if(isLeapYear(year) == true){
                    numberofday = 29;
                    System.out.println(numberofday);
                }else{
                    numberofday = 28;
                    System.out.println(numberofday);
                }
                break;
            case 3:
                numberofday = 31;
                System.out.println(numberofday);
                break;
            case 4:
                numberofday = 30;
                System.out.println(numberofday);
                break;
            case 5:
                numberofday = 31;
                System.out.println(numberofday);
                break;
            case 6:
                numberofday = 30;
                System.out.println(numberofday);
                break;
            case 7:
                numberofday = 31;
                System.out.println(numberofday);
                break;
            case 8:
                numberofday = 31;
                System.out.println(numberofday);
                break;
            case 9:
                numberofday = 30;
                System.out.println(numberofday);
                break;
            case 10:
                numberofday = 31;
                System.out.println(numberofday);
                break;
            case 11:
                numberofday = 30;
                System.out.println(numberofday);
                break;
            case 12:
                numberofday = 31;
                System.out.println(numberofday);
        }
        return numberofday;
    }
}
