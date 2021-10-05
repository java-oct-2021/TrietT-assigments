public class Bat extends BatMammals {

    /* the fly() method, print the sound 
    a bat taking off and decrease its energy by 50. 
     */
    public void fly()
    {
        System.out.println("the sound a bat taking off");
        this.energyLevel -=50;
        this.displayEnergy();
        //return this;
    }
    /*the eatHumans() method, print 
    the so- well, never mind, just increase its energy by 25. 
     */
    public void eatHumans()
    {
        System.out.println("the sound of eating two humans");
        this.energyLevel +=25;
        this.displayEnergy();
        //return this;
    }
    /* the attackTown() method, print the sound 
    of a town on fire and decrease its energy by
     */
    public void attackTown()
    {
        System.out.println("the sound attacking three towns");
        this.energyLevel +=100;
        this.displayEnergy();
        //return this;
    }
    
}

