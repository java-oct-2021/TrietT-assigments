import java.util.ArrayList;

/* Blank class should have attributes 
(double) checking balance, (double) savings balance.
 */
public class BankAccount
{
    private double checkingBalance; //attribute: double checking blank
    private double savingBalance; //attribute: double saving blank
    public static ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
    //the class member (static) that has the number of accounts created thus far.
    public BankAccount()
    {
        this.checkingBalance=0;
        this.savingBalance=0;

    }
    //a getter method for the user's checking account balance.
    public BankAccount getCheckingBankAccount()
    {
        System.out.println("Checking Balance: " + this.checkingBalance);
        return this;
    }
    //a getter method for the user's saving account balance.
    public BankAccount getSavingAccount()
    {
        System.out.println("Saving Balance: " + this.savingBalance);
        return this;
    }
    //method that will allow a user to deposit money into either the 
    //checking or saving, be sure to add to total amount stored.
    public BankAccount deposit(String act_type, double amount)
    {
        if(act_type == "checking")
        {
            this.checkingBalance =+ amount;
            System.out.println("Deposit amount: " + amount);
            getCheckingBankAccount();
            
        }
       if(act_type =="saving")
        {
            this.savingBalance =+ amount;
            System.out.println("Deposit amount: " + amount);
            getSavingAccount();
        }
        return this;

    }
    //a method to withdraw money from one balance. 
    //Do not allow them to withdraw money if there are insufficient funds.
    public BankAccount withdraw(String act_type, double amount)
    {
        if(act_type == "checking")
        {
            if(amount>this.checkingBalance)
            {
                this.checkingBalance =- amount;
                System.out.println("insufficient funds! ");
                amount=0;
                //getCheckingBankAccount();

            }
            else
            {
                this.checkingBalance -= amount;

            }
            System.out.println("Amount withdraw: "+ amount);
            getCheckingBankAccount();
        }
        else if(act_type =="saving")
        {
            if(amount>this.savingBalance)
            {
                this.savingBalance =- amount;
                System.out.println("insufficient funds! ");
                amount=0;
                //getSavingAccount();
            }
            else {
                this.savingBalance -= amount;
            }
            System.out.println("Amount Withdrawn: " + amount);
            getSavingAccount();
            
        }
        return this;
    }
    public BankAccount getActBalance()
    {
        getCheckingBankAccount();
        getSavingAccount();
        System.out.println("Total Balance: " + "\n Checking Balance: "+ this.checkingBalance+ "\n Checking Balance: " +this.savingBalance);
        return this;
    }
    public static int getAct()
    {
        int c = bankAccounts.size();
        System.out.println("Number of account: " + c);
        return c;
    }
    public static double getActValue()
    {
        double  total = 0;
        for(BankAccount bankAccount:bankAccounts)
        {
            total +=bankAccount.checkingBalance;
            total +=bankAccount.savingBalance;

        }
        System.out.println("Total value: " + total);
        return total;
    }




    
}
