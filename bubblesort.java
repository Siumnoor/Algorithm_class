
import java.util.Arrays;
import static java.util.Collections.swap;

public class bubblesort {

    public static void main(String[] args) {

        int[] numbers = {34, 12, 145, 36, 16, 87, 45, 99, 77, 12};

        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void bubbleSort(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;

                }
            }
        }

    }

}
