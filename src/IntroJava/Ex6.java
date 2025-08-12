import java.util.Random;
import java.util.Scanner;

public class Ex6{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        int numGerado, numAdivinhado;

        numGerado = rand.nextInt(10) + 1;  //gerando numeros aleatorios entre 1 e 10

        do {
            System.out.print("Tente adivinhar o numero que gerei: ");
            numAdivinhado = entrada.nextInt();
            if(numAdivinhado < numGerado)
                System.out.println("O meu numero e maior!");
            else if(numAdivinhado > numGerado)
                System.out.println("O meu numero e menor!");

        } while (numGerado != numAdivinhado);

        System.out.println("Parabens. Voce acertou meu numero!");

        //Para fechar o Scanner, após seu uso
        entrada.close();

    }
}