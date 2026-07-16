public class Main {

    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        book.addContact(new Contact("Nomita","9876543210","nomita@gmail.com"));
        book.addContact(new Contact("Rahul","9999999999","rahul@gmail.com"));
        book.addContact(new Contact("Ankit","8888888888","ankit@gmail.com"));

        book.searchContact("Rahul");

        System.out.println("\nSorted Contacts");
        book.displayContacts();

        book.deleteContact("Rahul");

        System.out.println("\nAfter Deletion");
        book.displayContacts();
    }
}