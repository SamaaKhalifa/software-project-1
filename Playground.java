package com.company;
import java.util.ArrayList;


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






    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAvailableHours(int availableHours) {
        this.availableHours = availableHours;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPricePerHour(float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public void setCancellationPeriod(float cancellationPeriod) {
        this.cancellationPeriod = cancellationPeriod;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public float getAvailableHours() {
        return availableHours;
    }

    public int getSize() {
        return size;
    }

    public float getPricePerHour() {
        return pricePerHour;
    }

    public double getCancellationPeriod() {
        return cancellationPeriod;
    }

    public String getFeedback() {
        return feedback;
    }

    public String getStatus() {
        return status;
    }

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
