public class Human 
{
    //Attributes / File
    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;

    public int getStrength()
    {
        return strength;
    }
    public void setStrength(int strengthNum)
    {
        strength = strengthNum;
    }

    public int getStealth()
    {
        return stealth;
    }
    public void setStealth(int stealthNum)
    {
        stealth = stealthNum;
    }

    public int getIntelligence()
    {
        return intelligence;
    }
    public void setIntelligence(int intelligenceNum)
    {
        intelligence = intelligenceNum;
    }

    public int getHealth()
    {
        return health;
    }
    public void setHealth(int healthNum)
    {
        health = healthNum;
    }

    public Human()
    {
        this.stealth=3;
        this.strength=3;
        this.intelligence=3;
        this.health=100;
    }
    public void attack(Human human)
    {
        human.health -=this.strength;
        System.out.println("Human attack human: " + this.strength + "\nHuman health: " + human.health);
    }

}
