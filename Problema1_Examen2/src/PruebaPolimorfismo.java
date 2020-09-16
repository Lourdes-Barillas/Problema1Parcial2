import Vehiculo.*;

public class PruebaPolimorfismo {

    public static void main(String[] args) {
        Vehiculo flotilla[] = new Vehiculo[4];
        Combustible auto1c = new Combustible("", "", "", "");
        Combustible auto2c = new Combustible("", "", "", "");

        Electrico auto3e = new Electrico("","", "", "");
        Electrico auto4e = new Electrico("", "", "", "");

        auto1c.setCilindra(10,14);
    }
}
