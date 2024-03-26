package com.mycompany.project1comp2;
import java.util.ArrayList;
import java.util.List;
public class Contract {

    private Player player;
    private Team team;
    private String type;
    private double value;

    public Contract(Player player, Team team, String type, double value) {
        this.player = player;
        this.team = team;
        this.type = type;
    }

    //getter kısmı
    public Player getPlayer() {
        return player;
    }

    public Team gerTeam() {
        return team;
    }

    public String getType() {
        return type;
    }

    public double getVaLue() {
        return value;
    }

    //setter kısmı 
    public void setPlayer(Player player) {

    }

    public void setTeam(Team team) {

    }

    public void setType(String type) {
        if (type.equals("Permanent") || type.equals("Rented")) {
            this.type = type;
        } else {
            System.out.println("Invalid contract type");

        }

    }
      public void setValue(double value){
        this.value = value;
        
    }

}
