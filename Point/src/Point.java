public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(){
        this.x = x;
        this.y = y;
    }
    public Point(int x , int y){
        this.x = x;
        this.y = y;
    }
    public double distance(int a, int b){
        double distance = (double) Math.sqrt((a - x) * (a - x) + (b - y) * (b - y));
        return distance;
    }
    public double distance(Point point){
             return distance(point.getX(), point.getY());
    }
    public double distance(){
        double distance = (double) Math.sqrt((x * x) +  (y * y));
        return distance;
    }
}
