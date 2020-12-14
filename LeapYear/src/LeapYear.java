public class LeapYear {

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

    }



