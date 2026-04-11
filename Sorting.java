import java.util.Arrays;

public class Sorting {
   public static void main(String[] args) {
       int[] arr = {-3,55,66,44,3,2,6,87,5,23};
      print(arr);
       Arrays.sort(arr);
       System.out.println();
       print(arr);
   }
   public static void print(int[] arr){
       for (int i =0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
   }
}
