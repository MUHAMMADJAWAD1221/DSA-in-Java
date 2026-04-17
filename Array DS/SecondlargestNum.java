public class SecondlargestNum {
   public static void main(String[] args) {

       // PENDING BECUSE OF AN ERROR
       int[] arr={1,2,3,4,76,45};
       int Max = Integer.MIN_VALUE;
       int max= Integer.MIN_VALUE;
       for (int i =0;i<arr.length;i++){
           if (arr[i] > max ){
               max=arr[i];
           }
          for (i =0; i<arr.length;i++){
               if (arr[i]>Max && arr[i]!=max){
                   max = arr[i];
               }
              System.out.println(max);
           }
       }


    }

}
