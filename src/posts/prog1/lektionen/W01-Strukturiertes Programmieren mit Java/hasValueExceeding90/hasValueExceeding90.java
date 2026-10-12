import java.util.Arrays;

public class hasValueExceeding90 {
    void main(String[] args) {
        int[][] arrays_to_test = {
            {},
            { 0 },
            { 10, 3, 4, 0 },
            { 10, 3, 4, 8, 12, 3, 1 },
            { 1, 1, 1, 1, 1, 1 },
            { 0, 4, 8, 12, 16, 20 },
            { 0, 4, 8, 12, 16, 89 },
            { 0, 4, 8, 12, 16, 90 },
            { 90 },
            { 1, 90, 1 },
            { 90, 1 },
        };

        for (int[] array_to_test: arrays_to_test) {
            System.out.println("Testing: " + Arrays.toString(array_to_test));
            System.out.println("Result: " + hasValueExceeding90(array_to_test));
        }
    }

    public static int hasValueExceeding90(int[] arr) {
        int[] arr; // assume this to be initialized
        int i = 0;
        while (i < arr.length && arr[i] <= 90) {
            i++;
        }
        boolean hasValueExceeding90 = arr.length != 0 && arr[i] > 90; // needs completion
        return hasValueExceeding90;
    }
}