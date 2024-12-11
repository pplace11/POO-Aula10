package Compra;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }
}
