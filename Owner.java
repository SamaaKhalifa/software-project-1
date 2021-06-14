package com.company;

/**
 * @author noura, samaa, sohaila
 */

/**
 * this class owner that extends from user
 */
public class Owner extends User{
    Ewallet ewallet=new Ewallet();
    private Playground[] playgrounds=new Playground[1000];
    private Booking[] bookings=new Booking[1000];

    /**
     * this constructor that set the info of parent class user
     * @param userName is a user name
     * @param address is the address of the user
     * @param email is the email of the user
     * @param password is the password the user want to use to open the system
     * @param nationalId is the national id of the user
     * @param phoneNumber is the phone number of the user
     */
    public Owner(String userName, String address, String email, String password, String nationalId, String phoneNumber) {
        super(userName, address, email, password, nationalId, phoneNumber);
    }

    /**
     * this function is to set ewallet to the user
     * @param ewallet is the balance of the user
     */
    public void setEwallet(Ewallet ewallet) {
        this.ewallet = ewallet;
    }

    /**
     * this function is to set playgrounds of the owner
     * @param playgrounds is object from class playground
     */
    public void setPlaygrounds(Playground[] playgrounds) {
        this.playgrounds = playgrounds;
    }

    /**
     * this function is to set booking for the playground
     * @param bookings is object from class booking
     */
    public void setBookings(Booking[] bookings) {
        this.bookings = bookings;
    }
    /**
     * this function is to get user's ewallet
     * @return ewallet
     */

    public Ewallet getEwallet() {
        return ewallet;
    }

    /**
     * this function is to get playground
     * @return object from playground
     */
    public Playground[] getPlaygrounds() {
        return playgrounds;
    }

    /**
     * this function is to get booking
     * @return object from booking
     */
    public Booking[] getBookings() {
        return bookings;
    }

    /**
     * this function is to get the booking
     * @return object from booing
     */
    public Booking[] viewBooking(){
        return bookings;
    }
}
