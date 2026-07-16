import java.util.ArrayList;
import java.util.HashMap;

public class AttendanceTracker {

    private HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    public void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println("Duplicate Attendance Not Allowed.");
        }
    }

    public void displayAttendance() {

        System.out.println();

        for (String subject : attendance.keySet()) {

            System.out.println("Subject : " + subject);

            ArrayList<String> students = attendance.get(subject);

            for (String s : students)
                System.out.println(s);

            System.out.println("Total Present = " + students.size());
            System.out.println();
        }
    }
}