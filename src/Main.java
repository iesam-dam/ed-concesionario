public class Main {
    public static void main(String[] args) {
        // Proceso de alta
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMatricula("01234X");
        vehiculo.setMarca("Seat");
        vehiculo.setModelo("127");
        vehiculo.setColor("Blanco");
        vehiculo.setMotor("2.0");
        vehiculo.setNumCv("105");
        vehiculo.setTipoCombustible("Diesel");

        // Proceso de alta de Cliente
        Cliente cliente = new Cliente();
        cliente.setDni("0123456");
        cliente.setNombre("Cliente1");
        cliente.setApellidos("Apellidos1 Appellidos2");
        cliente.setDireccion("Dirección Cliente1");

        // Creamos una venta
        Venta venta = new Venta();
        venta.setCodVenta("001");
        venta.setFechaVenta("16/11/2023");
        venta.setPrecioVenta("5.000€");
        venta.setFormaPago("Contado");
        venta.setCliente(cliente);
        venta.setVehiculo(vehiculo);

        System.out.println("Venta realizada:" + venta);
    }
}