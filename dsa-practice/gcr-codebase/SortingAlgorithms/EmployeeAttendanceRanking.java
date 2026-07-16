import java.util.Arrays;

public class EmployeeAttendanceRanking {

    public static int[] topKEmployees(int[] ids, int[] attendance, int k) {

        Integer[] index = new Integer[ids.length];

        for (int i = 0; i < ids.length; i++) {
            index[i] = i;
        }

        Arrays.sort(index, (a, b) -> {

            if (attendance[b] != attendance[a])
                return attendance[b] - attendance[a];

            return ids[a] - ids[b];
        });

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = ids[index[i]];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] employeeIds = {101, 102, 103, 104, 105};
        int[] attendance = {92, 85, 98, 92, 80};

        int[] result = topKEmployees(employeeIds, attendance, 3);

        System.out.println(Arrays.toString(result));
    }
}