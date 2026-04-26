public class multiplyingOddIndexes {
    static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        for (int i =1; i<a.length;i++){
            if (a[i]%3==0){
                a[i]*=2;
                System.out.print(a[i]);

            }

            else{


                a[i]+=10;
                System.out.print(a[i]+" ");
            }
        }
    }
}