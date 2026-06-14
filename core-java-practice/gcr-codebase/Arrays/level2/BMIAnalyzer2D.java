import java.util.Scanner;

public class BMIAnalyzer2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int persons = sc.nextInt();

        double[][] personData = new double[persons][3];
        String[] status = new String[persons];

        for (int i = 0; i < persons; i++) {

            do {
                System.out.print("Weight: ");
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Height: ");
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);

            personData[i][2] =
                    personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5)
                status[i] = "Underweight";
            else if (personData[i][2] < 25)
                status[i] = "Normal";
            else if (personData[i][2] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("\nReport");

        for (int i = 0; i < persons; i++) {
            System.out.println(
                    "Weight=" + personData[i][0] +
                    " Height=" + personData[i][1] +
                    " BMI=" + personData[i][2] +
                    " Status=" + status[i]);
        }

        sc.close();
    }
}