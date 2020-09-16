package Vehiculo;

public class Electrico extends Vehiculo implements Impuesto {
    private double precioCarga;

    public void setPrecioCarga(int precioCarga){
        this.precioCarga = precioCarga;
    }
    public Electrico(String placa, String marca, String modelo, String color){
        super(placa, marca, modelo, color);
    }

    public double calculoImpuesto(int carga){
        return (this.precioCarga * carga)*0.09;
    }
}
