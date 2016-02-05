
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account duyAccount = new Account("Duy's account", 100.00);
        System.out.println("Initial state");
        System.out.println(duyAccount);
        duyAccount.deposit(20.0);
        System.out.println("Final state");
        System.out.println(duyAccount);


    }

}
