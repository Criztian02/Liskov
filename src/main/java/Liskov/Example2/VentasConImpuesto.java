package Liskov.Example2;

public class VentasConImpuesto extends Impuestos {

    public VentasConImpuesto(int cantidad, int precio, int impuesto) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.impuesto = impuesto;
    }

    @Override
    public void generateSale() {
        System.out.println("genera la venta con impuestos");
    }

    @Override
    public void generateTaxes() {
        System.out.println("genera los impuestos");
    }
}
