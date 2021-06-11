package com.company;
public class Playground {
    private String name;
    private String location;
    private int availableHours;
    private String size;
    private float pricePerHour;
    private double cancellationPeriod;
    private String feedback;
    private String status;
    static String slots[]= {"Slot1","Slot2","Slot3","Slot4","Slot5","Slot6","Slot7","Slot8","Slot9","Slot10",
            "Slot11","Slot12","Slot13","Slot14","Slot15","Slot16","Slot17","Slot18","Slot19","Slot20",
            "Slot21","Slot22","Slot23","Slot24"};
    public Playground()
    {
        name="";
        location="";
        availableHours= 0;
        size="";
        pricePerHour=0;
        cancellationPeriod=0;
        feedback="";
        status="";

    }
    public Playground(String name,String location,int availableHours,String size,float pricePerHour,float cancellationPeriod)
    {
        this.name=name;
        this.location=location;
        this.availableHours=availableHours;
        this.size=size;
        this.pricePerHour=pricePerHour;
        this.cancellationPeriod=cancellationPeriod;
        String availableSlots []=new String[availableHours];
        for(int i=0;i<availableHours;i++){
            availableSlots[i]=slots[i];
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

    public void setSize(String size) {
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

    public String getSize() {
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
