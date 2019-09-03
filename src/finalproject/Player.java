/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author eli
 */
public class Player {
    
    String fName;
    String lName;
    String jerseyNumber;
    int goals;
    int shotsOnGoal;
    int fouls;
    int offsides;
    int assists;
    int yellowCards;
    int redCards;
    
    public Player() {
    }

    public Player(String fName, String lName, String jerseyNumber, int goals, int fouls, int shotsOnGoal, int offsides, int assists, int yellowCards, int redCards) {
        this.fName = fName;
        this.lName = lName;
        this.jerseyNumber = jerseyNumber;
        this.goals = goals;
        this.fouls = fouls;
        this.shotsOnGoal = shotsOnGoal;
        this.offsides = offsides;
        this.assists = assists;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
    }
    
    public String getFullName() {
        return fName + " " + lName;
    }
    
    public void setFName(String fName) {
        
        this.fName = fName;
    }
    
    public void setLName(String lName) {
        
        this.lName = lName;
    }

    public void setJerseyNumber (String jNumber) {
        this.jerseyNumber = jNumber;
    }
    
    public String getJerseyNumber() {
    
        return jerseyNumber;
    }
    
    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getFouls() {
        return fouls;
    }

    public void setFouls(int fouls) {
        this.fouls = fouls;
    }
    
    public int getShotsOnGoal() {
        return shotsOnGoal;
    }

    public void setShotsOnGoal(int shotsOnGoal) {
        this.shotsOnGoal = shotsOnGoal;
    }

    public int getOffsides() {
        return offsides;
    }

    public void setOffsides(int offsides) {
        this.offsides = offsides;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }
    
    public int getRedCards() {
        return redCards;
    }

    public void setRedCards(int redCards) {
        this.redCards = redCards;
    }
    
    
    
    public void setPlayerStats(String fName, String lName, String jerseyNumber,int goals, int shotsOnGoal, int fouls, int offsides, int assists, int yellowCards, int redCards) {
        
        this.fName = fName;
        this.lName = lName;
        this.goals = goals;
        this.jerseyNumber = jerseyNumber;
        this.shotsOnGoal = shotsOnGoal;
        this.fouls = fouls;
        this.offsides = offsides;
        this.assists = assists;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
                
    }
    
}

