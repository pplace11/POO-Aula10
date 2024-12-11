package Empresa;

public class main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Pedro");
        Vendedor vendedor = new Vendedor("Sara", 20);

        System.out.println("Salario da Gerente: " + gerente.calcularSalario());
        System.out.println("Salario do Vendedor: " + vendedor.calcularSalario());
    }
}
