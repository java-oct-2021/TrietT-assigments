/* 
Create a Pokemon class with:
name, health, and type member variables.
void attackPokemon(Pokemon pokemon): This method lowers the attacked Pokemon's health by 10
a count static variable that keeps the number of Pokemon created in the program.
getters and setters for each member variable.
a constructor class to set the instance's name, health, and type on creation */

public class Pokemon 
{
    protected String name;
    protected String type;
    protected int health;
    protected in count;
    public Pokemon(String name, String type, int health)
    {
        this.name = name;
        this.type = type;
        this.health = type;
    }

    public void attackPokemon(Pokemon pokemon)
    {
        this.health = 10;
    }
    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }
    public int getHealth()
    {
        return health;
    }
    public void setName(String namePoke)
    {
        name = namePoke;

    }
    public void setType(String typePoke)
    {
        type = typePoke;
        
    }
    public void setHealth(String healthPoke)
    {
        health = healthPoke;
    }
    
}
