public class Bat extends BatMammals {

    /* the fly() method, print the sound 
    a bat taking off and decrease its energy by 50. 
     */
    public Bat fly()
    {
        System.out.println("the sound a bat taking off");
        this.energyLevel -=50;
        this.displayEnergy();
        return this;
    }
    /*the eatHumans() method, print 
    the so- well, never mind, just increase its energy by 25. 
     */
    public Bat eatHumans()
    {
        System.out.println("the sound a bat taking off");
        this.energyLevel +=25;
        this.displayEnergy();
        return this;
    }
    /* the attackTown() method, print the sound 
    of a town on fire and decrease its energy by
     */
    public Bat attackTown()
    {
        System.out.println("the sound a bat taking off");
        this.energyLevel +=100;
        this.displayEnergy();
        return this;
    }
    
}

