import java.util.*;  
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

// Transaction class to store transaction details
class Transaction {
    private String type;
    private double amount;
    private LocalDateTime timestamp;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "[" + timestamp.format(formatter) + "] " + type + ": $" + String.format("%.2f", amount);
    }
}

// Account class for basic bank operations
class Account {
    private String accountHolder;
    private double balance;
    private List<Transaction> transactions;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        transactions.add(new Transaction("Initial Deposit", initialBalance));
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
        System.out.println("Deposited $" + amount + " successfully.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        transactions.add(new Transaction("Withdrawal", amount));
        System.out.println("Withdrew $" + amount + " successfully.");
    }

    public void showBalance() {
        System.out.println("Current balance: $" + String.format("%.2f", balance));
    }

    public void showTransactionHistory() {
        System.out.println("\nTransaction History for " + accountHolder + ":");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}

// Main class to simulate the banking system
public class BankSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();

        System.out.print("Enter initial deposit amount: ");
        double initialDeposit = scanner.nextDouble();

        Account account = new Account(name, initialDeposit);

        int choice;
        do {
            System.out.println("\n==== Bank Menu ====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transactions");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.showBalance();
                    break;
                case 4:
                    account.showTransactionHistory();
                    break;
                case 5:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
