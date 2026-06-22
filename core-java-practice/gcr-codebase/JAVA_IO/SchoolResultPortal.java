import java.io.*;

public class SchoolResultPortal {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("students.txt"));

            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("reportcard.txt", true)); // append mode

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];

                int total = 0;

                for (int i = 1; i < data.length; i++) {
                    total += Integer.parseInt(data[i]);
                }

                double average = (double) total / (data.length - 1);

                bw.write("Student: " + name);
                bw.newLine();
                bw.write("Average Marks: " + average);
                bw.newLine();
                bw.write("---------------------");
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Report card generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Student file not found.");
        } catch (IOException e) {
            System.out.println("Error while processing file.");
        }
    }
}