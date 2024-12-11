package Empresa;

public abstract class Funcionario {
    private String nome;
    public static final double salarioBase = 800.0;

    public Funcionario(String nome){
        this.nome = nome;
    }

    public abstract double calcularSalario();

    public String getNome(){
        return nome;
    }

    public double salario(){
        return salarioBase;
    }
}
