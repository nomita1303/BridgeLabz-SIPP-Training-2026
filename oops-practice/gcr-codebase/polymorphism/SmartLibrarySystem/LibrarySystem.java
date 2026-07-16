public class LibrarySystem {

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Nomita", "S101"),
                new FacultyMember("Dr. Sharma", "F201"),
                new GuestMember("Rahul", "G301")
        };

        int overdueDays = 4;

        System.out.println("Library Members:\n");

        for (LibraryMember member : members) {

            member.printDetails();

            // Dynamic Method Dispatch
            System.out.println("Fine = ₹" +
                    member.calculateFine(overdueDays));

            System.out.println("----------------------");
        }

        LibraryManager.searchMember(members, "F201");
    }
}