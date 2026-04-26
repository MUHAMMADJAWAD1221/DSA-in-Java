package DataStructures_Project;

import java.time.LocalDate;
public class Donor {
    String name;
    String bloodGroup;
    String phoneNumber;
    LocalDate donationDate;

    public Donor(String name, String bloodGroup, String phoneNumber, LocalDate donationDate) {
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
        this.donationDate = donationDate;
    }
}