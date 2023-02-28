import java.util.Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 15};

        // Find minimum and maximum using loop
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}

