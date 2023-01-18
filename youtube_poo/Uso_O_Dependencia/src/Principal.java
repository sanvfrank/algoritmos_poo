public class Principal {
    public static void main(String[] args) {
        Documento doc1 = new Documento("Prueba", "Este es un\ntexto de prueba");
        Impresora imp = new Impresora();

        imp.encender();
        imp.imprimir(doc1);
    }
}
