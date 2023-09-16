package pacote_banco;

import java.util.Scanner;
public class Mainbanco {
    public static void main(String[] args) {

        Scanner bruxo=new Scanner(System.in);
        Scanner bruxo2=new Scanner(System.in);
        Scanner bruxo3=new Scanner(System.in);
   
        
        Cliente [] cliente=new Cliente[3];
        Cliente witch1 = new Cliente();
        Cliente witch2 = new Cliente();
        Cliente witch3 = new Cliente();

        Conta conta = new Conta();
        conta.setCliente(cliente);
    

        System.out.println("------------------");
        System.out.println("BANCO DE GRINGOTES");
        System.out.println("------------------");

      
        System.out.println("Digite o nome do primeiro bruxo: ");
        witch1.setNome(bruxo.nextLine());
       

       
        System.out.println("Valor do depósito: ");
        conta.deposita(bruxo.nextFloat());

        System.out.println("Digite o nome do segundo bruxo: ");
        witch2.setNome(bruxo2.nextLine());
        System.out.println("Valor do depósito: ");
        conta.deposita(bruxo2.nextFloat());
        

        System.out.println("Digite o nome do terceiro bruxo: ");
        witch3.setNome(bruxo3.nextLine());
        System.out.println("Valor do depósito: ");
        conta.deposita(bruxo3.nextFloat());


        

        System.out.println("Saldo final da conta conjunta: "+conta.getSaldo());
   

        bruxo.close();
        bruxo2.close();
        bruxo3.close();

        


    }
}
