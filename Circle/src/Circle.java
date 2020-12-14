public class Circle {
    private double radius;
    public Circle(double radius) {
        if(radius < 0){
            this.radius = 0;
        }
        this.radius = radius;
    }
    public double getRadius() {
        if(radius < 0){
            this.radius = 0;
        }
        return radius;
    }
    public double getArea(){
        double area = (double) (this.radius * this.radius * Math.PI);
        return area;
    }
}
