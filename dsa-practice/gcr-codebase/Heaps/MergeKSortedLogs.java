import java.util.*;

public class MergeKSortedLogs {

    static class LogEntry {

        int timestamp;

        LogEntry(int timestamp) {
            this.timestamp = timestamp;
        }

        @Override
        public String toString() {
            return String.valueOf(timestamp);
        }
    }

    static List<LogEntry> mergeKSortedLogs(List<List<LogEntry>> sources) {

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a, b) -> sources.get(a[0]).get(a[1]).timestamp
                        - sources.get(b[0]).get(b[1]).timestamp);

        for (int i = 0; i < sources.size(); i++) {

            if (!sources.get(i).isEmpty())
                minHeap.offer(new int[]{i, 0});
        }

        List<LogEntry> merged = new ArrayList<>();

        while (!minHeap.isEmpty()) {

            int[] top = minHeap.poll();

            int source = top[0];
            int index = top[1];

            merged.add(sources.get(source).get(index));

            if (index + 1 < sources.get(source).size()) {
                minHeap.offer(new int[]{source, index + 1});
            }
        }

        return merged;
    }

    public static void main(String[] args) {

        List<List<LogEntry>> logs = new ArrayList<>();

        logs.add(Arrays.asList(new LogEntry(1), new LogEntry(4), new LogEntry(7)));
        logs.add(Arrays.asList(new LogEntry(2), new LogEntry(5), new LogEntry(8)));
        logs.add(Arrays.asList(new LogEntry(3), new LogEntry(6), new LogEntry(9)));

        System.out.println(mergeKSortedLogs(logs));
    }
}