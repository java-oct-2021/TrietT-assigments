/*BatTest class to instantiate a bat and have it attack three towns, 
eat two humans, and fly twice. 
 */
public class BatTest 
{
    public static void main(String[] args) 
    {
        Bat batTaking = new Bat();
        batTaking.attackTown();
        batTaking.attackTown();
        batTaking.attackTown();
        batTaking.eatHumans();
        batTaking.eatHumans();
        batTaking.fly();
        batTaking.fly();
    }
    
}

