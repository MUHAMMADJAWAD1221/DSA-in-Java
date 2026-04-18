public class ArraySwap {
  public static void main(String[] args) {
      int[] arr={1,5,4,3,2,3,4};
      int n= arr.length;
      int j =n-1;
      int i=0;
      while (i<j){
          int temp = arr[i];
          arr[i]=arr[j];
          arr[j] = temp;
          i++;
          j--;


      }
      for (int ele: arr){
          System.out.print(ele+" ");
      }


    }
}