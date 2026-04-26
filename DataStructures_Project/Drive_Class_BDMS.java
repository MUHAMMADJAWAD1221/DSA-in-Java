package DataStructures_Project;
import java.util.Scanner;
public class Drive_Class_BDMS {
   public static void main(String[] args) {

   F_Blood_DMS Test = new F_Blood_DMS();
   Scanner input = new Scanner(System.in);
String ch;
 do{
        System.out.println(
                        "1. Add Donor\n" +
                        "2. View Donors\n" +
                        "3. Search Donor\n" +
                        "4. Update Donor\n" +
                        "5. Delete Donor\n" +
                        "6. Exit");

        ch = input.nextLine();
        switch (ch) {
            case "1":
                Test.AddDonner();
                break;
            case "2":
                Test.ViewDoner();
                break;

            case "3":
                Test.SearchDoner();
                break;
            case "4":
                Test.UpdateDoner();
                break;
            case "5":
                Test.DeleteDoner();
                break;
            default:
                System.out.println(" invalid choice");

        }
    }

        while (!ch.equals("6"));
       System.out.println(" Exiting from System...");
}

}
