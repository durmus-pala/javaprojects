package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.getDurationString(75,45));
        System.out.println(Main.getDurationString(3945));
    }
    private static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || (seconds <0 || seconds > 59)){
           return "Invalid Value";
        }

        int hours = minutes / 60;
        int remainingminutes = minutes % 60;
        return hours + "h " + remainingminutes + "m " + seconds + "s";
    }
    private static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid Value";
        }
        int minutes = seconds / 60;
        int remainingseconds = seconds % 60;

        return getDurationString(minutes, remainingseconds);
    }
}
