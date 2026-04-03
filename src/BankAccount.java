import javax.naming.InsufficientResourcesException;
import java.util.Scanner;
public class InsufficientFundsException extends Exception {
    private double shortfall;

    public InsufficientFundsException(double shortfall) {
        super("Insufficient funds. You are short by $" + String.format("%.2f", shortfall));
        this.shortfall = shortfall;
    }

    public double getShortfall() {
        return shortfall;
    }
}

public class BankAccount{
    private double balance;
    public BankAccount(double InitialBalance){
        this.balance = InitialBalance;

    }
    public void withdraw(double amount)throws InsufficientFundsException{
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance");
        }
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}

