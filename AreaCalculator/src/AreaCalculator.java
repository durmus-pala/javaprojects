public class AreaCalculator {

    public static double area(double radius){
        if(radius < 0){
            System.out.println("Invalid Value");
            return -1;
        }else{
            double result1 = (double) (Math.PI * radius *radius);
            System.out.println(result1);
            return result1;
        }
    }
    public static double area(double x, double y){
        if(x < 0 || y < 0){
            System.out.println("Invalid Value");
            return -1;
        }else{
            double result2 = (double) (x * y);
            System.out.println(result2);
            return result2;
        }
    }
}
