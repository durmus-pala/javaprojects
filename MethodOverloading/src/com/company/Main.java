package com.company;

public class Main {

    public static void main(String[] args) {
        int NewScore = Main.calculateScore("durmus", 500);
        System.out.println("New Score is " + NewScore);
        Main.calculateScore(200);
        Main.calculateScore();
    }

    public static int calculateScore(String PlayerName, int Score) {
        System.out.println("Player " + PlayerName + " scored " + Score + " points");
        return Score * 1000;
    }

    public static int calculateScore(int Score) {
        System.out.println("Unnamed Player scored " + Score + " points");
        return Score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player name, no player score");
        return 0;
    }
}
