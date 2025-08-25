package Arrays.Ex_0_Salgados;

public class Cantina {

    String nome;
    Salgado[] salgados = new Salgado[5];

    void addSalgados(Salgado novoSalgado){
        for(int i = 0; i < salgados.length; i++){//Varrendo o array de salgados
            if(salgados[i] == null){//Verificando se não existe salgado
                salgados[i] = novoSalgado;
                break; //Adicionando e saindo do metodo
            }
        }
    }

    void mostraInfo(){
        System.out.println("A Cantina: " + this.nome + " possui os seguintes salgados:");
        for (Salgado salgado : salgados) {
            if(salgado != null)//Verificando se existe algum salgado antes de imprimir
                System.out.println(salgado.nome);
        }
    }
}