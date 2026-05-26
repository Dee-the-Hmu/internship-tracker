package com.dee.internshiptracker.model;

import com.dee.internshiptracker.util.Status;

public class Application {
    private int applicationID;
    private int companyID;
    private String role;
    private String recruiterContact;
    private String postingURL;
    private String note; 
    private String location; 
    private Status status;

    public Application(){
        this.applicationID = 0;
        this.companyID = 0;
        this.role = null;
        this.recruiterContact = null;
        this.postingURL = null;
        this.note = null;
        this.location = null;
        status = Status.APPLIED;
    }

    public Application(int appId, int compId, String role, String recruiterContact, String url, String note, String location, Status status){
        this.applicationID = appId;
        this.companyID = compId; 
        this.role = role;
        this.recruiterContact = recruiterContact;
        this.postingURL = url;
        this.note = note;
        this.location = location;
        this.status = status;
    }

    public void setApplicationID(int appId){ this.applicationID = appId; }
    public void setCompanyID(int compId){ this.companyID = compId; }
    public void setRole(String role){ this.role = role; }
    public void setRecruiterContact(String recruiterContact){ this.recruiterContact = recruiterContact; }
    public void setPostingURL(String url){ this.postingURL = url; }
    public void setNote(String note) { this.note = note; }
    public void setLocation(String location){ this.location = location; }
    public void setStatus(Status status){ this.status = status; }

    public int getApplicationID() { return this.applicationID; }
    public int getCompanyID() { return this.companyID; }
    public String getRole() { return this.role; }
    public String getRecruiterContact() { return this.recruiterContact; }
    public String getPostingURL() { return this.postingURL; }
    public String getNote() { return this.note; }
    public String getLocation() { return this.location; }
    public Status getStatus() { return this.status; }
}
