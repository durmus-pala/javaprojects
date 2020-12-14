public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else{
            long hours = (long) (minutes / 60L);
            long dates = (long) (hours / 24L);
            long years = (long) (dates / 365L);
            long remainingdates = (long) (dates % 365L);
            System.out.println(minutes + " min = " + years + " y and "
                    + remainingdates + " d");
        }
    }
}
