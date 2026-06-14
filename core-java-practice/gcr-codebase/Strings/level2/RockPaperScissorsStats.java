import java.util.Scanner;

public class RockPaperScissorsStats {

    static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    static String findWinner(String user, String computer) {

        if (user.equalsIgnoreCase(computer))
            return "Draw";

        if ((user.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equalsIgnoreCase("Paper")))
            return "Player";

        return "Computer";
    }

    static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {

        String[][] stats = new String[2][3];

        double playerPercentage = (playerWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f%%", playerPercentage);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", computerPercentage);

        return stats;
    }

    static void displayResults(String[][] games, String[][] stats) {

        System.out.println("\nGame Results");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s%n",
                "Game", "Player Choice", "Computer Choice", "Winner");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < games.length; i++) {
            System.out.printf("%-10d %-15s %-15s %-15s%n",
                    i + 1, games[i][0], games[i][1], games[i][2]);
        }

        System.out.println("\nStatistics");
        System.out.println("----------------------------------------");
        System.out.printf("%-15s %-10s %-15s%n",
                "Player", "Wins", "Win %");
        System.out.println("----------------------------------------");

        for (String[] stat : stats) {
            System.out.printf("%-15s %-10s %-15s%n",
                    stat[0], stat[1], stat[2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();

        String[][] games = new String[totalGames][3];

        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < totalGames; i++) {

            System.out.println("\nGame " + (i + 1));
            System.out.print("Enter Rock, Paper, or Scissors: ");
            String userChoice = sc.next();

            String computerChoice = getComputerChoice();

            String winner = findWinner(userChoice, computerChoice);

            games[i][0] = userChoice;
            games[i][1] = computerChoice;
            games[i][2] = winner;

            if (winner.equals("Player"))
                playerWins++;
            else if (winner.equals("Computer"))
                computerWins++;
        }

        String[][] stats = calculateStats(playerWins, computerWins, totalGames);

        displayResults(games, stats);

        sc.close();
    }
}