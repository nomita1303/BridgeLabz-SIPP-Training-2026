import java.util.List;

public class GenericUtility {

    // Generic Method
    public static <T extends Comparable<T>> T findMax(T[] arr) {

        T max = arr[0];

        for (T value : arr) {

            if (value.compareTo(max) > 0) {
                max = value;
            }
        }

        return max;
    }

    // Wildcard Method
    public static void printList(List<?> list) {

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}