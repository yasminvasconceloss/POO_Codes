package Arrays.Ex_1_CampoMinado;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean[] [] matrizCampo = new boolean[2][2]; // criando matriz do campo minado

        Random rand = new Random(); //numero aleatorio
        Scanner entrada = new Scanner(System.in); // ler do teclado a posicao digitada

        int Y = rand.nextInt(2); //posicao y
        int X = rand.nextInt(2); //posicao x

        System.out.println("Mostrando X: " + X);
        System.out.println("Mostrando Y: " + Y);

        matrizCampo[X][Y] = true;

        int jogadorY, jogadorX;

        System.out.println("Inicio do jogo! ");

        for (int i = 0; i < matrizCampo.length*2; i++) {
            System.out.println("Digite a posicao X: ");
            jogadorX = entrada.nextInt();
            System.out.println("Digite a posicao Y: ");
            jogadorY = entrada.nextInt();

            if (matrizCampo[jogadorX][jogadorY]) {
                System.out.println("Bomba!");
            } else {
                System.out.println("Continue!");
            }
        }
    }
}
