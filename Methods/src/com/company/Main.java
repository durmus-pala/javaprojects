package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        int Positioninthehighscore = calculateHighScorePosition(1500);
        displayHighScorePosition("zeynep", Positioninthehighscore);

        Positioninthehighscore = calculateHighScorePosition(900);
        displayHighScorePosition("durmus", Positioninthehighscore);

        Positioninthehighscore = calculateHighScorePosition(400);
        displayHighScorePosition("hamza", Positioninthehighscore);

        Positioninthehighscore = calculateHighScorePosition(50);
        displayHighScorePosition("hasan", Positioninthehighscore);

    }

    public static void displayHighScorePosition(String PlayerName, int Positioninthehighscore) {

        System.out.println(PlayerName + " managed to get into position "
                + Positioninthehighscore + " on the high score table");

    }

    public static int calculateHighScorePosition(int score) {

//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500 && score < 1000) {
//            return 2;
//        } else if (score >= 100 && score < 500) {
//            return 3;
//        } else {
//            return 4;
//       }
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500 && score < 1000) {
            position = 2;
        } else if (score >= 100 && score < 500) {
            position = 3;
        }
        return position;
    }
}







//        int HighScore= CaculateScore(true, 800, 5, 100);
//        System.out.println("Your final score was " + HighScore);//  }

//    public static int CaculateScore(boolean GameOver, int Score, int LevelCompleted, int bonus) {
//
//
//        if (GameOver) {
//            int FinalScore =  Score + (LevelCompleted * bonus);
//            FinalScore += 8000;
//            System.out.println("Your final score was " + FinalScore);
//            return FinalScore;
//
//                    } else {
//               System.out.println("Game is to be continued");
//               return -1;
//
//
//        }




