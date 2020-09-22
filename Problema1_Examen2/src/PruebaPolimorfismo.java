import Vehiculo.*;

public class PruebaPolimorfismo {

    public static void sumar(){
        int suma = 5 + 6;
    }
    public static void multiplcar(){
        int m = 5 * 6;
        System.out.print(m);
        System.out.println("hola mundo")
    }

    public static void main(String[] args) {
        sumar();
        multiplcar();
        System.out.println("");

        Combustible auto1c = new Combustible("", "", "", "");
        Combustible auto2c = new Combustible("", "", "", "");

        Electrico auto3e = new Electrico("","", "", "");
        Electrico auto4e = new Electrico("", "", "", "");

        auto1c.setCilindra(10.30,14);
        auto2c.setCilindra(10.10,17);

        auto3e.setPrecioCarga(12.50);
        auto4e.setPrecioCarga(15.90);

        Vehiculo flotilla[] = {auto1c, auto2c, auto3e, auto4e};

        for(int i =0; i<flotilla.length; i++){
            int contador = i + 1;
            if(flotilla[i] instanceof Combustible) {
                System.out.print("Impuesto de auto combustible " + contador + ": Q.");
                System.out.print(((Combustible) flotilla[i]).calculoImpuesto(2) + "\n");
            }else if(flotilla[i] instanceof Electrico){
                System.out.print("Impuesto de auto electrico " + contador + ": Q.");
                System.out.print(((Electrico) flotilla[i]).calculoImpuesto(3) + "\n");
            }
        }
    }
}
