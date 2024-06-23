package Liskov.Example2;

public class VentaSinImpuesto extends VentasAbstractas{

    public VentaSinImpuesto(int cantidad, int precio) {
        this.cantidad=cantidad;
        this.precio=precio;
    }

    @Override
    public void generateSale() {
        System.out.println("genera la venta sin impuesto");
    }
}
