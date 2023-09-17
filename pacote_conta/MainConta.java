package pacote_conta;
import java.util.Scanner;
public class MainConta {

    
	public static void main(String[] args) {
		
		Scanner banco=new Scanner(System.in);
		Scanner continuar=new Scanner(System.in);
		Scanner opcao=new Scanner(System.in);
		Scanner din=new Scanner(System.in);
		String SN;
		int op;

		Conta c2 = new Conta();

		System.out.println("----------------");
		System.out.println(" BANCO DO BRASIL");
		System.out.println("----------------");
		
		System.out.print("Bem-vindo! Por favor, digite seu nome: ");
		c2.nomeDoDono = banco.nextLine();

		do{

			System.out.print("Digite o número da operação desejada[1- Saque; 2- Depósito; 3- Ver Saldo]: ");
			op=opcao.nextInt();

			if(op==1){

				System.out.print("Digite o valor do saque: ");
				c2.sacar(din.nextFloat());

			}
			else if(op==2){

				System.out.print("Digite o valor do depósito: R$ ");
				c2.deposita(din.nextFloat());

			}
			else if(op==3){

				System.out.println("Seu saldo é de: R$"+c2.saldo);
			

			}
			
			System.out.print("Deseja realizar outra operação[S- SIM ; N- NAO]? ");
			SN=continuar.nextLine();
		}while(SN.equals("S"));

		System.out.println("Volte sempre!");
	
		din.close();
		banco.close();
		continuar.close();
		opcao.close();
	
	}
}