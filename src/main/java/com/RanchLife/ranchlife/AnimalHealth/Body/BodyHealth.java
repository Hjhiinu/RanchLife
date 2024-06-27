package com.RanchLife.ranchlife.AnimalHealth.Body;

public class BodyHealth {
    private Legs legs;
    private Body body;

    public BodyHealth(){
        this.legs=new Legs();
        this.body=new Body();
    }

    public Body getBody() {
        return body;
    }

    public Legs getLegs() {
        return legs;
    }
}
