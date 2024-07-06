package Liskov.Example1;

public class Hija1 extends Padre {
    @Override
    public String getName() {
        return "yo soy Hija1";
    }

    @Override
    public String getPresentation() {
        return "Hola a todos bienvenidos :)";
    }
}
