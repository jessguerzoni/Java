package pacote_conta;

public class Conta {
	
	//Membros da classe
	int numero;
	String nomeDoDono;
	float saldo=0;
	float limite;
	
	//Metodo para depositar
	void deposita(float quantia) {

		saldo += quantia;
		System.out.println("Depósito realizado com sucesso");
	}
	
	//Metodo para sacar
	void sacar(float quantia) {

		
		if(this.saldo>quantia){
            this.saldo-=quantia;
            System.out.println("Saque realizado com sucesso");

        }
        else{
            System.out.println("Saldo insuficiente!");
        }

		
	}

	
}
