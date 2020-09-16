package Vehiculo;

public class Combustible extends Vehiculo implements Impuesto{
    private int litrosGasolina;
    private double cilindra;

    public Combustible(String placa, String marca, String modelo, String color){
        super(placa, marca, modelo, color);
    }
    public void setCilindra(int precioCilindra, int radio){
        //la cilindra dependerá del diametro y el radio, y será definida con su precio
        int carrera = radio * 2;
        double cilindra = 3.1416 * (((radio*2)^2)/4)*carrera;
        this.cilindra = cilindra * precioCilindra;
    }

    public double getCilindra() {
        return cilindra;
    }

    public double calculoImpuesto(int litros){
        return getCilindra() * 3;
    }



}
