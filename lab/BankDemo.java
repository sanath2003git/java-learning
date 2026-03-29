import java.util.Scanner;

// Step 1: Create Custom Exception
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

// Step 2: Bank Account Class
class BankAccount {
    double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        }
    }
}

// Step 3: Main Class
class BankDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
        } 
        catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}