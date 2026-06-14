import java.util.Scanner;

public class ShortestLongestWord {

    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitText(String text) {

        int words = 1;

        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        String[] result = new String[words];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= findLength(text); i++) {

            if (i == findLength(text) || text.charAt(i) == ' ') {

                String word = "";

                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }

                result[index++] = word;
                start = i + 1;
            }
        }

        return result;
    }

    public static String[][] getWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            table[i][0] = words[i];
            table[i][1] =
                    String.valueOf(findLength(words[i]));
        }

        return table;
    }

    public static int[] shortestLongest(String[][] table) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < table.length; i++) {

            if (Integer.parseInt(table[i][1]) <
                    Integer.parseInt(table[shortest][1])) {

                shortest = i;
            }

            if (Integer.parseInt(table[i][1]) >
                    Integer.parseInt(table[longest][1])) {

                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);

        String[][] table = getWordLengthTable(words);

        int[] result = shortestLongest(table);

        System.out.println("Shortest Word: "
                + table[result[0]][0]);

        System.out.println("Longest Word: "
                + table[result[1]][0]);
    }
}