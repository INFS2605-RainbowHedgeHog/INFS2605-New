/*
 *
 *	INFS2605 2017 Sem 1 - SuBer Assignment
 *	
 *	Authors: Jane Jihee Kim, Ilasha Prabhu, Elyse Ng and Manan Patel (J & Co.)
 *
 *	Version 0.1.0
 *
 *
 *
 *	File: Consultation.java
 *	Description: Consultaion class
 *	Date Last Modified: 05/05/17
 *	Fixes: Corrected data fields and data types. Added setter and getter methods
 *
 */
package Classes;

import java.sql.Connection;
import java.sql.Date;

public class Consultation {
    
    private int consultNo;
    private int staff;
    private double price;
    private Date dateCreated;

    public Consultation() {
    }

    public Consultation(int consultNo, int staff, double price, Date dateCreated) {
        this.consultNo = consultNo;
        this.staff = staff;
        this.price = price;
        this.dateCreated = dateCreated;
    }

    public int getConsultNo() {
        return consultNo;
    }

    public void setConsultNo(int consultNo) {
        this.consultNo = consultNo;
    }

    public int getStaff() {
        return staff;
    }

    public void setStaff(int staff) {
        this.staff = staff;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public static void updateDatabase(Connection conn) {
        // sql statement that finds the user if already exists and replaces the
        // data, or creats a new entry with the data
    }
    
}
