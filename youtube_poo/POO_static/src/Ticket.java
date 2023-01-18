public class Ticket {
    private static int contador = 0;
    private int numero;
    private String fechaCompra;
    private String DNIPersona;

    public Ticket(String fechaCompra, String DNIPersona) {
        contador++; // contador = contador + 1
        this.numero = contador;
        this.fechaCompra = fechaCompra;
        this.DNIPersona = DNIPersona;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero
                + ", fechaCompra=" + fechaCompra
                + ", DNIPersona=" + DNIPersona + '}';
    }
}
