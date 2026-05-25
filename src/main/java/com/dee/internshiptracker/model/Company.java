package com.dee.internshiptracker.model;

public class Company {
    private int companyID;
    private String companyName; 

    public Company(){
        this.companyID= 0;
        this.companyName = null;
    }

    public Company(int compId, String compName){
        this.companyID = compId;
        this.companyName = compName; 
    }

    public void setCompanyID(int compId) { this.companyID= compId; }
    public void setCompanyName(String compName) { this.companyName = compName; }

    public int getCompanyID() { return this.companyID; }
    public String getCompanyName() { return this.companyName; }
}
