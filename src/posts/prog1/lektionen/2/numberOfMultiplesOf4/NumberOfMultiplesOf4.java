import java.util.Arrays;

public class NumberOfMultiplesOf4 {
    void main(String[] args) {
        int[][] arrays_to_test = {
            {},
            { 0 },
            { 10, 3, 4, 0 },
            { 10, 3, 4, 8, 12, 3, 1 },
            { 1, 1, 1, 1, 1, 1 },
            { 0, 4, 8, 12, 16, 20 },
        };

        for (int[] array_to_test: arrays_to_test) {
            System.out.println("Testing: " + Arrays.toString(array_to_test));
            System.out.println("Result: " + numberOfMultiplesOf4(array_to_test));
        }
    }

    public static int numberOfMultiplesOf4(int[] int_arr) {
        int num = 0;
        
        for (int i = 0; i < int_arr.length; i++) {
            int current_number = int_arr[i];

            if (current_number % 4 == 0) {
                num++;
            }
        }

        return num;
    }
}