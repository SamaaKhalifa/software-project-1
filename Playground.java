package com.company;
import java.util.ArrayList;

/**
 * @author sohaila,noura,samaa
 */

/**
 * this class is to takes playground info from the owner
 */

public class Playground {
    private String name;
    private String location;
    private int availableHours;
    private int size;
    private float pricePerHour;
    private double cancellationPeriod;
    private String feedback;
    private String status;
    // private Booking[] bookings=new Booking[1000];
    public static String slots[]= {"Slot1","Slot2","Slot3","Slot4","Slot5","Slot6","Slot7","Slot8","Slot9","Slot10",
            "Slot11","Slot12","Slot13","Slot14","Slot15","Slot16","Slot17","Slot18","Slot19","Slot20",
            "Slot21","Slot22","Slot23","Slot24"};
    public String availableSlots[];
    public Slot[] s;

    /**
     * this constructor is a user with specified name, location..and so on
     */

    public Playground()
    {
        name="";
        location="";
        availableHours= 0;
        size=0;
        pricePerHour=0;
        cancellationPeriod=0;
        feedback="";
        status="";

    }
    public static ArrayList<Playground> playgrounds = new ArrayList<Playground>();

    public static int  playgroundCount=0;

    /**
     * this is a constructor that set the playground info
     * @param name is the playground's name
     * @param location the location of the playground
     * @param availableHours the hours the playground available
     * @param size the size of the playground
     * @param pricePerHour the price per hour
     * @param cancellationPeriod the cancellation period
     */
    public Playground(String name,String location,int availableHours,int size,float pricePerHour,float cancellationPeriod)
    {
        this.name=name;
        this.location=location;
        this.availableHours=availableHours;
        this.size=size;
        this.pricePerHour=pricePerHour;
        this.cancellationPeriod=cancellationPeriod;
        this.feedback="";
        this.status="";
        playgrounds.add(playgroundCount++, this);
        this.availableSlots=new String[availableHours];
                //move slots to the playground
                for(int n=0;n<this.availableHours;n++){
                    this.availableSlots[n]=Playground.slots[n];
                }
        this.s=new Slot[this.availableHours-1];
        for(int i=0;i<this.availableHours-1;i++){
            s[i]=new Slot(this.size*2);
        }
    }


    /**
     * this function is to set the name
     * @param name is the playground's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * this function is to set the location
     * @param location is the playground's location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * this function is to set the available hours in the playground per day
     * @param availableHours the available hours in the playground per day
     */
    public void setAvailableHours(int availableHours) {
        this.availableHours = availableHours;
    }

    /**
     * this function is to set the size of the players in playground per team
     * @param size players per team
     */

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * this function is to set the price per hour in the playground
     * @param pricePerHour the price of playground per hour
     */
    public void setPricePerHour(float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    /**
     * this function set the period the player can cancel within
     * @param cancellationPeriod the period the player can cancel within
     */
    public void setCancellationPeriod(float cancellationPeriod) {
        this.cancellationPeriod = cancellationPeriod;
    }

    /**
     * this function is to set the feedback
     * @param feedback the playground's feedback
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * this function is to set the status of the playground
     * @param status the playground's status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * this function is to get the playground's name
     * @return playground's name
     */
    public String getName() {
        return name;
    }

    /**
     * this function is to get the playground's location
     * @return playground's location
     */
    public String getLocation() {
        return location;
    }

    /**
     * this function is to get the playground's available hours
     * @return playground's available hours
     */
    public float getAvailableHours() {
        return availableHours;
    }

    /**
     * this function is to get the playground's size
     * @return playground's size
     */
    public int getSize() {
        return size;
    }

    /**
     * this function is to get the playground's price per hour
     * @return playground's price per hour
     */
    public float getPricePerHour() {
        return pricePerHour;
    }

    /**
     * this function is to get the playground's cancellation period
     * @return playground's cancellation period
     */
    public double getCancellationPeriod() {
        return cancellationPeriod;
    }

    /**
     * this function is to get the playground's feedback
     * @return playground's feedback
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * this function is to get the playground's status
     * @return playground's status
     */
    public String getStatus() {
        return status;
    }
    @Override
    public String toString() {
        return "Playground{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", availableHours=" + availableHours +
                ", size='" + size + '\'' +
                ", pricePerHour=" + pricePerHour +
                ", cancellationPeriod=" + cancellationPeriod +
                ", feedback='" + feedback + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
