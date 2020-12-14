public class Main {
 public static void main(String[] args) {
  Wall wall1 = new Wall();
  Wall wall2 = new Wall(25.2, 32.5);
  System.out.println("width = " + wall2.getWidth());
  System.out.println("height = " + wall2.getHeight());
  System.out.println("Area = " + wall2.getArea());
  wall1.setHeight(27);
  System.out.println(wall1.getHeight());
 }

}
