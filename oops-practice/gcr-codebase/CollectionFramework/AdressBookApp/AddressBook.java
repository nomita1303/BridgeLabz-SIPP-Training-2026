import java.util.*;

public class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();
    private HashMap<String, Contact> contactMap = new HashMap<>();
    private HashSet<String> phoneNumbers = new HashSet<>();

    public void addContact(Contact contact) {

        if (phoneNumbers.contains(contact.getPhone())) {
            System.out.println("Duplicate phone number!");
            return;
        }

        contacts.add(contact);
        contactMap.put(contact.getName(), contact);
        phoneNumbers.add(contact.getPhone());

        System.out.println("Contact Added.");
    }

    public void searchContact(String name) {

        if (contactMap.containsKey(name))
            System.out.println(contactMap.get(name));
        else
            System.out.println("Contact Not Found.");
    }

    public void deleteContact(String name) {

        Contact c = contactMap.remove(name);

        if (c != null) {
            contacts.remove(c);
            phoneNumbers.remove(c.getPhone());
            System.out.println("Contact Deleted.");
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    public void displayContacts() {

        Collections.sort(contacts, Comparator.comparing(Contact::getName));

        for (Contact c : contacts)
            System.out.println(c);
    }
}