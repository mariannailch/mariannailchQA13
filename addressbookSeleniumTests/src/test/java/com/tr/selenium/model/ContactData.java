package com.tr.selenium.model;

public class ContactData {
    private String firstname;
    private String lastname;
    private String homePhoneNumber;
    private String address;

    public ContactData setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public ContactData setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public ContactData setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
        return this;
    }

    public ContactData setAddress(String address) {
        this.address = address;
        return this;
    }

//    public ContactData(String firstname, String lastname, String homePhoneNumber, String address) {
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.homePhoneNumber = homePhoneNumber;
//        this.address = address;
//
//    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
