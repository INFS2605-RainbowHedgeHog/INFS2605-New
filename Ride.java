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
 *	File: Ride.java
 *	Description: Ride class
 *	Date Last Modified: 05/05/17
 *	Fixes: Corrected data fields and data types. Added setter and getter methods
 *
 */
package Classes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Time;

public class Ride {
    
    private int rideNo;
    private Date date;
    private Time startTime;
    private int startPIN;
    private int endPIN;
    private char returnFlag;
    private char repeatFlag;
    private String car;
    private int company;

    public Ride() {
        
    }

    public Ride(int rideNo, Date date, Time startTime, int startPIN, int endPIN, char returnFlag, char repeatFlag, String car, int company) {
        this.rideNo = rideNo;
        this.date = date;
        this.startTime = startTime;
        this.startPIN = startPIN;
        this.endPIN = endPIN;
        this.returnFlag = returnFlag;
        this.repeatFlag = repeatFlag;
        this.car = car;
        this.company = company;
    }

    public int getRideNo() {
        return rideNo;
    }

    public void setRideNo(int rideNo) {
        this.rideNo = rideNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public int getStartPIN() {
        return startPIN;
    }

    public void setStartPIN(int startPIN) {
        this.startPIN = startPIN;
    }

    public int getEndPIN() {
        return endPIN;
    }

    public void setEndPIN(int endPIN) {
        this.endPIN = endPIN;
    }

    public char getReturnFlag() {
        return returnFlag;
    }

    public void setReturnFlag(char returnFlag) {
        this.returnFlag = returnFlag;
    }

    public char getRepeatFlag() {
        return repeatFlag;
    }

    public void setRepeatFlag(char repeatFlag) {
        this.repeatFlag = repeatFlag;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getCompany() {
        return company;
    }

    public void setCompany(int company) {
        this.company = company;
    }
    
    public static void updateDatabase(Connection conn) {
        // sql statement that finds the user if already exists and replaces the
        // data, or creats a new entry with the data
    }
    
    
    
}
