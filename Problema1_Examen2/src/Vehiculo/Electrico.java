package Vehiculo;

public class Electrico extends Vehiculo implements Impuesto {
    private double precioCarga;

    public Electrico(int precioCarga){
        this.precioCarga = precioCarga;
    }

    public double calculoImpuesto(int carga){
        return (this.precioCarga * carga)*0.09;
    }
}
