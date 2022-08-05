import java.util.ArrayList;

public class SavingAccount extends BankingAccount{
    private double interestRate;
    private double futureValue;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public SavingAccount (String name){
        super(name);
    }
    public SavingAccount(String name,double balance){
        super(name,balance);
    }
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        if (transactions.size() <= 100) {
            Transaction t1 = new Transaction();
            t1.setAmount("+" + amount);
            transactions.add(t1);
        } else {
            System.out.println("Your transaction is full. Please change");
        }
    }
    public void withdraw(double amount){
        if((getBalance()-amount)>0){
            setBalance(getBalance()-amount);
            if(transactions.size() <= 100){
                Transaction t1 = new Transaction();
                t1.setAmount("-"+amount);
                transactions.add(t1);
            }else {
                System.out.println("Your transaction is full. Please change");
            }
        } else {
            System.out.println("Can not withdraw");
        }
    }
    public void getAllTransaction(){
        for(int i=0;i<transactions.size();i++){
            System.out.println((i+1)+"   "+transactions.get(i).getDate()+"     "+transactions.get(i).getAmount());
        }
    }
    public void calculateFutureValue(double depositMoney,double interestRate,double numOfReceiveIPerYr,double timePeriodYr){
        this.interestRate=interestRate;
        if(numOfReceiveIPerYr == 1){
            this.futureValue=depositMoney*Math.pow((1+(interestRate/100)),timePeriodYr);
            System.out.printf("After calculate the interest rate in %.1f years : %.2f ",timePeriodYr,this.futureValue);
        } else if(numOfReceiveIPerYr==12){
            this.futureValue=depositMoney*Math.pow((1+(interestRate/100)),timePeriodYr*12);
            System.out.printf("After calculate the interest rate in %.1f years : %.2f",timePeriodYr,this.futureValue);
        } else if(numOfReceiveIPerYr == 2){
            this.futureValue=depositMoney*Math.pow((1+(interestRate/100)),timePeriodYr*2);
            System.out.printf("After calculate the interest rate in %.1f years : %.2f",timePeriodYr,this.futureValue);
        }
    }
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
