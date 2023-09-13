
package pacote_naruto;

import java.util.Scanner;
public class Aldeia {
    Ninja []ninjas = new Ninja[10];
    String nome;
    int qtMoradores;
    String regiao;

    void addNinja(Ninja ninja){

        Scanner ninjas=new Scanner(System.in);
        String n;

        for(int i=0; i<ninjas.length;i++)
        {
            if(ninjas[i] == null)
            {
                n=ninjas.nextLine();
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
