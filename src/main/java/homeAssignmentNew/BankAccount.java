package homeAssignmentNew;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String accountHolder;

    public BankAccount(String accountNumber, double balance, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;

    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        System.out.println("Balance " + this.balance);
        return this.balance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public void depositMoney(double money){
        System.out.println("Money deposited successfully");
        this.balance += money;
    }
    public void withdrawMoney (double money){
        if(this.balance >= money){
            System.out.println(money + " your withdraw successfully completed");
            this.balance -= money;
        }else{
            System.out.println("Your transfer failed");
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("987654321", 5000, " John Doe");
        bankAccount.depositMoney(400);
        bankAccount.getBalance();
        bankAccount.withdrawMoney(200);
        bankAccount.getBalance();
    }
}
