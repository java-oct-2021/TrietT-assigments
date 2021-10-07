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
    protected int count;
    public Pokemon(String name, int health, String type)
    {
        this.name = name;
        this.type = type;
        this.health = health;
    }

    public void attackPokemon(Pokemon pokemon)
    {
        this.health = 10;
    }
    public String getName()
    {
        return this.name;
    }

    public String getType()
    {
        return this.type;
    }
    public int getHealth()
    {
        return this.health;
    }
    public void setName(String name)
    {
        this.name = name;

    }
    public void setType(String type)
    {
        this.type = type;
        
    }
    public void setHealth(int health)
    {
        this.health = health;
    }
    public void setCount(int amount) {
		count += amount;
	}
	
	public int getCount() {
		return count;
	}
    
}
