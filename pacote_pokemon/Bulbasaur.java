package pacote_pokemon;

public class Bulbasaur extends Pokemon implements FazerBarulho, AtaqueEspecial{

    private float luminosidadeAmbiente;
    HeldItem helditem;


    
    public Bulbasaur(String nome, String tipo, float luminosidadeAmbiente) {
        super(nome, tipo);
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }
    public void mostraInfo(){
        super.mostraInfo();
    }
    public void atacar(){
        System.out.println("Bulbasaur está atacando. É super efetivo");
        
    }

    @Override
    public void fazerBarulho() {
       
        System.out.println("Bulbasaur está fazendo barulho");
    }
    @Override
    public void ataqueEspecial() {
        
        if(luminosidadeAmbiente > 650){
            System.out.println("Bulbasaur conseguiu ganhar do seu oponente");
        }
        else{
            System.out.println("Bulbasaur perdeu a batalha");
        }
        
    }
    public float getLuminosidadeAmbiente() {
        return luminosidadeAmbiente;
    }
    public void setLuminosidadeAmbiente(float luminosidadeAmbiente) {
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }
    
}
