package pacote_comp;

public class Cliente {
   String nome;
   long cpf;
   float total;
   

   public Cliente(String nome, long cpf) {
      this.nome=nome;
      this.cpf=cpf;
   }


   float calculaTotalCompra(){
      return total;
    
   }
}
