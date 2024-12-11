package Eletrecidade;

public class Industrial extends Consumidor{
    public Industrial(String nome, double kWh){
        super(nome, kWh);
    }

    @Override
    public double calcularCusto(){
        return  kWh * 0.10 + 50;
    }
}
