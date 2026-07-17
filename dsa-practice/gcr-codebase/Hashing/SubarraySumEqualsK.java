import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    public int subarraySumEqualsK(int[] revenueChanges, int k) {

        Map<Integer, Integer> prefixCount = new HashMap<>();

        prefixCount.put(0, 1);

        int runningSum = 0;
        int answer = 0;

        for (int value : revenueChanges) {

            runningSum += value;

            answer += prefixCount.getOrDefault(runningSum - k, 0);

            prefixCount.put(runningSum,
                    prefixCount.getOrDefault(runningSum, 0) + 1);
        }

        return answer;
    }

    public static void main(String[] args) {

        SubarraySumEqualsK obj = new SubarraySumEqualsK();

        int[] arr = {1, 1, 1};

        System.out.println(obj.subarraySumEqualsK(arr, 2));
    }
}