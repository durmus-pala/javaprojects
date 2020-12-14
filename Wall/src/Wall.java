public class Wall {
    private double width;
    private double height;

     public Wall(){
         if(width < 0){
             width = 0;
         }
         if(height < 0){
             height = 0;
         }
         this.width = width;
         height = height;
     }
     public Wall(double width, double height){
         if(width < 0){
             width = 0;
         }
         if(height < 0){
             height = 0;
         }
         this.width = width;
         this.height = height;
     }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        if(width < 0){
            width = 0;
        }
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        if(height < 0){
            height = 0;
        }
        this.height = height;
    }
    public double getArea(){
        return this.width * height;
    }
}
