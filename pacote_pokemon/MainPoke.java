package pacote_pokemon;

public class MainPoke {
    public static void main(String[] args) {
        Treinador player = new Treinador("Ash Ketchum");

        Pokemon p1 = new Bulbasaur("Bulbasaur","planta",700);
        Pokemon p2 = new Squirtle("Squirtle","água", 200);
        Pokemon p3 = new Pikachu("Pikachu","elétrico", 450, 700);

        player.addPokemon(p1);
        player.addPokemon(p2);
        player.addPokemon(p3);
        

        p1.atacar();
        p2.atacar();
        p3.atacar();

      

        
       
       
       
    }
    
}
