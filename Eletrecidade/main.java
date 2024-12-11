package Eletrecidade;

public class main {
    public static void main(String[] args) {
        Residencial residencial = new Residencial("Pedro", 1000);
        Industrial industrial = new Industrial("EZW", 5000);

        System.out.println("Custo de um recidencia: " + residencial.calcularCusto() + " euros.");
        System.out.println("Custo de uma empressa: " + industrial.calcularCusto() + " euros.");
    }
}
