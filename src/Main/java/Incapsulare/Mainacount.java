package Main.java.Incapsulare;

public class Mainacount {
    public static void main(String[] args) {
    Account bobsAccount=new Account();
    System.out.println(bobsAccount.getNumber());
    System.out.println(bobsAccount.getBalance());
    bobsAccount.withdrawal(100.0);
    bobsAccount.deposit(50.0);
    bobsAccount.withdrawal(100.0);
    bobsAccount.deposit(51.0);
    bobsAccount.withdrawal(100.0);
}
}
