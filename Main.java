package com.company;
import java.util.*;
import static com.company.Playground.playgroundCount;
import static com.company.Playground.playgrounds;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        //ArrayList<Playground> playgrounds = new ArrayList<Playground>();
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
            switch (option) {
                case 1: {
                    User obj = new Player(name, address, email, password, id, phoneNum);
                    //  System.out.println(obj);
                    System.out.println("enter the location you want /n");
                    String location = sc.next() + sc.nextLine();
                    ///select the playgrounds with the selected location
                    for (int i = 0; i <playgroundCount; i++) {
                        String loc = (playgrounds.get(i)).getLocation();
                        if (loc.equalsIgnoreCase(location)) {
                            int j = i + 1;
                            System.out.print(j + " :");
                            System.out.println(playgrounds.get(i));
                        }
                    }
                    System.out.println("choose the play ground you want");
                    int choose=sc.nextInt();

                    Playground chosenPlayground = playgrounds.get(choose-1);
                    //print slots
                    for(int k=0;k< playgrounds.get(choose-1).getAvailableHours();k++){
                        System.out.println(playgrounds.get(choose-1).availableSlots[k]);
                    } Scanner in = new Scanner(System.in);
                    System.out.println("enter number of slot you want");
                    int chosenSlot=in.nextInt();

                    Booking booking =new Booking(chosenSlot,chosenPlayground);

                    break;
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
                    int size =  input.nextInt();
                    System.out.println("Enter playground pricePerHour");
                    float pricePerHour = input.nextFloat();
                    System.out.println("Enter playground cancellationPeriod");
                    float cancellationPeriod = input.nextFloat();
                    Playground p = new Playground(pName, locationn, availableHours, size, pricePerHour, cancellationPeriod);
                    playgrounds.add(p);
                    // System.out.println( "the location" +p.getLocation());
                    // System.out.println( playgrounds.get(0));
                    break;

                }
            }
        }
    }
}
