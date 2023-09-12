package pacote_comp;

public class Computador {
    String marca;
    float preco;
    Cliente cliente;
    SistemaOperacional SO; 
    HardwareBasico[] hardware;
   
    
    Computador(int opcao) {

        this.hardware = new HardwareBasico[3];

        switch(opcao){
            case 1:
            this.marca = "Positivo";
            this.preco = 1300.00f;
            this.SO = new SistemaOperacional("Linux Ubuntu", 32);
            hardware[0] = new HardwareBasico("Intel Core i3", 1200);
            hardware[1] = new HardwareBasico("Memória RAM", 4);
            hardware[2] = new HardwareBasico("HD", 0.5f);

        
        case 2:
            this.marca = "Acer";
            this.preco = 1800.00f;
            this.SO = new OS("Windows 8", 64);
            hardware[0] = new HardwareBasico("Intel Core i5", 2260);
            hardware[1] = new HardwareBasico("Memória RAM", 8);
            hardware[2] = new HardwareBasico("HD", 1);
        
        case 3:
            this.marca = "Vaio";
            this.preco = 2800.00f;
            this.SO = new SistemaOperacional("Windows 10", 64);
            hardware[0] = new HardwareBasico("Intel Core i7", 3500);
            hardware[1] = new HardwareBasico("Memória RAM", 16);
            hardware[2] = new HardwareBasico("HD", 2);

        }


    void mostraPCConfig(){

        System.out.println("Marca: " + marca);
        System.out.println("Hardware: ");
        System.out.println("Preço: " + preco);
        System.out.println("Sistema Operacional: " + SO.nome + " " + SO.tipo + " bits");
       
        for (int i = 0; i < hardware.length; i++) {
            if(hardware[i] != 0){
                System.out.println(hardware[i].nome + " " + hardware[i].capacidade);
            }
        }
        

    }

    void addMemoriaUSB(MemoriaUSB musb){


    }

}
}
