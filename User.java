package com.company;


public abstract class User {
    private String userName;
    private String address;
    private String email;
    private String password;
    private String nationalId;
    private String phoneNumber;

    public User()
    {
        userName = "";
        address = "";
        email = "";
        password = "";
        nationalId = "";
        phoneNumber ="";

    }


    public User(String userName, String address, String email, String password, String nationalId, String phoneNumber) {
        this.userName = userName;
        this.address = address;
        this.email = email;
        this.password = password;
        this.nationalId = nationalId;
        this.phoneNumber = phoneNumber;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNationalId() {
        return nationalId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public abstract Booking[] viewBooking();

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
