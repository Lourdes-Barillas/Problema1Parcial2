package Vehiculo;

public class Combustible extends Vehiculo implements Impuesto{
    private int litrosGasolina;
    private double cilindra;

    public void setCilindra(int precioCilindra, int diametro, int radio){
        //la cilindra dependerá del diametro y el radio, y será definida con su precio
        int carrera = radio * 2;
        double cilindra = 3.1416 * ((diametro^2)/4)*carrera;
        this.cilindra = cilindra * precioCilindra;
    }

    public double getCilindra() {
        return cilindra;
    }

    public double calculoImpuesto(int litros){
        return getCilindra() * 3;
    }



}
