package com.RanchLife.ranchlife.AnimalHealth.Therapy;

import java.util.ArrayList;

public class Treatment {    //Every animal can only get two different kinds of therapies at the same time.
    private ArrayList<TherapyType> therapy;

    private boolean is_under_treatment;

    public Treatment(){
        this.therapy = new ArrayList<>();
        this.is_under_treatment=false;
    }

    public ArrayList<TherapyType> getTherapy() {
        return therapy;
    }

    public void setTherapy(ArrayList<TherapyType> therapy) {
        this.therapy = therapy;
    }
    public void addTherapy(TherapyType therapy) {
        this.therapy.add(therapy);
    }
    public void removeTherapy(int index) {
        this.therapy.remove(index);
    }
    public boolean therapyList_is_qualified(){
        return this.therapy.size()<=2;
    }

    public boolean Is_under_treatment() {
        return is_under_treatment;
    }

    public void setIs_under_treatment(boolean is_under_treatment) {
        this.is_under_treatment = is_under_treatment;
    }
}
