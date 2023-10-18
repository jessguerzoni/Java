package pacote_pokemon;

public class Treinador {
    
    private String nome;
    private Pokemon[] pokemons;

    

    public Treinador(String nome) {
        this.nome=nome;
        this.pokemons= new Pokemon[10];
    }
    public void addPokemon(Pokemon p){

        for(int i=0; i<pokemons.length;i++){
            if(pokemons[i] != null) {
                pokemons[i] = p;
                System.out.println(nome+ " capturou "+pokemons[i]);
               
            }
        }
      
        
    }
    public void mostraInfo(){
       
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Pokemon[] getPokemons() {
        return pokemons;
    }
    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }
}
