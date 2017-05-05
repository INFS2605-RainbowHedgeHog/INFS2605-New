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
 *	File: Car.java
 *	Description: Car class
 *	Date Last Modified: 05/05/17
 *	Fixes: Corrected data fields and data types. Added setter and getter methods
 *
 */
package Classes;

import java.sql.Connection;


public class Car {
    
    private String regoNo;
    private String brand;
    private String model;
    private int year;
    private int numSeats;
    private int owner;

    public Car() {
        
    }

    public Car(String regoNo, String brand, String model, int year, int numSeats, int owner) {
        this.regoNo = regoNo;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.numSeats = numSeats;
        this.owner = owner;
    }

    public String getRegoNo() {
        return regoNo;
    }

    public void setRegoNo(String regoNo) {
        this.regoNo = regoNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }
    
    public static void updateDatabase(Connection conn) {
        // sql statement that finds the user if already exists and replaces the
        // data, or creats a new entry with the data
    }
    
    
    
    
}
