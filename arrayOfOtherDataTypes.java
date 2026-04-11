public class arrayOfOtherDataTypes {
    static void main(String[] args) {
        int[] x= {2,3,4,5,6,7,7};
        System.out.println(x[1]);
       Change(x);
        System.out.println(x[1]);

    }
  public static  void Change(int[] s){
        s[1]=99;
    }
}