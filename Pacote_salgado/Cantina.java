package Pacote_salgado;
public class Cantina {
    String nome;
    Salgado[] salgados = new Salgado[3];

    void addSalgado(Salgado novoSalgado){
        

        for(int i=0; i<salgados.length;i++)
        {
            if(salgados[i] == null)
            {
                salgados[i]= novoSalgado;
                break;
            }
            
        
        }
            
     }
        
    void mostraInfo(){
            for (int i = 0; i < salgados.length; i++) {
                if(salgados[i] != null){
                     System.out.println("Nome do salgado: "+salgados[i].nome);
                }
               
            }
       
        }

        
    }


