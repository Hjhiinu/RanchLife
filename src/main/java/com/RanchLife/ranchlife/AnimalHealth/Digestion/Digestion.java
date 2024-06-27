package com.RanchLife.ranchlife.AnimalHealth.Digestion;

public class Digestion {
    private int digestion_evaluation;
    public Digestion(){
        this.digestion_evaluation=100;
    }
    public int getDigestion_evaluation() {
        return digestion_evaluation;
    }

    public void setDigestion_evaluation(int digestion_evaluation) {
        this.digestion_evaluation = digestion_evaluation;
    }
    public void increaseDigestion_evaluation() {
        this.digestion_evaluation ++;
    }
    public void decreaseDigestion_evaluation() {
        this.digestion_evaluation --;
    }
}
