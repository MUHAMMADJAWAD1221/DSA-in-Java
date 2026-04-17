public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 5};
        boolean result = twoSum(arr, 2);
        System.out.println(result);
    }

    public static boolean twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Found at index: " + i + " and " + j+" values are "+arr[j]+""+arr[i]);
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }
}