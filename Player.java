package com.company;

/**
 * @author samaa,noura,sohaila
 */

/**
 * this is class player that extends from user
 */
public class Player extends User {
    private Ewallet ewallet=new Ewallet();
    private Booking[] bookings=new Booking[100];
    private String[] favTeam= new String[11];

    /**
     * this constructor that set the info of parent class user
     * @param userName is a user name
     * @param address is the address of the user
     * @param email is the email of the user
     * @param password is the password the user want to use to open the system
     * @param nationalId is the national id of the user
     * @param phoneNumber is the phone number of the user
     */
    public Player(String userName, String address, String email, String password, String nationalId, String phoneNumber) {
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
     * this function is to set booking
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
     * this function is to get booking
     * @return booking object
     */

    public Booking[] getBookings() {
        return bookings;
    }
    public Booking[] viewBooking(){
        return bookings;
    }
    public int count=0;
    public void makeFavTeam(String name){

            favTeam[count]=name;
            count++;

    }

    public void removeBooking(Booking b){
        for(int i=0; i<bookings.length;i++){
           if(bookings[i]==b){
               bookings[i]=bookings[i+1];

           }
        }
    }

    public void cancel(Booking b){
            Playground p=b.getPlayground();
           double cancel= p.getCancellationPeriod();
           if(b.calPassTime()<=cancel){
               //call removeBooking n3ml fun to delete booking from the array of bookings in player and call inside it addAvailablePlayground
    }
}

}
