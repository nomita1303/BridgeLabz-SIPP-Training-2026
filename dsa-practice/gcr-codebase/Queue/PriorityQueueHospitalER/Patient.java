public class Patient {

    int priority;
    String name;

    public Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (Priority : " + priority + ")";
    }
}