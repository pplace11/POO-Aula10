package Eletrecidade;

public abstract class Consumidor{
    protected String nome;
    protected double kWh;

    public Consumidor(String nome, double kWh){
        this.nome = nome;
        this.kWh = kWh;
    }

    public abstract double calcularCusto();
}
