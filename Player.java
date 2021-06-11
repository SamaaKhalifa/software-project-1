package com.company;

public class Player extends User {
    private Ewallet ewallet=new Ewallet();
    private Booking[] bookings=new Booking[100];
    private String[] favTeam= new String[11];


    public Player(String userName, String address, String email, String password, String nationalId, String phoneNumber) {
        super(userName, address, email, password, nationalId, phoneNumber);
    }

    public void setEwallet(Ewallet ewallet) {
        this.ewallet = ewallet;
    }

    public void setBookings(Booking[] bookings) {
        this.bookings = bookings;
    }

    public Ewallet getEwallet() {
        return ewallet;
    }

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
