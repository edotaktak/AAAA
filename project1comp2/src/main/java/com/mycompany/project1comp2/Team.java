package com.mycompany.project1comp2;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String shortName;
    private String fullName;
    private int totalValue;
    private int size;
    private static int maxSize = 22;

    Team(String shortName, String fullName) {
        this.shortName = shortName;
        this.fullName = fullName;
    }

    String getShortName() {
        return this.shortName;
    }

    String getFullName() {
        return this.fullName;
    }

    int getTotalValue() {
        return this.totalValue;
    }

    int getSize() {
        return this.size;
    }

    public String toString() {
        String totalValue = String.valueOf(this.totalValue);
        String size = String.valueOf(this.size);
        String allInfos2 = this.fullName+"\t"+this.shortName+"\n";
        return allInfos2;
    }
    
}
