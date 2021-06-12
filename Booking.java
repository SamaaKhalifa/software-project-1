package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    private Playground playground;
    private int date;
    private Playground availablePlaygrounds[] =new Playground[100];




    public Booking(int slot,Playground playground)
    {

        this.date=slot;
        this.playground=playground;
        //float slotCount= playground.getAvailableHours();
        float numOfBooking=playground.getSize()*2;
        System.out.println("please choose \n 1-book whole playground for this slot \n 2-book for one player");
        Scanner cin = new Scanner(System.in);
        int opt=cin.nextInt();
        if(opt==1 && numOfBooking==playground.s[slot-1].slotnumOfBooking){ //the number of books in this slot wasn't decreased
            playground.availableSlots[slot-1]=" ";
        }
        else if(opt==2){
            if(playground.s[slot-1].slotnumOfBooking==0){
                playground.availableSlots[slot-1]=" ";
            }
            else  playground.s[slot-1].slotnumOfBooking--;
        }
        else
            System.out.println("invalid option");

        }




    public void setDate(int date) {
        this.date = date;
    }

    public void setPlayground(Playground playground) {
        this.playground = playground;
    }


    public int getDate() {
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
    public void filter(String location,String slote ){

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





