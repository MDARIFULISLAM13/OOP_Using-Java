import bank.*;

public class package_s {
    public static void main(String[] args) {

        bank.Bank account1 = new bank.Bank();
        account1.id = "100";

        System.out.println(account1.id);
        bank.account account_name = new bank.account();
        account_name.name = "Arif";
        System.out.println(account_name.name);
    }
}