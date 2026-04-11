import java.util.Scanner;
public class Blood_Donation_Management_System {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        functions a = new functions();
        String ch;
        do {
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
                    a.AddDonner();
                    break;
                case "2":
                    a.ViewDoner();
                    break;

                case "3":
                    a.SearchDoner();
                    break;
                case "4":
                    a.UpdateDoner();
                    break;
                case "5":
                    a.DeleteDonner();
                    break;
                default:

            }


        }
        while (!ch.equals("6"));
    }
}