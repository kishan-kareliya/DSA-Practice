package OOPSConcepts.Interface;

interface BankAccount{
    void getBalance();
    void depositAmount(double amount);
    void withdrawAmount(double amount);
    void calculateInterest();
}

class SavingAccount implements BankAccount{
    private double balance;
    final private double INTEREST_RATE = 6.2;
    final private double MIN_BALANCE = 1000;

    public SavingAccount(){
        this.balance = 1000;
    }

    public SavingAccount(double balance){
        this.balance = balance;
    }

    public void getBalance(){
        System.out.println("Balance: "+ balance);
    }
    public void depositAmount(double amount){
        if(amount<0){
            System.out.println("amount can't be negative");
            return ;
        }
        balance += amount;
        System.out.println(amount+ " deposited successfully");
        getBalance();
    }
    public void withdrawAmount(double amount){
        double checkRemainingBalance = balance - amount;

        if(checkRemainingBalance<MIN_BALANCE){
            System.out.println("Transaction Failed! "+ MIN_BALANCE +" Min. Balance is Required so you can withdraw upto: "+(balance-MIN_BALANCE));
            return;
        }

        balance -= amount;
        System.out.println(amount + " withdraw successfully");
        getBalance();
    }
    public void calculateInterest(){
        double interestAmount = (balance*INTEREST_RATE)/100;
        System.out.println("INTEREST AMOUNT: " + interestAmount);
        balance += interestAmount;
        getBalance();
    }
}

class CurrentAccount implements BankAccount{
    private double balance;
    final private double MIN_BALANCE = -5000;

    public CurrentAccount(){
        this.balance = 0;
    }

    public CurrentAccount(double balance){
        this.balance = balance;
    }

    public void getBalance(){
        System.out.println("Balance: "+ balance);
    }

    public void depositAmount(double amount){
        if(amount<0){
            System.out.println("amount can't be negative");
            return ;
        }
        balance += amount;
        System.out.println(amount+ " deposited successfully");
        getBalance();
    }

    public void withdrawAmount(double amount){
        double checkRemainingBalance = balance - amount;

        //remainingBalance can upto -5000
        //so this is overdraft feature
        if(checkRemainingBalance < MIN_BALANCE){
            System.out.println("Transaction Failed! "+ MIN_BALANCE +" Min. Balance is Required so you can withdraw upto: "+(balance-MIN_BALANCE));
            return;
        }

        balance -= amount;
        System.out.println(amount + " withdraw successfully");
        getBalance();
    }
    public void calculateInterest() {
        System.out.println("No interest for Current Accounts.");
    }
}

public class Interface3 {
    public static void main(String args[]){
        SavingAccount kishan = new SavingAccount();
        kishan.depositAmount(1000);
        kishan.withdrawAmount(500);
        kishan.calculateInterest();

        CurrentAccount rahul = new CurrentAccount();
        rahul.depositAmount(5000);
        rahul.withdrawAmount(1000);
    }
}
