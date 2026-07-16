
public class AstronomerBinarySearch {

    // Normal Binary Search
    static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    // Search in Rotated Sorted Array
    static int searchRotated(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[left] <= arr[mid]) {

                if (target >= arr[left] && target < arr[mid])
                    right = mid - 1;
                else
                    left = mid + 1;

            } else {

                if (target > arr[mid] && target <= arr[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }

        return -1;
    }

    // First Occurrence
    static int firstOccurrence(int[] arr, int target) {

        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return ans;
    }

    // Last Occurrence
    static int lastOccurrence(int[] arr, int target) {

        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return ans;
    }

    // Minimum in Rotated Array
    static int findMinimum(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right])
                left = mid + 1;
            else
                right = mid;
        }

        return arr[left];
    }

    public static void main(String[] args) {

        int[] stars = {10,20,30,40,50,60,70};

        System.out.println("Binary Search : " +
                binarySearch(stars,40));

        int[] rotated = {40,50,60,70,10,20,30};

        System.out.println("Rotated Search : " +
                searchRotated(rotated,20));

        int[] repeated = {5,10,10,10,20,30};

        System.out.println("First : " +
                firstOccurrence(repeated,10));

        System.out.println("Last : " +
                lastOccurrence(repeated,10));

        System.out.println("Minimum : " +
                findMinimum(rotated));
    }
}