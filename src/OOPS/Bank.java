public class Bank
 {

    static class BankAccount {
        double balance = 1000;

        void deposit(double amount) {
            balance += amount;
        }

        void display() {
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.deposit(500);
        acc.display();
    }
}