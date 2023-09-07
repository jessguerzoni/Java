
package pacote_naruto;


public class Aldeia {
    Ninja []ninjas = new Ninja[10];
    String nome;
    int qtMoradores;
    String regiao;

    void addNinja(Ninja ninja){

        for(int i=0; i<ninjas.length;i++)
        {
            if(ninjas[i] == null)
            {
                ninjas[i]= ninja;
                break;
            }
            
        
        }
    }
    void mostraInfo(){
        for (int i = 0; i < ninjas.length; i++) {
            if(ninjas[i] != null){
                 System.out.println("Nome do ninja: "+ninjas[i].nome);
            }
           
        }

    }
    void rankingS(){

    }
    void qtTitulos(){

    }
}
