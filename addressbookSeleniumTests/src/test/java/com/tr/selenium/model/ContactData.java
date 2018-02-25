package com.tr.selenium.model;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String homePhoneNumber;
    private final String address;

    public ContactData(String firstname, String lastname, String homePhoneNumber, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.homePhoneNumber = homePhoneNumber;
        this.address = address;
    }

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
