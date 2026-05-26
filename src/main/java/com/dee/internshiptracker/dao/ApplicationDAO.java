package com.dee.internshiptracker.dao;

import com.dee.internshiptracker.model.applicaiton;
import com.dee.internshiptracker.util.Status;

import com.dee.internshiptracker.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List; 

public class ApplicationDAO {
    //DONE get all application 
    //DONE get an application by application id
    //DONE get applications by company id  
    //DONE get applications by status (and/or sort by status)
    //create an application (return the generated applicaiton id)
    //update an application by id 
    //delete an application 

    //get applications by companyName ? (I am thinking about putting this in business logic, get the companyName, convert it to companyId and use the getApplicationsByCompanyID

    //get all application
    public List<Application> getAllApplications(){
        String sql = "SELECT * FROM applications";
        return executeQuery(sql); 
    }

    //get an application by application id
    public Application getAnApplicationByApplicationID(int applicationID){
        String sql = "SELECT * FROM applications WHERE application_id = ?";
        List<Application> applications = executeQuery(sql, applicationID);
        return applications.get(0); //assuming application-id is unique (PK)
    }

    //get applications by company id 
    public List<Application> getApplicationsByCompanyID(int companyID){
        String sql = "SELECT * FROM applications WHERE company_id = ?";
        return executeQuery(sql, companyID);
    }

    //get applications by status
    public List<Application> getApplicationsByStatus(String statusString){
        String sql = "SELECT * FROM applications WHERE status = ?";
        return executeQuery(sql, statusString);
    }








    public List<Application> executeQuery(String sql, Object ... params){
        List<Application> applications = new ArrayList<>();

        try( //try-with-resource automatically add finally block where java closes all the resources
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql); //send the sql first
        ){
            for(int i = 0; i <params.length; i++){
                ps.setObject(i+1, params[i]); //JDBC parameter starts at 1 not 0
            }

            try(
                ResultSet rs = ps.executeQuery();
            ){
                while(rs.next()){ //iterating rows (move cursor to the nextrow)
                int applicationID = rs.getInt("application_id");
                int companyID = rs.getInt("company_id");
                String role = rs.getString("role");
                String recruiterContact = rs.getString("recruiter_contact");
                String postingURL = rs.getString("posting_url");
                String notes = rs.getString("notes");
                String location = rs.getString("location");
                String statusString = rs.getString("status");

                Status status = Status.valueOf(statusString); 

                applications.add(new Application(applicationID, companyID, role, recruiterContact, postingURL, notes, location, status));
                }
            } //inner try-with-resources 

        }catch (SQLException e){
            e.printStackTrace();
        }//outer try-with-resources
        return applications;
    }

    private boolean executeUpdate(String sql, Object ... params){
        boolean succeed = false;

        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);

            for(int i = 0; i < params.length; i++){
                ps.setObject(i+1, params[i]);
            }

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0){
                succeed = true;
            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            ps.close();
            connection.close();
        }

        return succeed;

        
    }

}
