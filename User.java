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
 *	File: User.java
 *	Description: User Class
 *	Date Last Modified: 05/05/17
 *	Fixes: Corrected data fields and data types. Added setter and getter methods
 *
 */

package Classes;

import java.sql.Connection;


public class User {
    
    private int userID;
    private String name;
    private String gender;
    private int age;
    private String homeAdd;
    private int homePin;
    private int compID;
    private String email;
    private long phone;
    private String password;
    private long bankAcct;

    public User() {
    }

    public User(int userID, String name, String gender, int age, String homeAdd, int homePin, int compID, String email, long phone, String password, long bankAcct) {
        this.userID = userID;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.homeAdd = homeAdd;
        this.homePin = homePin;
        this.compID = compID;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.bankAcct = bankAcct;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeAdd() {
        return homeAdd;
    }

    public void setHomeAdd(String homeAdd) {
        this.homeAdd = homeAdd;
    }

    public int getHomePin() {
        return homePin;
    }

    public void setHomePin(int homePin) {
        this.homePin = homePin;
    }

    public int getCompID() {
        return compID;
    }

    public void setCompID(int compID) {
        this.compID = compID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getBankAcc() {
        return bankAcct;
    }

    public void setBankAcc(long bankAcct) {
        this.bankAcct = bankAcct;
    }
    
    
    
    public static void updateDatabase(Connection conn) {
        // sql statement that finds the user if already exists and replaces the
        // data, or creats a new entry with the data
    }
    
    
    
}
