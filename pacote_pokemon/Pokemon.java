package pacote_pokemon;

public abstract class Pokemon {

    static int qtdPokemon=0;
    private String nome;
    private String tipo;
    HeldItem helditem;

    
    public Pokemon(String nome, String tipo) {
        this.nome=nome;
        this.tipo=tipo;
        qtdPokemon++;
        

    }
    public void mostraInfo(){

    }
    public abstract void atacar();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
