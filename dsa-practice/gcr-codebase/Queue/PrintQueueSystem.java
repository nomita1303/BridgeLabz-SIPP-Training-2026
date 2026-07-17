import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueueSystem {

    private Deque<Integer> printQueue;

    public PrintQueueSystem() {
        printQueue = new ArrayDeque<>();
    }

    // Normal Job
    public void submitJob(int jobId) {
        printQueue.addLast(jobId);
    }

    // Urgent Job
    public void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId);
    }

    // Printer prints from front
    public int printNextJob() {
        return printQueue.removeFirst();
    }

    public void displayQueue() {
        System.out.println(printQueue);
    }

    public static void main(String[] args) {

        PrintQueueSystem printer = new PrintQueueSystem();

        printer.submitJob(1);
        printer.submitJob(2);
        printer.submitJob(3);

        printer.submitUrgentJob(99);

        printer.displayQueue();

        System.out.println("Printed : " + printer.printNextJob());

        printer.displayQueue();
    }
}