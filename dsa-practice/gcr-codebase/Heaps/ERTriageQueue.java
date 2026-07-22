import java.util.*;

public class ERTriageQueue {

    static class Patient {
        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        @Override
        public String toString() {
            return name + " (Severity: " + severity + ")";
        }
    }

    static PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> b.severity - a.severity);

    static void addPatient(Patient p) {
        triageQueue.offer(p);
    }

    static Patient treatNext() {
        return triageQueue.poll();
    }

    public static void main(String[] args) {

        addPatient(new Patient("Alice", 4));
        addPatient(new Patient("Bob", 8));
        addPatient(new Patient("Charlie", 6));

        while (!triageQueue.isEmpty()) {
            System.out.println(treatNext());
        }
    }
}