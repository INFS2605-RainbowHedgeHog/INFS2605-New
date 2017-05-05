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
 *	File: Membership.java
 *	Description: Membership class
 *	Date Last Modified: 05/05/17
 *	Fixes: Corrected data fields and data types. Added setter and getter methods
 *
 */
package Classes;

import java.sql.Connection;
import java.sql.Date;

public class Membership {
    
    private int userID;
    private Date dateValidTo;
    private int lastPayment;

    public Membership() {
    }

    public Membership(int userID, Date dateValidTo, int lastPayment) {
        this.userID = userID;
        this.dateValidTo = dateValidTo;
        this.lastPayment = lastPayment;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Date getDateValidTo() {
        return dateValidTo;
    }

    public void setDateValidTo(Date dateValidTo) {
        this.dateValidTo = dateValidTo;
    }

    public int getLastPayment() {
        return lastPayment;
    }

    public void setLastPayment(int lastPayment) {
        this.lastPayment = lastPayment;
    }
    
    
    
    public static void updateDatabase(Connection conn) {
        // sql statement that finds the user if already exists and replaces the
        // data, or creats a new entry with the data
    }
    
}
