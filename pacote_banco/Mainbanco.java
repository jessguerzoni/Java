package pacote_banco;

public class Mainbanco {
    public static void main(String[] args) {
        
        Cliente [] cliente=new Cliente[3];
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();

        cliente1.setNome("Evilyn");
        cliente1.setCpf(282327329);

        cliente2.setNome("Chris");
        cliente2.setCpf(23339992);

        cliente3.setNome("Rita");
        cliente3.setCpf(27777777);

        cliente[0] = cliente1;
        cliente[1]=cliente2;
        cliente[2]=cliente3;

        Conta conta = new Conta();
        conta.setCliente(cliente);
        conta.setLimite(500);
        conta.setNumero(45);

        
        System.out.println("Nome 1: "+conta.getCliente()[0].getNome());
        System.out.println("Nome 2: "+conta.getCliente()[1].getNome());
        System.out.println("Nome 3: "+conta.getCliente()[2].getNome());
        



    

        

        


    }
}
