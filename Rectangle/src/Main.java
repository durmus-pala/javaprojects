public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("Rectangle width= " + rectangle.getWidth());
        System.out.println("Rectangle length= " + rectangle.getLength());
        System.out.println("Rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,-1);
        System.out.println("Cuboid.Width= " + cuboid.getWidth());
        System.out.println("Cuboid.Length= " + cuboid.getLength());
        System.out.println("Cuboid.height= " + cuboid.getHeight());
        System.out.println("Cuboid.Area= " + cuboid.getArea());
        System.out.println("Cuboid.volume= " + cuboid.getVolume());
    }
}
