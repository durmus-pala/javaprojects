public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int tempreture){
        boolean Catplay = true;
        if((summer == true) && (tempreture >= 25 && tempreture <= 45)){
            Catplay = true;
            System.out.println(Catplay);
        }else if((summer == false) && (tempreture >= 25 && tempreture <= 35)){
            Catplay = true;
            System.out.println(Catplay);
        }else{
            Catplay = false;
            System.out.println(Catplay);
        }
        return Catplay;
    }
}
