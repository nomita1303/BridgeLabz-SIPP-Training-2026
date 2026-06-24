public class UniversityMain {

    public static void main(String[] args) {

        GradStudent grad =
                new GradStudent(
                        "Nomita",
                        20,
                        101,
                        8.9,
                        "Artificial Intelligence");

        System.out.println(grad);

        System.out.println(
                "GradStudent IS-A Student: "
                        + (grad instanceof Student));

        System.out.println(
                "Student IS-A Person: "
                        + (grad instanceof Person));
    }
}