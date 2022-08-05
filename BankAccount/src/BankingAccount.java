public class BankingAccount {
    private static int accountNumber;
    private String name;
    private double balance;
    public BankingAccount(String name){
        this(name,0);
    }
    public BankingAccount(String name,double balance){
        this.balance=balance;
        this.name=name;
        accountNumber++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
