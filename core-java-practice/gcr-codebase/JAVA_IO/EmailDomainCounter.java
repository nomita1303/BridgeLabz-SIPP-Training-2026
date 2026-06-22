import java.io.*;

public class EmailDomainCounter {

    public static void main(String[] args) {

        String[] domains = new String[100];
        int count = 0;

        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("emails.txt"));

            String email;

            while ((email = br.readLine()) != null) {

                int atIndex = email.indexOf('@');

                String domain = email.substring(atIndex + 1);

                domains[count++] = domain;
            }

            br.close();

            int gmail = 0;
            int yahoo = 0;
            int outlook = 0;

            for (int i = 0; i < count; i++) {

                if (domains[i].equals("gmail.com"))
                    gmail++;

                else if (domains[i].equals("yahoo.com"))
                    yahoo++;

                else if (domains[i].equals("outlook.com"))
                    outlook++;
            }

            System.out.println("Gmail Users = " + gmail);
            System.out.println("Yahoo Users = " + yahoo);
            System.out.println("Outlook Users = " + outlook);

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}