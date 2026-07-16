import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Pair
        Pair<String, Integer> pair =
                new Pair<>("Nomita", 101);

        pair.display();

        System.out.println();

        // Generic Stack
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("SQL");

        stack.display();

        System.out.println("Pop : " + stack.pop());

        stack.display();

        System.out.println();

        // Generic Method findMax()

        Integer[] numbers = {10, 50, 20, 80, 40};

        System.out.println("Maximum = "
                + GenericUtility.findMax(numbers));

        System.out.println();

        // Repository

        Repository<Student> repository =
                new Repository<>();

        repository.add(new Student(1, "Nomita"));
        repository.add(new Student(2, "Rahul"));

        repository.display();

        System.out.println();

        // Wildcard Example

        ArrayList<String> subjects =
                new ArrayList<>();

        subjects.add("Java");
        subjects.add("Python");
        subjects.add("SQL");

        GenericUtility.printList(subjects);
    }
}