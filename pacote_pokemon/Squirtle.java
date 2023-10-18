package pacote_pokemon;

public class Squirtle extends Pokemon implements FazerBarulho{
    
    private float multiplicadorAgua;

    

    public Squirtle(String nome, String tipo, float multiplicadorAgua) {
        super(nome, tipo);
        this.multiplicadorAgua = multiplicadorAgua;
    }
    public void mostraInfo(){
        super.mostraInfo();
    }
    public void atacar(){
        System.out.println("Squirtle está atacando. É super efetivo!");
    }
    @Override
    public void fazerBarulho() {
        System.out.println("Pikachu está fazendo barulho");
    }
    
    public float getMultiplicadorAgua() {
        return multiplicadorAgua;
    }
    public void setMultiplicadorAgua(float multiplicadorAgua) {
        this.multiplicadorAgua = multiplicadorAgua;
    }
}
