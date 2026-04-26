package DataStructures_Project;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Stack;

public class BDMS {

    Scanner input = new Scanner(System.in);

    Stack<Donor> donors = new Stack<>();

    void AddDonner() {

        System.out.println("Enter donor name:");
        String name = input.nextLine();

        System.out.println("Enter blood group:");
        String bloodGroup = input.nextLine();

        System.out.println("Enter phone number:");
        String phone = input.nextLine();

        Donor d = new Donor(name, bloodGroup, phone, LocalDate.now());
        donors.push(d);

        System.out.println("Donor added successfully");
    }

    void ViewDoner() {

        if (donors.isEmpty()) {
            System.out.println("No donation found!");
            return;
        }

        for (Donor d : donors) {
            System.out.println(
                    "NAME: " + d.name +
                            "\nBlood Group: " + d.bloodGroup +
                            "\nPhone: " + d.phoneNumber +
                            "\nDate: " + d.donationDate +
                            "\n--------------------"
            );
        }
    }

    void SearchDoner() {

        System.out.println("Enter blood group to search:");
        String bg = input.nextLine();

        boolean found = false;

        for (Donor d : donors) {
            if (d.bloodGroup.equals(bg)) {
                System.out.println(
                        "NAME: " + d.name +
                                "\nBlood Group: " + d.bloodGroup +
                                "\nPhone: " + d.phoneNumber +
                                "\nDate: " + d.donationDate +
                                "\n--------------------"
                );
                found = true;
            }
        }

        if (!found) {
            System.out.println("No donors found with this blood group");
        }
    }

    void UpdateDoner() {

        System.out.println("Enter donor name to update:");
        String name = input.nextLine();

        boolean found = false;

        for (Donor d : donors) {
            if (d.name.equals(name)) {

                System.out.println("Enter new donor name:");
                d.name = input.nextLine();

                System.out.println("Enter new blood group:");
                d.bloodGroup = input.nextLine();

                System.out.println("Enter new phone number:");
                d.phoneNumber = input.nextLine();

                d.donationDate = LocalDate.now();

                System.out.println("Donor updated successfully");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Donor not found");
        }
    }

    void DeleteDoner() {

        System.out.println("Enter donor name to delete:");
        String name = input.nextLine();

        boolean removed = donors.removeIf(d -> d.name.equals(name));

        if (removed) {
            System.out.println("Donor deleted successfully");
        } else {
            System.out.println("Donor not found");
        }
    }
}