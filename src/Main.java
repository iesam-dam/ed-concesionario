import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Proceso de alta
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setMatricula("01234X");
        vehiculo1.setMarca("Seat");
        vehiculo1.setModelo("127");
        vehiculo1.setColor("Blanco");
        vehiculo1.setMotor("2.0");
        vehiculo1.setNumCv("105");
        vehiculo1.setTipoCombustible("Diesel");

        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.setMatricula("21312");
        vehiculo2.setMarca("Se123123at");
        vehiculo2.setModelo("123123");
        vehiculo2.setColor("123");
        vehiculo2.setMotor("122.0");
        vehiculo2.setNumCv("123");
        vehiculo2.setTipoCombustible("Gasolina");

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);

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
        venta.setVehiculo(vehiculos);

        Vehiculo veh1 = venta.getVehiculo().get(0);
        Vehiculo veh2 = venta.getVehiculo().get(1);

        System.out.println("Venta realizada:" + venta);
    }
}