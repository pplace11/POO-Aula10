package Eletrecidade;

public class Residencial extends Consumidor{
    public Residencial(String nome, double kWh){
        super(nome, kWh);
    }

    @Override
    public double calcularCusto(){
        return kWh * 0.15;
    }
}
