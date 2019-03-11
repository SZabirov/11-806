package com.company;

public class OldUser {
    private Long id;
    private String firstname;
    private String secondname;
    private String address;
    private String phoneNumber;

    public OldUser(Long id, String firstname, String secondname, String address, String phoneNumber) {
        this.id = id;
        this.firstname = firstname;
        this.secondname = secondname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public OldUser(String firstname, String secondname, String address) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
