package Arrays.Ex_0_Salgados;

public class Main {
    public static void main(String[] args) {

        Cantina cantina = new Cantina();
        cantina.nome = "Cantina Inatel";

        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        salgado1.nome = "Pão de queijo";
        salgado2.nome = "Pizza";
        salgado3.nome = "Coxinha";

        cantina.addSalgados(salgado1);
        cantina.addSalgados(salgado2);
        cantina.addSalgados(salgado3);

        cantina.mostraInfo();
    }
}
