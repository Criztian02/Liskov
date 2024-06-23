package Liskov;

import Liskov.Example1.*;

public class Main {
    public static void main(String[] args) {
        Padre padre = new Hija1();
        System.out.println(padre.getName());

        padre = new Hija2();
        System.out.println(padre.getName());
    }
}
