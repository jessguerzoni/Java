package Pacote_salgado;

public class MainSalg {
    public static void main(String[] args) {
        

        Cantina cantina = new Cantina();
        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        cantina.nome = "Cantina da Neide";
        salgado1.nome = "Coxinha";
        salgado2.nome = "Esfiha";
        salgado3.nome = "Quibe";

        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);

        cantina.mostraInfo();

       
        

        
    }
}
