package com.RanchLife.ranchlife.AnimalHealth.Parasite;

public class Parasite {
    private ParasiteType[] parasiteType;

    private int amount; //How severe it is

    public Parasite(){
        this.parasiteType=new ParasiteType[ParasiteType.values().length];//corresponding to numbers of parasite
        this.amount=0;
    }

    public ParasiteType[] getParasiteTypeArray() {
        return parasiteType;
    }

    public ParasiteType getParasiteType(int pos) {
        return parasiteType[pos];
    }

    public void setParasiteType(ParasiteType parasiteType, int pos) {
        this.parasiteType[pos] = parasiteType;
    }

}
