import java.util.Scanner;

public class SearchArray {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int[] arr= {1,23,43,2,5,65,77,88,23};
        int Target;
       System.out.println(" enter the value for Search");
       Target = input.nextInt();
        boolean found = false;
        for (int i =0; i < arr.length;i++){
            if (arr[i]==Target){
                System.out.println(" Target founded Number >>"+Target+"<< at index "+i);
                found = true;
                break ;
            }


        }

  if (!found){
           System.out.println(" target Not Found ");
       }
    }
}
