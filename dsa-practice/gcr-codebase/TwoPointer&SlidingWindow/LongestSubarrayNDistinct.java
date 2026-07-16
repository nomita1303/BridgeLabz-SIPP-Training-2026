import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayNDistinct {

    public static int longestSubarrayWithAtMostNDistinct(int[] keyIds, int n) {

        Map<Integer, Integer> freq = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < keyIds.length; right++) {

            freq.put(keyIds[right],
                    freq.getOrDefault(keyIds[right], 0) + 1);

            while (freq.size() > n) {

                int value = keyIds[left];

                freq.put(value, freq.get(value) - 1);

                if (freq.get(value) == 0)
                    freq.remove(value);

                left++;
            }

            maxLength = Math.max(maxLength,
                    right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 2, 3, 2, 2};

        int n = 2;

        System.out.println(longestSubarrayWithAtMostNDistinct(arr, n));
    }
}