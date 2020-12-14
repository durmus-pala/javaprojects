public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int sum = (5 * bigCount) + smallCount;
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if(sum < goal){
            return false;
        }
        if(sum == goal){
            return true;
        }
        if((sum > goal) && (sum - goal) % 5 <= smallCount){
            return true;
        }else{
            return false;
        }
    }
}
