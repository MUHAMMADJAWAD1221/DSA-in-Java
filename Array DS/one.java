import java.util.Scanner;

public class one
{
   public static void main()
   {
        int []arr={5,8,4,2,9,6};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       System.out.println();
        int mid=arr.length/2;

        int [] first=new int[mid];
        int[] second=new int[arr.length-mid];

       System.out.println("First Half  \n");
       for(int i=0;i<mid;i++)
       {
           first[i]=arr[i];
       }
       for(int i=0;i<first.length;i++)
       {
           System.out.print(first[i]+" ");
       }

       System.out.println("Second half");
       for(int i=mid;i<arr.length;i++){
           second[i-mid]=arr[i];
       }
       for(int i=0;i<second.length;i++){
           System.out.print(second[i]+" ");
       }


    }
}
