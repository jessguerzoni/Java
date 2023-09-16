package pacote_banco;

public class Conta {
    

    
    
    public Cliente[] getCliente() {
        return cliente;
    }
    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }
    private float saldo;

    public float getSaldo() {
        return saldo;
    }
   

    private Cliente [] cliente;

    

    public Conta() {

       setCliente(new Cliente[3]);
        
    }
    void sacar (float quantia){
        if(this.saldo>quantia){
            this.saldo-=quantia;
            System.out.println("Saque realizado");

        }
        else{
            System.out.println("Saldo insuficiente! Você é pobre!");
        }

    }
    void deposita(float quantia){
        this.saldo+=quantia;
        System.out.println("Quantia depositada com sucesso");
    }


}