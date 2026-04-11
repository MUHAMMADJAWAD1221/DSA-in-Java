public class MinValueArray {
   public static void main(String[] args) {
       int[] a = {5,5,6,7,876,1,44};
       int min =a[0];
       for (int i = 0; i < a.length;i++){
           if (a[i]<min){
               min=a[i];

           }


       }
       System.out.println(min);

    }
}
