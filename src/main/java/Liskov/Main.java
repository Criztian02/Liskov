package Liskov;

import Liskov.Example1.*;
import Liskov.Example2.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Padre padre = new Hija1();
        System.out.println(padre.getName());

        padre = new Hija2();
        System.out.println(padre.getName());


        Impuestos ventasAbstractas = new VentasConImpuesto(1,2,9);
        ventasAbstractas.generateSale();
        ventasAbstractas.generateTaxes();

        VentasAbstractas ventasAbstractas1 = new VentaSinImpuesto(1,2);
        ventasAbstractas1.generateSale();

        List lista = new ArrayList<>();
    }
}
