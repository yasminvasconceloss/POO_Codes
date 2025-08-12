import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);  //adicionando entrada de dados

        System.out.print("Entre com sua nota NPA: ");
        double NPA = entrada.nextInt();

        if (NPA >= 60) {
            System.out.print("Matéria aprovada");

        } else if (NPA < 60 && NPA > 30){
            System.out.print("Voce está de NP3, digite sua nota: ");
            double NP3 = entrada.nextInt();
            double NFA = (NPA + NP3)/2;

            if (NFA >= 60) {
                System.out.print("Voce foi aprovado! ");

            } else {
                System.out.print("Voce foi reprovado! ");
            }
        }
        entrada.close();  //fechando o scanner (entrada)
    }
}