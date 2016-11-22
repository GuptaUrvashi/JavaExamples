package com.urvashigupta;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        Team<FootballPlayer>machester = new Team<>("Manchester United");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        /*Team <BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs")
        footballLeague.add(baseballTeam);*/

        footballLeague.add(machester);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        hawthorn.matchResult(fremantle, 1,0);
        hawthorn.matchResult(machester, 3,8);
        machester.matchResult(fremantle,2,1);

        footballLeague.showLeagueTable();


    }
}
