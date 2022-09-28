import java.math.BigDecimal;

public class Account extends Bank{
    @Override
    public BigDecimal deposit(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO)> 0){
            balance = balance.add(amount);
            return balance;
        }
        return balance;
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if(amount.compareTo(balance) > 0){
            System.out.println("Withdrawal amount exceeded account balance");
        }else {
            balance = balance.subtract(amount);
            System.out.println("Your new balance is "+ balance);
        }

    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }
}
