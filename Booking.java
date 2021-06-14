package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author noura, samaa, sohaila
 *
 */

/**
 * this is class booking that takes booking info (slot, playground)
 */
public class Booking {
    private Playground playground;
    private int date;
    private Playground availablePlaygrounds[] =new Playground[100];

    /**
     * this is a function that takes slot and playground and set them
     * @param slot is the slot in which player want to book a playground
     * @param playground is the playground that the player want to play in
     */
    public Booking(int slot, Playground playground) {

        this.date = slot;
        this.playground = playground;
        //float slotCount= playground.getAvailableHours();
        float numOfBooking = playground.getSize() * 2;
        System.out.println("please choose \n 1-book whole playground for this slot \n 2-book for one player");
        Scanner cin = new Scanner(System.in);
        int opt = cin.nextInt();
        //book the whole slot
        if (opt == 1 && numOfBooking == playground.s[slot - 1].slotnumOfBooking) { //the number of books in this slot wasn't decreased
            playground.availableSlots[slot - 1] = " ";
            System.out.println("Done!");

        } else if (opt == 2) { //book one book from the slot
            if (playground.s[slot - 1].slotnumOfBooking == 0) {
                playground.availableSlots[slot - 1] = " ";
            } else {
                playground.s[slot - 1].slotnumOfBooking--;
                //System.out.println(playground.s[slot - 1].slotnumOfBooking);
            }
        } else {
            System.out.println("invalid option");
        }

    }


    /**
     * this function is to set a slot
     * @param date is the slot
     */

    public void setDate(int date) {
        this.date = date;
    }

    /**
     * this function is to set the playground
     * @param playground is object from class playground
     */
    public void setPlayground(Playground playground) {
        this.playground = playground;
    }

    /**
     * this function is to return the slot
     * @return slot
     */
    public int getDate() {
        return date;
    }

    /**
     * this function is to return a playground
     * @return playground
     */
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





