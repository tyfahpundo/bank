import java.math.BigDecimal;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.withdraw(BigDecimal.valueOf(2000));
    }
}