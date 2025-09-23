package herancaEpolimorfismo;

public class BrownieCafe extends Brownie {
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome,preco,sabor);
    }

    public void addCafe() {
        System.out.println(super.nome +" adicionando café");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de café adicionado");
    }
}
