import java.util.Scanner;

public class FriendsInfo {

    public static String youngest(String[] names, int[] ages) {

        int min = 0;

        for(int i = 1; i < ages.length; i++) {
            if(ages[i] < ages[min])
                min = i;
        }

        return names[min];
    }

    public static String tallest(String[] names, double[] heights) {

        int max = 0;

        for(int i = 1; i < heights.length; i++) {
            if(heights[i] > heights[max])
                max = i;
        }

        return names[max];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar","Akbar","Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for(int i = 0; i < 3; i++) {

            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest: " + youngest(names, ages));
        System.out.println("Tallest: " + tallest(names, heights));

        sc.close();
    }
}