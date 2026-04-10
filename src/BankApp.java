public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        double[] withdrawals = {200, 400, 100};

        for (double amount : withdrawals) {
            try {
                account.withdraw(amount);
                System.out.println("Withdrew: $" + amount);
                System.out.println("Remaining balance: $" + account.getBalance());
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}