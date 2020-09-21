package Vehiculo;

public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String color;

    public Vehiculo(){
        placa = "";
        marca = "";
        modelo = "";
        color = "";
    }
    public Vehiculo(String placa, String marca, String modelo, String color){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

}
