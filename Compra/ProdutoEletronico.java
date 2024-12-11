package Compra;

public class ProdutoEletronico extends Produto{
    private int garantia;

    public ProdutoEletronico(String nome, double preco, int garantia){
        super(nome, preco);
        this.garantia = garantia;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Garantia:" + garantia + " meses.");
    }
}
