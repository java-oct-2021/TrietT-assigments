public class Test {
    public static void main(String[] args) {
        Pokedex dex = new Pokedex();
        Pokemon p1 = dex.createPokemon("Ho-OH ", 100, "type1 ");
        Pokemon p2= dex.createPokemon("Vulpix ", 100, "type2 ");
        //dex.pokemonInfo();
        // System.out.println(p1.getName()+": "+String.valueOf(p1.getHealth()));
        // System.out.println(p2.getName()+": "+String.valueOf(p2.getHealth()));
        p1.attackPokemon(p2);
        System.out.println("After attack: \n" + p1.getName()+ ": " +String.valueOf(p1.getHealth())
        +"\n" + p2.getName()+": "+String.valueOf(p2.getHealth()));
        //System.out.println(p1.getName()+" "+String.valueOf(p1.getHealth()));
        //System.out.println(p2.getName()+" "+String.valueOf(p2.getHealth()));
        System.out.println("Pokemon name: ");
        dex.listPokemon();
    }
    
}
