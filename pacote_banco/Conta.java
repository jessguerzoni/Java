package pacote_banco;

public class Conta {
    
    private int numero;
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }
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
    private float limite;

    private Cliente [] cliente = new Cliente[5];

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

    }

}
