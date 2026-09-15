import java.util.*;

public class binSearch {
    public static void main(String[] args) {
        Map<Integer, int[]> arrays_to_test = new HashMap<>();

        arrays_to_test.put(1, new int[]{10,11,12});

        for (Map.Entry<Integer, int[]> mapElement: arrays_to_test.entrySet()) {
            System.out.println(mapElement.getKey());
            System.out.println(mapElement.getValue());
        }
    }

    public static int binSearch(int[] arr, int needle) {
        int i = 0;
        int j = arr.length;
        
        int position;

        while (true) {
            position = (i + j) / 2;

            int value_at_position = arr[position];

            if (value_at_position == needle || i == (j-1)) {
                return position;
            } else if (value_at_position > needle) {
                i = position;
            } else {
                j = position;
            }
        }
    }
}