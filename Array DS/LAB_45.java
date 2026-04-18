//NAME MUHAMMAD JAWAD
//ROLL 2K25/BLCS/45
import java.util.*;
public class LAB_45 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ch;
        do{
            System.out.println("\n1: Traversal"+"\n2: Insertion"+"\n3: Deletion"+"\n4: " +
                    "Searching"+
                    "\n5: Updating"+"\n6: Sorting"+"\n7: Reversing"+"\n8: Merging"+"\n9: Splitting"+"\n0: Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            if (ch==1){
                // Traversal
               for (int ele : arr){
                   System.out.print(ele+" ");
               }

            }else if (ch==2) { // insersion
                System.out.print("Enter position: ");
                int pos = sc.nextInt();
                System.out.print("Enter value: ");
                int val = sc.nextInt();
                if(pos>=0 && pos<arr.length){
                    arr[pos] = val;
                    System.out.println("value inserted : ");
                }

            }else if (ch==3) { // delete
                System.out.print("Enter position: ");
                int  pos = sc.nextInt();
                if(pos>=0 && pos<arr.length){
                    arr[pos] = 0;
                    System.out.println("value deleted : ");
                }

            }else if (ch==4) { // Searching
                System.out.print("Enter value to search: ");
                int val = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == val) {
                        System.out.println("Found at index " + i);
                        found = true;

                    }
                }
                if (!found)
                    System.out.println("Not found");
            }
            else if (ch==6) {// Sorting
                for (int i = 0; i < n-1; i++) { // n - 1 passes
                    for (int j = 0; j < n - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;

                        }
                    }
                }
                for(int i=0; i<n; i++){
                    System.out.print(arr[i] + " ");
                }
            }else if (ch==7) { // // Reversing
                int i = 0;
                int j = arr.length-1;
                while(i<j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j--;
                    i++;
                }
                for (int a =0; i<n;i++){
                    System.out.print( arr[i] + " ");
                }
            }   // Merging
            if (ch==8) {
                System.out.print("Enter size of second array: ");
                int s = sc.nextInt();
                int[] arr2 = new int[s];

                System.out.println("Enter elements:");
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = sc.nextInt();
                }
                for (int i = 0; i < s; i++) {
                    arr[n + i] = arr2[i];
                }
                n += s;
                System.out.println("Arrays Merged");

            }
            // Splitting
            if (ch==9) {
                int mid = n / 2;
                System.out.println("First array:");
                for (int i = 0; i < mid-1; i++)
                    System.out.print(arr[i] + " ");

                System.out.println("\nSecond array:");
                for (int i = mid; i < n; i++)
                    System.out.print(arr[i] + " ");
                System.out.println();

            }


        }while(ch != 0);
    }
}