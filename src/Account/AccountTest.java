package Account;

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account(1000.0);

        System.out.println("Account balance before debit: Rs." + account1.getBalance());

        account1.debit(500.0);
        System.out.println("Account balance after debit: Rs" + account1.getBalance());

        account1.debit(700.0);
        System.out.println("Account balance after excessive debit: Rs." + account1.getBalance());

        account1.debit(-200.0);

        System.out.println("Final account balance: Rs." + account1.getBalance());
    }
}
