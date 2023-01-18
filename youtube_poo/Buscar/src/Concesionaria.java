import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Concesionaria {
    private String nombre;
    private ArrayList<Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(Auto a) {
        this.autos.add(a);
    }

    public int cantAutos() {
        return autos.size();
    }

    // Método atado a que la colección sea una lista
    public Auto buscarAuto(String patente) {
        Auto autoEncontrado = null;
        int i = 0;
        while (i < cantAutos() && !this.autos.get(i).getPatente().equalsIgnoreCase(patente)) {
            i++;
        }
        if (i < cantAutos()) {
            autoEncontrado = this.autos.get(i);
        }
        return autoEncontrado;
    }

    // Método válido para cualquier colección iterable
    public Auto buscarAutoConIterador(String patente) {
        Auto autoEncontrado = null;
        Iterator<Auto> it = this.autos.iterator();
        while (it.hasNext() && autoEncontrado == null) {
            Auto a = it.next();
            if (a.getPatente().equalsIgnoreCase(patente)) {
                autoEncontrado = a;
            }
        }
        return autoEncontrado;
    }
}
