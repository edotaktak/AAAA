package com.mycompany.project1comp2;
import java.util.ArrayList;
import java.util.List;
public class Player {

    private int backNumber;
    private String name;
    private String position;
    private double marketValue;
    private String currentTeam;
    private String previousTeam;
    private int goalNumber;

    Player(String name, int backNumber, String position,double marketting) {
        this.name = name;
        this.backNumber = backNumber;
        this.position = position;
        this.marketValue=marketting;
    }

    int getBackNumber() {
        return this.backNumber;
    }

    String getName() {
        return this.name;
    }

   /* public String toString() {
        String marketValue = String.valueOf(this.marketValue);
        String backNumber = String.valueOf(this.backNumber);
        String allInfos = "Player name:" + this.name + " Market Value:" + marketValue + " Back Number:" + backNumber + " Position" + this.position + " Current team:" + this.currentTeam;
        return allInfos;
    }*/

    public void setTeam(String newTeam) {
        this.previousTeam = this.currentTeam;
        this.currentTeam = newTeam;
    }

    String getPosition() {
        return this.position;
    }

    double getMarketValue() {
        return this.marketValue;
    }

    String getCurrentTeam() {
        return this.currentTeam;
    }

    String getPreviousTeam() {
        return this.previousTeam;
    }

}
