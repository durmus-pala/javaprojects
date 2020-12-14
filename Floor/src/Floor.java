public class Floor {
    private double length;
    private double width;
    public Floor(double length, double width) {
        if (length < 0) {
            length = 0;
        }
        if (width < 0) {
            width = 0;
        }
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        double area = (double) (length * width);
        return area;
    }
}

