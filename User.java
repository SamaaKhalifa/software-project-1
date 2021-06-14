package com.company;

/**
 * @author samaa, sohaila, noura
 */

/**
 * this abstract class user that takes the user info
 */
public abstract class User {
    private String userName;
    private String address;
    private String email;
    private String password;
    private String nationalId;
    private String phoneNumber;
    String getUserName;
    String getPgetPassword;
    /**
     * this constructor is a user with specified user name, address, email, password, national id,phone number
     */
    public User()
    {
        userName = "";
        address = "";
        email = "";
        password = "";
        nationalId = "";
        phoneNumber ="";

    }

    /**
     * this function is to  takes user name, address, email, password, national id,phone number and set them
     * @param userName is a user name
     * @param address is the address of the user
     * @param email is the email of the user
     * @param password is the password the user want to use to open the system
     * @param nationalId is the national id of the user
     * @param phoneNumber is the phone number of the user
     */
    public User(String userName, String address, String email, String password, String nationalId, String phoneNumber) {
        this.userName = userName;
        this.address = address;
        this.email = email;
        this.password = password;
        this.nationalId = nationalId;
        this.phoneNumber = phoneNumber;
    }

    /**
     * this function is to set user name
     * @param userName is the user's name
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * this function is to set the address of the user
     * @param address is the user's address
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * this function is to set the email of the user
     * @param email is user's email
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * this function is to set the password
     * @param password is user's passward
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * this function is to set the national id
     * @param nationalId is user's national id
     */
    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    /**
     * this function is to set the phone number
     * @param phoneNumber is the user's phone number
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * this function is to return the user name
     * @return user name
     */

    public String getUserName() {
        return userName;
    }

    /**
     * this function is to get the user's address
     * @return address
     */

    public String getAddress() {
        return address;
    }

    /**
     * this function is to get the user's email
     * @return email
     */

    public String getEmail() {
        return email;
    }

    /**
     * this function is to get the password
     * @return password
     */

    public String getPassword() {
        return password;
    }

    /**
     * this function is to get the user's national id
     * @return national id
     */

    public String getNationalId() {
        return nationalId;
    }

    /**
     * this function is to get the phone number
     * @return phone number
     */

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
