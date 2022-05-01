public class Frigorifico {
    private String nombre;
    private Producto producto;
    private Proveedor proveedor;
    private Cliente cliente;

    public Frigorifico(String nombre, Producto producto, Proveedor proveedor, Cliente cliente) {
        this.nombre = nombre;
        this.producto = producto;
        this.proveedor = proveedor;
        this.cliente = cliente;
    }

    public Frigorifico(String nombre, Proveedor proveedor, Cliente cliente) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.cliente = cliente;
    }

    //metodo para calcular el precio de venta
    public double precioVenta(int precioCosto){
        double pVenta = ((precioCosto*1.15)+(precioCosto*0.50));
        return pVenta;
    }

    public void facturaCliente(Cliente cliente){
        System.out.println(cliente);

    }


}
