public class MegaBytesConverters {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int remainingkilobytes;
        int megabytes;
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {
            megabytes = kiloBytes / 1024;
            remainingkilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingkilobytes + " KB");
        }
    }
    }
