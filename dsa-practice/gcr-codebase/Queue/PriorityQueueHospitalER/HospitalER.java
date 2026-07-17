import java.util.PriorityQueue;

public class HospitalER {

    private PriorityQueue<Patient> triageQueue;

    public HospitalER() {

        triageQueue = new PriorityQueue<>(
                (a, b) -> a.priority - b.priority
        );
    }

    public void admitPatient(Patient patient) {
        triageQueue.offer(patient);
    }

    public Patient callNextPatient() {
        return triageQueue.poll();
    }

    public void displayQueue() {
        System.out.println(triageQueue);
    }

    public static void main(String[] args) {

        HospitalER er = new HospitalER();

        er.admitPatient(new Patient(3, "Rahul"));
        er.admitPatient(new Patient(1, "Anita"));
        er.admitPatient(new Patient(2, "Karan"));

        System.out.println(er.callNextPatient());

        System.out.println(er.callNextPatient());

        System.out.println(er.callNextPatient());
    }
}