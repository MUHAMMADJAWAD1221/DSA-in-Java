import java.time.LocalDate;
import java.util.Scanner;
public class functions {

    int max_Donner = 100;
    String[] donorNames = new String[max_Donner];
    String[] bloodGroups = new String[max_Donner];
    String[] phoneNumbers = new String[max_Donner];
    LocalDate[] localDates = new LocalDate[max_Donner];
    Scanner input = new Scanner(System.in);
    int donerCounter = 0;
    void AddDonner() {
        if (donerCounter < max_Donner) {
            System.out.println(" Enter donner name ");
            String D_name = input.nextLine();
            System.out.println("Enter blood group");
            String B_Group = input.nextLine();
            System.out.println(" enter the Doner's Ph#");
            String ph = input.nextLine();

            LocalDate donationDate = LocalDate.now();
            donorNames[donerCounter] = D_name;
            bloodGroups[donerCounter] = B_Group;
            phoneNumbers[donerCounter] = ph;
            localDates[donerCounter]=donationDate;
            donerCounter++;
            System.out.println("Donor added successfully");

        } else {
            System.out.println("Storage is full");
        }
    }
    void ViewDoner(){
        if (donerCounter==0) {
            System.out.println(" no donation found!");

        }
        else {
            for (int i=0;i<donerCounter;i++){
                System.out.println("NAME : "+donorNames[i]+" \nBlood Group : "+bloodGroups[i]+
                        "\nPhone number : "+phoneNumbers[i]+"\nDate : "+localDates[i]);


            }

        }
    }
    void SearchDoner() {
        System.out.println(" Enter B-Group for search Doner");
        String BGP = input.nextLine();
        boolean found = false;
        for (int i = 0; i <= donerCounter-1; i++) {
            if (bloodGroups[i].equals(BGP)) {
                System.out.println("NAME: "+donorNames[i]+" \n Blood Group: "+bloodGroups[i]+
                        "\n Phone number: "+phoneNumbers[i]+"\n Date: "+localDates[i]);
                found = true;


            }
            if (!found) {
                System.out.println("No donors found with this blood group");
            }

        }

    }
    void UpdateDoner(){
        System.out.println(" Enter the doner Name: ");
        String DN=input.nextLine();
        int FoundIndex = -1;
        for (int i=0;i<donerCounter;i++){

            if (donorNames[i].equals(DN)){
                FoundIndex = i;
                System.out.println("update any/all information");

                System.out.println(" Enter donner name ");
                String D_name = input.nextLine();
                System.out.println("Enter blood group");
                String B_Group = input.nextLine();
                System.out.println(" enter the Doner's Ph#");
                String ph = input.nextLine();
                LocalDate donationDate = LocalDate.now();
                donorNames[i] = D_name;
                bloodGroups[i] = B_Group;
                phoneNumbers[i] = ph;
                localDates[i] = donationDate;
                System.out.println("DONER UPDATED SUCCESSFULLY ");

            }
            if (FoundIndex==-1){
                System.out.println(" donner not found ");

            }

        }


    }
    void DeleteDonner(){
        System.out.println("Enter the doner name: ");
        String DN = input.nextLine();
        int foundIndex = -1;
        for (int i = 0; i<donerCounter;i++){
            if (donorNames[i] != null && donorNames[i].equals(DN)){
                foundIndex=i;
                for(int a = foundIndex;a<donerCounter;a++){
                    donorNames[a]=donorNames[a+1];
                    bloodGroups[a]=bloodGroups[a+1];
                    phoneNumbers[a]=phoneNumbers[a+1];
                    localDates[a]=localDates[a+1];
                    donerCounter--;
                    break;
                }
                if (foundIndex==-1)
                    System.out.println("Donor not found");




            }
            System.out.println(" Donner deleted successfully ");

        }
    }

}