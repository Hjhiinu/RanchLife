package com.RanchLife.ranchlife.AnimalHealth;

import com.RanchLife.ranchlife.AnimalHealth.Body.BodyHealth;
import com.RanchLife.ranchlife.AnimalHealth.Digestion.Digestion;
import com.RanchLife.ranchlife.AnimalHealth.Parasite.Parasite;
import com.RanchLife.ranchlife.AnimalHealth.Therapy.Treatment;

public class AnimalHealth {
    private int health_situation; //TODO Need a complicated logic
    private double sick_chance;  //max:1  TODO Need logic
    private Treatment treatment;
    private Parasite parasite;
    private BodyHealth bodyhealth;
    private Digestion digestion;
    public AnimalHealth(){
        this.bodyhealth=new BodyHealth();
        this.digestion=new Digestion();
        this.health_situation=100;
        this.parasite=new Parasite();
        this.sick_chance=0;
        this.treatment=new Treatment();
    }

    public BodyHealth getBodyhealth() {
        return bodyhealth;
    }

    public Digestion getDigestion() {
        return digestion;
    }

    public int getHealth_situation() {
        return health_situation;
    }

    public double getSick_chance() {
        return sick_chance;
    }

    public Parasite getParasite() {
        return parasite;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setBodyhealth(BodyHealth bodyhealth) {
        this.bodyhealth = bodyhealth;
    }

    public void setHealth_situation(int health_situation) {
        this.health_situation = health_situation;
    }

    public void setDigestion(Digestion digestion) {
        this.digestion = digestion;
    }

    public void setParasite(Parasite parasite) {
        this.parasite = parasite;
    }

    public void setSick_chance(double sick_chance) {
        this.sick_chance = sick_chance;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }
}
