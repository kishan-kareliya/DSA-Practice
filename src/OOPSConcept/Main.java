package OOPSConcept;

class BankAccount{
    String accountHolderName;
    int balance;

    BankAccount(String accountHolderName, int balance){
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(int amount){
        balance+=amount;
    }

    void withdraw(int amount){
        if((balance-amount)<0){
            System.out.println("Account balance doesn't have " + amount+" as balance");
        }
        else{
            balance -= amount;
        }
    }

    void displayBalance(){
        System.out.println("Balance: "+balance);
    }
}

class SavingAccount extends BankAccount{

    SavingAccount(String accountHolderName, int balance){
        super(accountHolderName,balance);
    }

    @Override
    void withdraw(int amount){
        if((balance-amount)<1000){
            System.out.println("please maintain 1000 at least amount");
        }
        else{
            super.balance -= amount;
        }
    }
}

class CurrentAccount extends BankAccount{

    CurrentAccount(String accountHolderName, int balance){
        super(accountHolderName,balance);
    }

    @Override
    void withdraw(int amount){
        if((balance-amount)<-5000){
            System.out.println("remaining balance can't be more than -5000");
        }
        else{
            super.balance -= amount;
        }
    }
}

class Main{
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount("kishan",5000);
        s.displayBalance();
        s.withdraw(4000);
        s.displayBalance();

        CurrentAccount c = new CurrentAccount("kajal",6000);
        c.displayBalance();
        c.withdraw(12000);
        c.displayBalance();
    }
}