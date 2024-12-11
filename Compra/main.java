package Compra;

public class main {
    public static void main(String[] args) {
        Produto produto = new Produto("Camiseta", 10.0);
        ProdutoEletronico tlm = new ProdutoEletronico("Smartphone", 2500, 12);
        ProdutoAlimentar leite = new ProdutoAlimentar("Leite Magro", 4.99, "23/01/2025");

        produto.exibirInformacoes();
        System.out.println("-------------------------");
        tlm.exibirInformacoes();
        System.out.println("-------------------------");
        leite.exibirInformacoes();
        System.out.println("-------------------------");
    }
}
