package herancaEpolimorfismo;

public class BrownieNutella extends Brownie{

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void addNutella() {

        System.out.println(super.nome +" adicionando nutella");
    }

    @Override     //sobrescrever o metodo - polimorfismo
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de nutella adicionado");
    }


}
