import java.util.ArrayList;
import java.util.Random;

/* Blank class should have attributes 
(double) checking balance, (double) savings balance.
 */
public class BankAccount
{
    private double checkingBalance; //attribute: double checking blank
    private double savingBalance; //attribute: double saving blank
    private String accountNumber; //attribute: account number
    private static int numberOfAct;
    private static double totalMoney;
    public static ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
    //the class member (static) that has the number of accounts created thus far.
    private String randAccountNumber()
    {
        String accountNumber ="";
        Random rand = new Random();
        for(int i =0; i<10; i++)
        {
            accountNumber= accountNumber.concat(String.valueOf(rand.nextInt(10)));
        }
        return accountNumber;
    }
    public BankAccount()
    {
        this.accountNumber = this.randAccountNumber();
        this.checkingBalance=0;
        this.savingBalance=0;
        numberOfAct ++;
        

    }
    //a getter method for the user's checking account balance.
    public double getCheckingBalance()
    {
        System.out.println("Checking Balance: " + this.checkingBalance);
        return checkingBalance;
    }
    //a getter method for the user's saving account balance.
    public double getSavingBalance()
    {
        System.out.println("Saving Balance: " + this.savingBalance);
        return savingBalance;
    }
    public void setCheckingBalance(double checkingBalance)
    {
        this.checkingBalance = checkingBalance;
    }
    public void setSavingBalance(double savingBalance)
    {
        this.savingBalance = savingBalance;
    }
    //method that will allow a user to deposit money into either the 
    //checking or saving, be sure to add to total amount stored.
    public void deposit(double amount, String act_type )
    {
        if(act_type == "checking")
        {
            this.setCheckingBalance(this.getCheckingBalance() + amount);
            // System.out.println("Deposit amount: " + amount);
            // getCheckingBankAccount();
            
        }
        else if(act_type =="saving")
        {
            this.setSavingBalance(this.getSavingBalance() + amount);
            // System.out.println("Deposit amount: " + amount);
            // getSavingAccount();
        }
        else
        {
            System.out.println("Invalid Act type!");

        }
        
        totalMoney += amount;

    }
    //a method to withdraw money from one balance. 
    //Do not allow them to withdraw money if there are insufficient funds.
    public void withdraw(double amount, String act_type )
    {
        if(act_type == "checking")
        {
            if(this.getCheckingBalance() - amount<0)
            {
                System.out.println("insufficient funds! ");
            }
            else
            {
                this.setCheckingBalance(this.getCheckingBalance() -amount) ;
                totalMoney -= amount;

            }
            
        }
        else if(act_type =="saving")
        {
            if(this.getSavingBalance() -amount <0)
            {
               
                System.out.println("insufficient funds! ");
                
                //getSavingAccount();
            }
            else
            {
                this.setSavingBalance(this.getSavingBalance()-amount);
                totalMoney -= amount;
            }
        }
        else
        {
            System.out.println("Invalid act type");
        }
        
        
    }
    public static int getNumberOfAct()
    {
        return numberOfAct;
    }
    public void setNumberOfAct(int numberOfAct)
    {
        BankAccount.numberOfAct = numberOfAct;
    }
    public static double getActValue()
    {
        return totalMoney;
    }
    public static void setActValue(double totalMoney)
    {
        BankAccount.totalMoney = totalMoney;
    }




    
}
