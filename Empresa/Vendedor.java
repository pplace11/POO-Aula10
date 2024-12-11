package Empresa;

public class Vendedor extends Funcionario{
    private double valorVendas;

    public Vendedor(String nome, double valorVendas){
        super(nome);
        this.valorVendas = valorVendas;
    }

    @Override
    public double calcularSalario(){
        double bonus = valorVendas * 0.05;
        return salario() + bonus;
    }
}
