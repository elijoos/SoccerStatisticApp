/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import com.sun.media.jfxmedia.events.PlayerStateEvent;
import java.util.ArrayList;

/**
 *
 * @author eli
 */
public class Team {
    
    int goals;
    int shots;
    int shotsOnFrame;
    int possesion;
    int corners;
    int fouls; 
    int offsides;
    int yellowCards;
    int redCards;

    public Team() {
    }

    public Team(int goals, int shots, int shotsOnFrame, int possesion, int corners, int fouls, int offsides, int yellowCards, int redCards) {
        this.goals = goals;
        this.shots = shots;
        this.shotsOnFrame = shotsOnFrame;
        this.possesion = possesion;
        this.corners = corners;
        this.fouls = fouls;
        this.offsides = offsides;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
    }

    //list for players
    ArrayList<Player> players = new ArrayList();
    
    Player p1 = new Player();
    
    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public int getShotsOnFrame() {
        return shotsOnFrame;
    }

    public void setShotsOnFrame(int shotsOnFrame) {
        this.shotsOnFrame = shotsOnFrame;
    }

    public int getPossesion() {
        return possesion;
    }

    public void setPossesion(int possesion) {
        this.possesion = possesion;
    }

    public int getCorners() {
        return corners;
    }

    public void setCorners(int corners) {
        this.corners = corners;
    }

    public int getFouls() {
        return fouls;
    }

    public void setFouls(int fouls) {
        this.fouls = fouls;
    }

    public int getOffsides() {
        return offsides;
    }

    public void setOffsides(int offsides) {
        this.offsides = offsides;
    }

    public int getYellowCards() {
        return redCards;
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
    
    
}
