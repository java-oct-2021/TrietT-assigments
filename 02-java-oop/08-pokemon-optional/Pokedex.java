/* Create a Pokedex class that extends the abstract class above and implements listPokemon(). 
Your Pokedex class needs an attribute called myPokemons where your store all the pokemons created.
 */
import java.util.*;
public class Pokedex extends AbstractPokemon {
    private ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();
  
    @Override
    public Pokemon createPokemon(String name, int health, String type) 
    {
        Pokemon pokemon =super.createPokemon(name, health, type);
        this.myPokemons.add(pokemon);
        return pokemon;
    }
    @Override
    public void listPokemon() {
        for (int i = 0; i <myPokemons.size() ; i++) {
            System.out.println(myPokemons.get(i).getName());
        }
    }

    
}
