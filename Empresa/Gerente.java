package Empresa;

public class Gerente extends Funcionario{
    public Gerente(String nome){
        super(nome);
    }

    @Override
    public double calcularSalario(){
        return salario() * 1.2;
    }
}
