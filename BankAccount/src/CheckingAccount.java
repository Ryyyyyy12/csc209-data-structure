import java.util.ArrayList;

public class CheckingAccount extends BankingAccount{
    private ArrayList<Transaction> transactions = new ArrayList<>();
    public  CheckingAccount(String name){
        super(name);
    }
    public CheckingAccount(String name,double balance){
        super(name,balance);
    }

    public void deposit(double amount){
        setBalance(getBalance()+amount);
        if(transactions.size() <= 100){
            Transaction t2 = new Transaction();
            t2.setAmount("+"+amount);
            transactions.add(t2);
        }else {
            System.out.println("Your transaction is full. Please change");
        }

    }
    public void withdraw(double amount){
        setBalance(getBalance()-amount);
        if(transactions.size() <= 100){
            Transaction t2 = new Transaction();
            t2.setAmount("-"+amount);
            transactions.add(t2);
        }else {
            System.out.println("Your transaction is full. Please change");
        }
    }
    public void getAllTransaction(){
        for(int i=0;i<transactions.size();i++){
            System.out.println((i+1)+"   "+transactions.get(i).getDate()+"     "+transactions.get(i).getAmount());
        }
    }

}
