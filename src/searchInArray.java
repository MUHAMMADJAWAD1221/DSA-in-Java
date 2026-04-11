import java.util.Scanner;

public class searchInArray {
    static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the value for search");
        int x = input.nextInt();
        for (int i = 0; i<a.length; i++){
            if (a[i]==x){
                System.out.println(" element Found");
                break;
            }

        else {

                    System.out.println(" not found");

            }
          }

        }
    }

