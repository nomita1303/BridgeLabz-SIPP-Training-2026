import java.util.HashSet;

public class EventManager {

    private HashSet<String> participants = new HashSet<>();

    public void register(String email) {

        if (participants.add(email))
            System.out.println("Registration Successful.");
        else
            System.out.println("Duplicate Registration Rejected.");
    }

    public void displayParticipants() {

        System.out.println("\nRegistered Participants");

        for (String email : participants)
            System.out.println(email);

        System.out.println("Total Participants = " + participants.size());
    }
}