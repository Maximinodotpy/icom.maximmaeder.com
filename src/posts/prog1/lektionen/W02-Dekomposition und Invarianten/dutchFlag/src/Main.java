import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char[] test1 = { 'r', 'w', 'b' };
        dutchSort(test1);

        char[] test2 = {
                'r',
                'w',
                'b',
                'r',
                'w',
                'b',
        };
        dutchSort(test2);

        char[] test3 = {
                'r',
                'w',
                'b',
                'r',
                'r',
                'r',
        };
        dutchSort(test3);

        char[] test4_empty = {};
        dutchSort(test4_empty);
    }

    public static void dutchSort(char[] arr) {
        int r = 0;
        int w = 0;
        int b = arr.length;

        while( w != b) {
            if (arr[w] == 'w') {
                w++;
            } else if (arr[w] == 'b') {
                b--;

                // Move
                swapChar(arr, w, b);
            } else if (arr[w] == 'r') {
                // Move
                swapChar(arr, r, w);

                r++;
                w++;
            }
        }

        System.out.println("Sorted ...");
        System.out.println(r);
        System.out.println(b);
        System.out.println(Arrays.toString(arr));
    }

    public static char[] swapChar(char[] array, int i1, int i2) {
        char temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;

        return array;
    }
}