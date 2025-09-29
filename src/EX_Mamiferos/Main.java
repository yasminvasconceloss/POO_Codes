package EX_Mamiferos;

public class Main {

    public static void main(String[] args) {

        Mamifero cachorro = new Cachorro("Theo", 50);
        Mamifero boi = new Boi("Ben", 20);
        Mamifero lontra = new Lontra("Juliana", 100);

        cachorro.emitirSom();
        boi.emitirSom();
        lontra.emitirSom();

        cachorro.mostraInfo();
        boi.mostraInfo();
        lontra.mostraInfo();

    }
}
