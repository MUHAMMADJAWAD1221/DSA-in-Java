import java.lang.reflect.Array;
import java.util.Arrays;

public class DeepCopyOfArray {
    static void main() {
        int[] a ={1,2,3,4,5};
        a[0]=10;
        System.out.println(a[0]);
        int[] x = Arrays.copyOf(a,a.length);

        x[0]=20;
        System.out.println(x[0]);
    }
}
