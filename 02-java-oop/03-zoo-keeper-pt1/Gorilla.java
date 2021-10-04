/*
A separate class Gorilla that can throwSomething(), eatBananas(), and climb()
    ● For the throwSomething() method, have it print out a message indicating that the gorilla has thrown something, 
    as well as decrease the energy level by 
    ● For the eatBananas() method, have it print out a message indicating the gorilla's satisfaction and increase its energy by 10
    ● For the climb() method, have it print out a message indicating the gorilla has climbed a tree and decrease its energy by 10 
 */

public class Gorilla extends Mammal
{
    // the throwSomething() method
    public Gorilla throwSomething()
    {
        System.out.println("The gorilla has thrown something: " );
        this.energyLevel -=5;
        this.displayEnergy();
        return this;
    }
    // the eatBananas() method,
    public Gorilla eatBananas()
    {
        System.out.println("the gorilla's satisfaction:  ");
        this.energyLevel +=10;
        this.displayEnergy();
        return this;

    }
    //the climb() method
    public Gorilla climb()
    {
        System.out.println("the gorilla has climbed a tree: ");
        this.energyLevel -=10;
        this.displayEnergy();
        return this;
        
    }

    
}
