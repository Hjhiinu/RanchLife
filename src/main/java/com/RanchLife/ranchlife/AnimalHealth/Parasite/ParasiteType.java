package com.RanchLife.ranchlife.AnimalHealth.Parasite;

public enum ParasiteType {
    ROUNDWORMS(0.35),     //Digestion system
    LIVER_FLUKES(0.3),   //Productivity issues
    MITES(0.4);          //Severe itching and skin lesions
    private final double spread_rate;
    ParasiteType(double rate){
        this.spread_rate=rate;
    }
    public double getSpread_rate() {
        return this.spread_rate;
    }
}
