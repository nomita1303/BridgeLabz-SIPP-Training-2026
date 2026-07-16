import java.util.Arrays;

public class SportsMeetAnalysis {

    public static void bubbleSort(int[] arr) {

        int swaps = 0;

        System.out.println("Bubble Sort Passes");

        for (int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            System.out.println("Pass " + (i + 1) + " : " + Arrays.toString(arr));

            if (!swapped) {
                System.out.println("Already Sorted (Best Case)");
                break;
            }
        }

        System.out.println("Total Swaps = " + swaps);
    }

    public static void insertionSort(int[] arr) {

        System.out.println("\nInsertion Sort Passes");

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("Pass " + i + " : " + Arrays.toString(arr));
        }
    }

    public static void top3(int[] arr) {

        Arrays.sort(arr);

        System.out.println("\nTop 3 Medalists");

        for (int i = arr.length - 1; i >= arr.length - 3; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] data = {64, 25, 12, 22, 11};

        int[] bubble = data.clone();
        int[] insertion = data.clone();

        bubbleSort(bubble);

        insertionSort(insertion);

        top3(data.clone());
    }
}