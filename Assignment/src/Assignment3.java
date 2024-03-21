
class BankAccount{

    //private balance attribute
    private double balance;


    //Initialising Bank Account constructor
    public BankAccount(double initial)
    {
        if(initial>=0)
        {
            this.balance=initial;
        }
        else{
            System.out.println("Balance cannot be Negative");
        }
    }

    //Deposit Method
    public void Deposit( double amount)
    {
        if(amount>=0)
        {
            balance+=amount;
            System.out.println("Rs."+ amount + "deposited in your Bank Account");
        }
        else{
            System.out.println("Enter Valid Amount");
        }

    }


    //Withdraw Method
    public void Withdraw(double amount)
    {
        if(amount>=0 && balance >=amount)
        {
            balance-=amount;
            System.out.println("Rs." + amount + " withdrawn from your Account");
        }
        else{
            System.out.println("Enter Valid Amount");
        }
    }

    public double currentBalance()
    {
        return this.balance;
    }
}

public class Assignment3 {

    public static void main(String[] args)
    {
        //initialising bank account object
        BankAccount bankAccount = new BankAccount(10000);

        //calling Deposit Method
        bankAccount.Deposit(500);
        System.out.println("Current Balance: " + bankAccount.currentBalance());

        //calling Withdraw Method
        bankAccount.Withdraw(1000);
        System.out.println("Current Balance: " + bankAccount.currentBalance());

    }


}
