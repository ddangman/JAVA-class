
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account A = new Account("A", 100);
        System.out.println(A);
        Account B = new Account("B", 0);
        System.out.println(B);
        Account C = new Account("C", 0);
        System.out.println(C);
        transfer(A, B, 50);
        transfer(B, C, 25);
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
        System.out.println(from);
        System.out.println(to);
    }

}
