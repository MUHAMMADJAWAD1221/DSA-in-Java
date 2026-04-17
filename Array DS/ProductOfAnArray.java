public class ProductOfAnArray {
    static void main(String[] args) {
        int[] a={1,3,5,6,7,8};
        int product =1;
        for (int i =0;i<a.length;i++){
           product*=a[i];

        }
        System.out.println(product);

    }
}
