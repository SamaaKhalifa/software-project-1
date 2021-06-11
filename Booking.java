package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking {
    private String place;
    private String date;
    private Playground playground=new Playground();
    private Playground availablePlaygrounds[] =new Playground[100];

    public Booking()
    {
        place="";
        date="";
    }


    public Booking(String place,String date)
    {
        this.place=place;
        this.date=date;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPlayground(Playground playground) {
        this.playground = playground;
    }

    public String getPlace() {
        return place;
    }

    public String getDate() {
        return date;
    }

    public Playground getPlayground() {
        return playground;
    }


    Date date2 = new Date();
    public void book(Booking B){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        date2=new Date();

    }

    public double calPassTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date1 = new Date();
        return date1.getTime()-date2.getTime();
    }

    public void displayPlaygrounds(){

    }
    public void filter(String A,String B ){

    }
   /* public float calculate(Playground playground){

    }
    public float recievePaymnt(){

    }*/
    public void transfer(){

    }
    public void removeAvaliablePlayground(Playground playground){

    }
    int noOfAvailablePlayground=0;
    public void addAvailiablePlayground(Playground playground){
                availablePlaygrounds[noOfAvailablePlayground]= playground;
                noOfAvailablePlayground++;

    }
    public void inviteTeam(String B){}




}





