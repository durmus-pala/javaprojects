public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("Circle.Radius= " + circle.getRadius());
        System.out.println("Circle.Area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("Cylinder.Radius= " + cylinder.getRadius());
        System.out.println("Cylinder.Height= " + cylinder.getHeight());
        System.out.println("Cylinder.Area= " + cylinder.getArea());
        System.out.println("Cylinder.Volume= " + cylinder.getVolume());

    }


}
