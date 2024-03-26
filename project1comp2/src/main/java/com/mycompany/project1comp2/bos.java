package com.mycompany.project1comp2;

import java.util.ArrayList;
import java.util.List;

public class bos {

    public static void main(String[] args) {
        int a = 93;
        String b = "sacha";
        String Deff = "Deffender";
        Player Sacha = new Player("Sacha Boey", 93, "Deffender", 35000.0);
        List<Player> players = new ArrayList<>();
        players.add(Sacha);
        System.out.println(players);

        List<Team> teams = new ArrayList<>();
        Team GS = new Team("GS", "Galatasaray");
        Team FB = new Team("FB", "Fenerbahçe");
        Team BJK = new Team("BJK", "Beşiktaş");
        teams.add(FB);
        teams.add(GS);
        teams.add(BJK);
        System.out.println(teams);

    }
}


