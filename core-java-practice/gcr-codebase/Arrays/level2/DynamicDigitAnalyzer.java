import java.util.Arrays;
import java.util.Scanner;

public class DynamicDigitAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.next();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        for (int i = 0; i < number.length(); i++) {

            if (index == maxDigit) {
                maxDigit += 10;
                digits = Arrays.copyOf(digits, maxDigit);
            }

            digits[index++] = number.charAt(i) - '0';
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);

        sc.close();
    }
}