package herancaEpolimorfismo;

public class Comprador {

    private String nome;
    private double saldo;


    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }


    public void efetuarCompra(Brownie brownie){
        brownie.addCarrinhoDeCompras();
        brownie.calculaValorTotalCompra();
        System.out.println("Comprador comprou o brownie "+ brownie.getNome());
    }

}
