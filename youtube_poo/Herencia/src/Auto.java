public class Auto extends Vehiculo {
    boolean tieneAire;

    void prenderAire() {
        if (tieneAire) {
            System.out.println("Encendiendo aire...");
        }
    }
}
