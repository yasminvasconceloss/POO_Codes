import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o numero de alunos: ");
        int numAlunos = entrada.nextInt();

        switch(numAlunos){
            case 10:
            case 20:
                System.out.println("Sala 16");
                break;

            case 30:
                System.out.println("Sala 22");
                break;

            default:
                System.out.println("Numero de alunos invalido");
        }

        entrada.close();
    }
}