public class ActTest
{
    public static void main(String[] args) {
        BankAccount bankAct = new BankAccount();
        bankAct.deposit( 100, "saving");
        bankAct.deposit(200,"checking");
        System.out.println("\n");
        bankAct.withdraw(500, "saving");
        bankAct.withdraw(500,"checking");
        System.out.println("\n");
        System.out.println("Total acts value: "+BankAccount.getActValue());
        System.out.println("Number of act: "+BankAccount.getNumberOfAct());
        // BankAccount.getAct();
        // BankAccount.getActValue();
    }
    
}
