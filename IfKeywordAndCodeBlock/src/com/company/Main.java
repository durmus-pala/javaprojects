package com.company;

public class Main {

    public static void main(String[] args) {
	boolean GameOver = true;
	int Score = 3000;
	int LevelCompleted = 5;
	int bonus = 100;

	if(Score < 5000 && Score > 1000){
        System.out.println("Your Score was less than 5000 but more than 1000");
            } else if(Score < 1000){
			System.out.println("Your Score was less than 1000");
		}
	else{
		System.out.println("Got here");
	}
if(GameOver){
	int FinalScore = Score + (LevelCompleted * bonus);
	FinalScore += 1000;
	System.out.println("Your final score was " + FinalScore);
}
		boolean NewGameOver = true;
		int NewScore = 10000;
		int NewLevelCompleted = 8;
		int Newbonus = 200;

		if(GameOver){
			int NewFinalScore = NewScore + (NewLevelCompleted * Newbonus);
			System.out.println("Your new final score was " + NewFinalScore);
		}
		 GameOver = true;
		 Score = 10000;
		 LevelCompleted = 8;
		 bonus = 200;
		if(GameOver){
			int FinalScore = Score + (LevelCompleted * bonus);
			System.out.println("Your final score was " + FinalScore);
		}
    }
}
