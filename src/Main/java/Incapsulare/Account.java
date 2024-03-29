package Main.java.Incapsulare;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customeremailAdress;
    private String customerPhoneNumber;
    public Account(){
        this("56789",
                2.50,
                "Default name",
                "Default address",
                "Default phone");
        System.out.println("Empty constructor called");
    }
    public  Account(String number,double balance,
                    String customerName,String customerEmailAdress,String customerPhoneNumber){
        System.out.println("Account constructor"+"with parameters called");
        this.number=number;
        this.balance=balance;
        this.customerName=customerName;
        this.customeremailAdress=customerEmailAdress;
        this.customerPhoneNumber=customerPhoneNumber;
    }
    public void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("Deposit of" +depositAmount +"made.New balance is" +this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if(this.balance-withdrawalAmount<=0){
            System.out.println("Only" +this.balance +"available.withdrawal"+"not procesed");
        }else{
            this.balance-=withdrawalAmount;
            System.out.println("Withdrawal of"
                    +withdrawalAmount
                    +"processed,Remaining balance="+
                    this.balance);
        }
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomeremailAdress() {
        return customeremailAdress;
    }
    public void setCustomeremailAdress(String customeremailAdress) {
        this.customeremailAdress = customeremailAdress;
    }
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}