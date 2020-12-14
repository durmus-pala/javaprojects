package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	FootballPlayer Joe = new FootballPlayer("Joe");
	BaseballPlayer Pat = new BaseballPlayer("Pat");
	SoccerPlayer Beckham = new SoccerPlayer("Beckham");

	Team<FootballPlayer> AdeleideCrows = new Team<>("AdeleideCrows");
	AdeleideCrows.addPlayer(Joe);
	//AdeleideCrows.addPlayer(Pat);
	//AdeleideCrows.addPlayer(Beckham);

        System.out.println(AdeleideCrows.numPlayer());

        Team<BaseballPlayer> BaseballTeam = new Team<>("Chicago Cubs");
        BaseballTeam.addPlayer(Pat);

        Team<FootballPlayer> Melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        Melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.MatchResult(fremantle, 1,0);
        hawthorn.MatchResult(AdeleideCrows,3, 8);

        AdeleideCrows.MatchResult(fremantle, 2,1);
       // AdeleideCrows.MatchResult(BaseballTeam, 1,1);

        System.out.println("Rankings:");
        System.out.println(AdeleideCrows.getName() + ": " + AdeleideCrows.ranking());
        System.out.println(Melbourne.getName() + ": " + Melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(AdeleideCrows.compareTo(Melbourne));
        System.out.println(AdeleideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(AdeleideCrows));
        System.out.println(Melbourne.compareTo(fremantle));

        League<Team<FootballPlayer>> footballleague = new League<Team<FootballPlayer>>("AFL");
        footballleague.add(Melbourne);
        footballleague.add(AdeleideCrows);
        footballleague.add(fremantle);
        footballleague.add(hawthorn);

        footballleague.showLeaugeTable();


    }
}
