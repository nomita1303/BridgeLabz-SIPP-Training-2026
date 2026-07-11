public class BankAccountDemo {

    public static void main(String[] args) {

        // Creating 3 Accounts
        BankAccount acc1 = new BankAccount("A101", "Rahul", 10000);
        BankAccount acc2 = new BankAccount("A102", "Priya", 15000);
        BankAccount acc3 = new BankAccount("A103", "Aman", 20000);

        // ===== Account 1 : 5 Transactions =====
        System.out.println("\nTransactions for Rahul");
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.deposit(500);
        acc1.withdraw(3000);
        acc1.withdraw(1000);
        acc1.getStatement();

        // ===== Account 2 : 5 Transactions =====
        System.out.println("\nTransactions for Priya");
        acc2.deposit(3000);
        acc2.withdraw(5000);
        acc2.deposit(1000);
        acc2.withdraw(2000);
        acc2.deposit(700);
        acc2.getStatement();

        // ===== Account 3 : 5 Transactions =====
        System.out.println("\nTransactions for Aman");
        acc3.withdraw(4000);
        acc3.deposit(1500);
        acc3.withdraw(10000);
        acc3.deposit(500);
        acc3.withdraw(1000);
        acc3.getStatement();

        // Total Accounts Created
        System.out.println("\nTotal Accounts Created : " + BankAccount.totalAccounts);
    }
}