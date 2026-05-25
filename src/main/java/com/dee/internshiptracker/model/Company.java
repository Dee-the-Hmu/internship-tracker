package com.dee.internshiptracker.model;

public class Company {
    private int compId;
    private String compName; 

    public company(){
        this.compId = 0;
        this.compName = null;
    }

    public company(int compId, String compName){
        this.compId = compId;
        this.compName = compName; 
    }

    public void setCompId(int compId) { this.compId = compId; }
    public void setCompName(String compName) { this.compName = compName; }

    public int getCompId() { return this.compId; }
    public String getCompName() { return this.compName; }
}
