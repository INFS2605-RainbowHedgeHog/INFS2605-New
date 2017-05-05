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
 *	File: Agreement.java
 *	Description: Agreement class
 *	Date Last Modified: 05/05/17
 *	Fixes: Corrected data fields and data types. Added setter and getter methods
 *
 */
package Classes;

import java.sql.Connection;

public class Agreement {
    
    private int agreementNo;
    private int[] passengers;
    private int rideNo;
    private int receiptNo;
    private double price;

    public Agreement() {
    }

    public Agreement(int agreementNo, int[] passengers, int rideNo, int receiptNo, double price) {
        this.agreementNo = agreementNo;
        this.passengers = passengers;
        this.rideNo = rideNo;
        this.receiptNo = receiptNo;
        this.price = price;
    }

    public int getAgreementNo() {
        return agreementNo;
    }

    public void setAgreementNo(int agreementNo) {
        this.agreementNo = agreementNo;
    }

    public int[] getPassengers() {
        return passengers;
    }

    public void setPassengers(int[] passengers) {
        this.passengers = passengers;
    }

    public int getRideNo() {
        return rideNo;
    }

    public void setRideNo(int rideNo) {
        this.rideNo = rideNo;
    }

    public int getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(int receiptNo) {
        this.receiptNo = receiptNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public static void updateDatabase(Connection conn) {
        // sql statement that finds the user if already exists and replaces the
        // data, or creats a new entry with the data
    }
    
    
}
