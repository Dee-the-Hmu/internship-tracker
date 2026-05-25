package com.dee.internshiptracker.model;

public class Application {
    private int appId;
    private int compId;
    private String role;
    private String recruiterContact;
    private String url;
    private String note; 
    private String location; 

    public application(){
        this.appId = 0;
        this.compId = 0;
        this.role = null;
        this.recruiterContact = null;
        this.url = null;
        this.note = null;
        this.location = null;
    }

    public application(int appId, int compId, String role, String recruiterContact, String url, String note, String location){
        this.appId = appId;
        this.compId = compId; 
        this.role = role;
        this.recruiterContact = recruiterContact;
        this.url = url;
        this.note = note;
        this.location = location;
    }

    public void setAppId(int appId){ this.appId = appId; }
    public void setCompId(int compId){ this.comppId = compId; }
    public void setRole(String role){ this.role = role; }
    public void setRecruiterContact(String recruiterContact){ this.recruiterContact = recruiterContact; }
    public void setUrl(String url){ this.url = url; }
    public void setNote(String note) { this.note = note; }
    public void setLocation(String location){ this.location = location; }

    public int getAppId() { return this.appId; }
    public int getCompId() { return this.compId; }
    public String getRole() { return this.role; }
    public String getRecruiterContact() { return this.recruiterContact; }
    public String getUrl() { return this.url; }
    public String getLocation() { return this.location; }
}
