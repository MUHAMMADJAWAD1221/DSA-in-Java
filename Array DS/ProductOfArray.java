public class ProductOfArray {
   public static void main(String[] args) {
        int[] arr = {3,7,3,-7,8};
        for (int i =0;i<arr.length;i++){
            if (arr[i]%2==1){
                arr[i]*=2;


            }
            else{
                arr[i]+=10;
            }

        }
        for (int i =1;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
