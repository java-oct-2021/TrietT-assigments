public class ActTest
{
    public static void main(String[] args) {
        BankAccount bankAct = new BankAccount();
        bankAct.deposit("saving", 100).deposit("checking",200);
        System.out.println("\n");
        bankAct.withdraw("saving", 500).withdraw("checking",500);
        System.out.println("\n");
        bankAct.getActBalance();
        BankAccount.getAct();
        BankAccount.getActValue();
    }
    
}
