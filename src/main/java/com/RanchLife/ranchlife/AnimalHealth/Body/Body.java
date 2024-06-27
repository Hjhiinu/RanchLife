package com.RanchLife.ranchlife.AnimalHealth.Body;

public class Body {
    private boolean is_injuried;

    private boolean skin_issue;
    private double infection_rate; //max:1

    public Body(){  //init
        this.infection_rate=0;
        this.is_injuried=false;
        this.skin_issue=false;
    }

    public void init_legs(){
        this.infection_rate=0;
        this.is_injuried=false;
        this.skin_issue=false;
    }

    public boolean isSkin_issue() {
        return skin_issue;
    }

    public void setSkin_issue(boolean skin_issue) {
        this.skin_issue = skin_issue;
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
