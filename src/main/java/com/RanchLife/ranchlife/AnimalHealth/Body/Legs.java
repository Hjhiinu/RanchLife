package com.RanchLife.ranchlife.AnimalHealth.Body;

public class Legs {
    private boolean is_injuried;
    private double infection_rate; //max:1

    public Legs(){  //init
        this.infection_rate=0;
        this.is_injuried=false;
    }

    public void init_legs(){
        this.infection_rate=0;
        this.is_injuried=false;
    }
    public void increaseInfection_rate(double increase){
        this.infection_rate = this.infection_rate+increase;
    }

    public void decreaseInfection_rate(double decrease){
        this.infection_rate = this.infection_rate-decrease;
    }

    public void setInfection_rate(double infection_rate) {
        this.infection_rate = infection_rate;
    }

    public void setIs_injuried(boolean is_injuried) {
        this.is_injuried = is_injuried;
    }

    public boolean isIs_injuried() {
        return is_injuried;
    }

    public double getInfection_rate() {
        return infection_rate;
    }
}
