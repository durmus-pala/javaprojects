public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double area = (double) (width * height);
        double bucketsneded = (double) (area / areaPerBucket);
        double extraneeded = bucketsneded - extraBuckets;
        int numberOfBuckets = (int) Math.ceil(extraneeded);
        return numberOfBuckets;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double area = (double) (width * height);
        double bucketsneded = (double) (area / areaPerBucket);
        int numberOfBuckets = (int) Math.ceil(bucketsneded);
        return numberOfBuckets;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double bucketsneded = (double) (area / areaPerBucket);
        int numberOfBuckets = (int) Math.ceil(bucketsneded);
        return numberOfBuckets;
    }
}
