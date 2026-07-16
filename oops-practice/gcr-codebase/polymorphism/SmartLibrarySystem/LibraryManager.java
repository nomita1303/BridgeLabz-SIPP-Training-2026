public class LibraryManager {

    public static void searchMember(LibraryMember[] members, String id) {

        for (LibraryMember member : members) {

            if (member.memberId.equals(id)) {
                System.out.println("\nMember Found:");
                member.printDetails();
                return;
            }
        }

        System.out.println("\nMember Not Found.");
    }
}