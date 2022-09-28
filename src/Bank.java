import java.math.BigDecimal;

public  abstract class Bank {
    public static String accountName = "Test";
    public static BigDecimal balance = BigDecimal.valueOf(1000);

    public abstract BigDecimal deposit(BigDecimal amount);
    public abstract void withdraw(BigDecimal amount);
    public abstract BigDecimal getBalance();
}
