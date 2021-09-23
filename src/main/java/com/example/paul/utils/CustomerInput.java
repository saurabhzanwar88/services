package com.example.paul.utils;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;

import java.util.Date;
import java.util.List;

// TODO Add support for multiple account types (business, savings, etc.)
// TODO Add support for foreign currency accounts

public class CustomerInput {

   private long cust_id;
   private String name;

   private String email;

   private Date  dob = new Date();
   
   private String postal_address;
   
   private long aadhar_no;
   
   private long pan_no;
   
   private String pancard;
   
   private String aadharcard;
   
   private long user_id;
    public long getCust_id() {
	return cust_id;
}







public void setCust_id(long cust_id) {
	this.cust_id = cust_id;
}







public String getName() {
	return name;
}







public void setName(String name) {
	this.name = name;
}







public String getEmail() {
	return email;
}







public void setEmail(String email) {
	this.email = email;
}







public Date getDob() {
	return dob;
}







public void setDob(Date dob) {
	this.dob = dob;
}







public String getPostal_address() {
	return postal_address;
}







public void setPostal_address(String postal_address) {
	this.postal_address = postal_address;
}







public long getAadhar_no() {
	return aadhar_no;
}







public void setAadhar_no(long aadhar_no) {
	this.aadhar_no = aadhar_no;
}







public long getPan_no() {
	return pan_no;
}







public void setPan_no(long pan_no) {
	this.pan_no = pan_no;
}







public String getPancard() {
	return pancard;
}







public void setPancard(String pancard) {
	this.pancard = pancard;
}







public String getAadharcard() {
	return aadharcard;
}







public void setAadharcard(String aadharcard) {
	this.aadharcard = aadharcard;
}







public long getUser_id() {
	return user_id;
}







public void setUser_id(long user_id) {
	this.user_id = user_id;
}







	

    


	


    public CustomerInput() {}
	
	

   
    /*private double amount1;
    private double amount2;
    private double pan;
    private String name;
    
    

   

   



	public CustomerInput() {}
	

    
    
    public double getamount1() {
        return amount1;
    }
    
    public double getamount2() {
        return amount2;
    }
    
    public double getpan() {
        return pan;
    }
    
    public String getName() {
        return name;
    }
    
    
    
    public void setamount1(double amount1) {
        this.amount1 = amount1;
    }
    
    public void setamount2(double amount2) {
        this.amount2 = amount2;
    }
    
    public void setpan(double pan) {
        this.pan = pan;
    }
    
    public void setName(String name) {
        this.name = name;
    }*/
   

   
}

