public class Principal {
    public static void main(String[] args) {

        Concesionaria c = new Concesionaria();
        Auto a = new Auto(true, "MarcaFalsa", "XYZ", "ABC123");

        Vehiculo v = a;

        // Auto a2 = v; No se puede (aún)
        c.agregarVehiculo(a);
        c.agregarVehiculo(new Moto(20, "OtraMarca", "XHT", "BCD234"));
    }
}
