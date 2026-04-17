public class LargestArray {
 public static void main(String[] args) {
     int[] arr={2,3,4,5,6,6,4,7,87};
     int max =Integer.MIN_VALUE;
     for (int i=0;i<arr.length;i++){
         if (arr[i] > max){
             max =arr[i];
         }
     }
     System.out.println(" largest value of the Array is "+max);

    }
}