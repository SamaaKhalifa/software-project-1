package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        while (true) {
            System.out.println("Enter your name");
            String name = sc.next()+sc.nextLine();
            System.out.println("Enter your address");
            String address = sc.nextLine();
            System.out.println("Enter your email in form words@email.com");
            String email = sc.nextLine();
            System.out.println("Enter your password");
            String password = sc.nextLine();
            System.out.println("Enter your national id");
            String id = sc.nextLine();
            System.out.println("Enter your phone number");
            String phoneNum = sc.nextLine();

            System.out.println("1-player /n 2-owner?");
            int option = sc.nextInt();
            ArrayList<Playground> playgrounds = new ArrayList<Playground>();
            switch (option) {
                case 1: {
                    User obj = new Player(name, address, email, password, id, phoneNum);
                  //  System.out.println(obj);
                    System.out.println("enter the location you want /n");
                    String location = sc.next() + sc.nextLine();
                    for (int i = 0; i < playgrounds.size(); i++) {
                        System.out.println("inside FOR LOOP");
                        if (playgrounds.get(i).getLocation() == location) {
                            int j = i + 1;

                            System.out.println("inside IF");
                            System.out.print(j + " :");
                            System.out.println(playgrounds.get(i));
                        }
                        System.out.println("enter the time slot you want /n");
                        String slot = sc.next();

                        Booking booking = new Booking(slot, location);
                        break;

                    //  System.out.println("select the no of playground you want/n");

                }



                }
                case 2: {
                    Scanner input = new Scanner(System.in);
                    User obj = new Owner(name, address, email, password, id, phoneNum);
                    System.out.println(obj);
                    System.out.println("Enter playground name");
                    String pName = input.next() + input.nextLine();
                    //////scan.next()+ scan.nextLine();
                    System.out.println("Enter playground location");
                    String locationn = input.nextLine();
                    System.out.println("Enter playground availableHours");
                    int availableHours = input.nextInt();
                    System.out.println("Enter playground size ");
                    String size = input.next() + input.nextLine();
                    System.out.println("Enter playground pricePerHour");
                    float pricePerHour = input.nextFloat();
                    System.out.println("Enter playground cancellationPeriod");
                    float cancellationPeriod = input.nextFloat();
                    Playground p = new Playground(pName, locationn, availableHours, size, pricePerHour, cancellationPeriod);
                    System.out.println(p);
                    playgrounds.add(p);
                  


                    break;

                }
            }


        }
    }
}
