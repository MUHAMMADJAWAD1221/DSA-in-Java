import java.lang.reflect.Array;
import java.util.Arrays;

public class MinValueArray {
   public static void main(String[] args) {
       int[] a = {5,5,6,7,876,1,44};
       int min =a[0];
       System.out.println("before sort");
       for (int i =0; i<a.length;i++){
           System.out.print(a[i]+" ");
       }
       System.out.println("Min Value of Array");
       for (int i = 0; i < a.length;i++){
           if (a[i]<min){
               min=a[i];

           }


       }
       Arrays.sort(a);
       System.out.println(min);
       System.out.println("After sort");
       for (int i =0; i<a.length;i++){

           System.out.print(a[i]+" ");
       }



    }
}
