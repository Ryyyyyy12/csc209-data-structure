import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SavingAccount or CheckingAccount");
        String account = sc.nextLine().toLowerCase();
        if(account.equals("savingaccount")){
            SavingAccount s1 = new SavingAccount("lisa",100);
            s1.deposit(100);
            s1.deposit(200);
            s1.withdraw(500);
            s1.getAllTransaction();
            System.out.println(s1.getAccountNumber()+"  "+s1.getName()+"   "+s1.getBalance());
            SavingAccount s2= new SavingAccount("jisoo",30);
            s1.calculateFutureValue(10000,3,1,3);
        } else if(account.equals("checkingaccount")){
            CheckingAccount c1 = new CheckingAccount("jennie",200);

        }
        CheckingAccount c1 = new CheckingAccount("rose",5000);
        c1.withdraw(4000);
        c1.withdraw(3000);
        c1.getAllTransaction();
        System.out.println(c1.getAccountNumber()+"  "+c1.getName()+"   "+c1.getBalance());




    }
}
