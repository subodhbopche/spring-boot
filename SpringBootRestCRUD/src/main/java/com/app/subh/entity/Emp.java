package com.app.subh.entity;

import javax.persistence.*;

@Entity
@Table(name = "Emp")
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eid")
    private int eid;

    @Column(name = "first_Name")
    private String firstName;

    @Column(name = "last_Name")
    private String lastName;

    @Column(name = "email_ID")
    private String emailID;


    public Emp() {
    }

    public Emp(int eid, String firstName, String lastName, String emailID) {
        this.eid = eid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailID = emailID;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailID='" + emailID + '\'' +
                '}';
    }
}

