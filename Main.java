package com.company;
import java.util.*;
import static com.company.Playground.playgroundCount;
import static com.company.Playground.playgrounds;
import java.util.*;
import static java.lang.System.exit;

/**
 * @author  Sohaila,noura,samaa
 * @version 1.0
 * @since 12/6/2021
 */

/**
 * this is class main
 */
public class Main {
    /**
     * this is main function that call methods to register in gofo system,register a playground and book a playground
     * @param args
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in); //System.in is a standard input stream
            while (true) {
                System.out.println("1)Register \n2)Login \nPress any other key to exit.");
                int opt = sc.nextInt();
                if (opt == 1) { //register
                    System.out.println("Enter your name");
                    String name = sc.next() + sc.nextLine();
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

                    System.out.println("1-player \n2-owner?");
                    int option = sc.nextInt();
                    switch (option) {
                        case 1: {// register player
                            User obj = new Player(name, address, email, password, id, phoneNum);
                            bookingPlayground();
                            break;
                        }
                        case 2: { // regester owner
                            Scanner input = new Scanner(System.in);
                            User obj = new Owner(name, address, email, password, id, phoneNum);
                            System.out.println(obj);
                            registerPlayground();
                            break;
                        }

                    }
                } else if (opt == 2) { ////////login
                    System.out.println("1-player \n2-owner?");
                    int option = sc.nextInt();
                    switch (option) {
                        case 1: {// login player
                            System.out.println("Enter your name");
                            String name = sc.next() + sc.nextLine();
                            System.out.println("Enter your password");
                            String password = sc.nextLine();
                            int playerFound = 0;
                            for (int i = 0; i < Player.players.size(); i++) {
                                if (Player.players.get(i).getUserName().equals(name) && Player.players.get(i).getPassword().equals(password)) {
                                    playerFound++;
                                    bookingPlayground();
                                    break;
                                }
                            }
                            if (playerFound == 0) {
                                System.out.println("UserName and Password Not found\nplease register first!\n");
                                break;
                            }

                            break;
                        }
                        case 2: { // login owner

                            System.out.println("Enter your name");
                            String name = sc.next() + sc.nextLine();
                            System.out.println("Enter your password");
                            String password = sc.nextLine();
                            int ownerFound = 0;
                            for (int i = 0; i < Owner.owners.size(); i++) {

                                if (Owner.owners.get(i).getUserName().equals(name) && Owner.owners.get(i).getPassword().equals(password)) {
                                    System.out.println("welcome!!");
                                    registerPlayground();
                                    ownerFound++;
                                }
                            }
                            if (ownerFound == 0) {
                                System.out.println("UserName and Password Not found\nplease register first!\n");
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("Good Bye!");
                    exit(0);

                }
            }
        } catch (Exception ioException) {
        }
    }

    /**
     * this function is to take info of a playground that requested to be registered.
     */
    public static void registerPlayground() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter playground name");
        String pName = input.next() + input.nextLine();
        System.out.println("Enter playground location");
        String locationn = input.nextLine();
        System.out.println("Enter playground availableHours");
        int availableHours = input.nextInt();
        System.out.println("Enter playground size ");
        int size = input.nextInt();
        System.out.println("Enter playground pricePerHour");
        float pricePerHour = input.nextFloat();
        System.out.println("Enter playground cancellationPeriod");
        float cancellationPeriod = input.nextFloat();
        Playground p = new Playground(pName, locationn, availableHours, size, pricePerHour, cancellationPeriod);
        playgrounds.add(p);

    }

    /**
     * this function is to take the location and display all playgrounds within this location
     * and display the slots in the playground he has chosen.
     */
    public static void bookingPlayground() {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("enter the location you want");
            String location = sc.next() + sc.nextLine();
            ///select the playgrounds with the selected location
            int found = 0;
            for (int i = 0; i < playgroundCount; i++) {
                String loc = (playgrounds.get(i)).getLocation();
                if (loc.equalsIgnoreCase(location)) {
                    int j = i + 1;
                    System.out.print(j + " :");
                    System.out.println(playgrounds.get(i));
                    found++;
                }
            }
            if (found == 0) {
                System.out.println("This location is not available!\n 1. search for another location 2. Exit the System?");
                int choice = sc.nextInt();
                if (choice == 1) {
                    continue;
                } else {
                    break;
                }

            } else {
                System.out.println("choose the playground you want");
                int choose = sc.nextInt();
                Playground chosenPlayground = playgrounds.get(choose - 1);


                int slotfound=0;
                //print slots

                for (int k = 0; k < playgrounds.get(choose - 1).getAvailableHours(); k++) {
                    if (playgrounds.get(choose - 1).availableSlots[k].equals(" ")) {
                        continue;
                    } else {
                        System.out.println(playgrounds.get(choose - 1).availableSlots[k]);
                        slotfound++;
                    }
                }
                if(slotfound==0){
                    System.out.println("There are no slots left in this playground");
                    continue;
                }
                while (true) {

                    Scanner in = new Scanner(System.in);
                    System.out.println("enter number of slot you want");
                    int chosenSlot = in.nextInt();

                    //out of range slot
                    if (chosenSlot > playgrounds.get(choose - 1).getAvailableHours()) {
                        System.out.println("No slot with this number!!");
                        continue;
                    } else {
                        Booking booking = new Booking(chosenSlot, chosenPlayground);
                        break;
                    }
                }

                break;
            }
        }
    }
}
