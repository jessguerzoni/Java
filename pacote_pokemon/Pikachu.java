package pacote_pokemon;

public class Pikachu extends Pokemon implements FazerBarulho, AtaqueEspecial{
    
    private float soltarRaios;
    HeldItem helditem;
    private float paralisiaEletrica;

   

    public Pikachu(String nome, String tipo, float soltarRaios, float paralisiaEletrica) {
        super(nome, tipo);
        this.soltarRaios = soltarRaios;
        this.paralisiaEletrica = paralisiaEletrica;
    }
    public float getSoltarRaios() {
        return soltarRaios;
    }
    public void setSoltarRaios(float soltarRaios) {
        this.soltarRaios = soltarRaios;
    }
    public float getParalisiaEletrica() {
        return paralisiaEletrica;
    }
    public void setParalisiaEletrica(float paralisiaEletrica) {
        this.paralisiaEletrica = paralisiaEletrica;
    }
    public void mostraInfo(){
        super.mostraInfo();
    }
    public void atacar(){
        System.out.println("Pikachu está atacando. É super efetivo!");
    }
    @Override
    public void fazerBarulho() {
        System.out.println("Pikachu está fazendo barulho");
    }
    @Override
    public void ataqueEspecial() {
        if(soltarRaios>750){
            System.out.println("Pikachu conseguiu ganhar de seu oponente");
        }
        else{
            System.out.println("Pikachu perdeu a batalha");
        }
        
    }
}
