CREATE DATABASE IF NOT EXISTS internshiptracker; 

USE internshiptracker; 

CREATE TABLE IF NOT EXISTS companies (
    company_id INT PRIMARY KEY AUTO_INCREMENT,
    company_name VARCHAR(55) UNIQUE NOT NULL 
);

CREATE TABLE IF NOT EXISTS applications (
    application_id INT PRIMARY KEY AUTO_INCREMENT,
    company_id INT NOT NULL,
    role VARCHAR(55) NOT NULL, 
    recruiter_contact VARCHAR(55), 
    posting_url VARCHAR(255) NOT NULL,
    notes VARCHAR(200),
    location VARCHAR(200),

    FOREIGN KEY (company_id) REFERENCES companies(company_id)
);