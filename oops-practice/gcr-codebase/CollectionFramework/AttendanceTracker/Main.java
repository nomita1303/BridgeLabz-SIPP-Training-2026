public class Main {

    public static void main(String[] args) {

        AttendanceTracker tracker = new AttendanceTracker();

        tracker.markAttendance("Java","Nomita");
        tracker.markAttendance("Java","Rahul");
        tracker.markAttendance("Java","Nomita");

        tracker.markAttendance("Python","Ankit");
        tracker.markAttendance("Python","Riya");

        tracker.displayAttendance();
    }
}