public class BatMammals {
    /*
    a Mammal class that has an energyLevel and displayEnergy() method. 
    The displayEnergy() method should show the animals energy level as well as return it. 
     */
    
    protected int energyLevel;
    public BatMammals()
    {
        this.energyLevel = 300;
    }
    public int displayEnergy()
    {
        System.out.println("Energy Level: " + this.energyLevel);
        return this.energyLevel;
    }
        
}
    
    

