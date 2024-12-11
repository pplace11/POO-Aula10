package Compra;

public class ProdutoAlimentar extends Produto{
    private String validade;

    public ProdutoAlimentar(String nome, double preco, String validade){
        super(nome, preco);
        this.validade = validade;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Validade: " + validade);
    }
}
