package pacote_comp;

import java.util.Scanner;
public class MainPC {
    public static void main(String[] args) {
        
       Scanner entrada=new Scanner(System.in);
       Scanner entrada2=new Scanner(System.in);
        String nomeCliente;
        long cpf;
        int saida;
        int opcao;
       
        System.out.println("Nome do cliente:");
        nomeCliente=entrada.nextLine();
        System.out.println("CPF do cliente: ");
        cpf=entrada2.nextLong();



        Cliente cliente = new Cliente(nomeCliente,cpf);

        
        Computador comp1 = new Computador(1);
        comp1.mostraPCConfig();

        Computador comp2= new Computador(2);
        comp2.mostraPCConfig();

       
        Computador comp3 = new Computador(3);
        comp3.mostraPCConfig();

        Scanner sair=new Scanner(System.in);
        System.out.println("Para sair, digite 0");
        saida=sair.nextInt();
    
        
        }
        
    }

    

