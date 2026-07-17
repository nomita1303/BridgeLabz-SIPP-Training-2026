import java.util.HashMap;
import java.util.Map;

public class MostFrequentErrorCode {

    public int mostFrequentErrorCode(int[] codes) {

        Map<Integer, Integer> frequency = new HashMap<>();

        int bestCode = codes[0];
        int bestCount = 0;

        for (int code : codes) {

            int count = frequency.getOrDefault(code, 0) + 1;
            frequency.put(code, count);

            if (count > bestCount) {
                bestCount = count;
                bestCode = code;
            }
        }

        return bestCode;
    }

    public static void main(String[] args) {

        MostFrequentErrorCode obj = new MostFrequentErrorCode();

        int[] codes = {500, 404, 500, 200, 500, 404};

        System.out.println(obj.mostFrequentErrorCode(codes));
    }
}