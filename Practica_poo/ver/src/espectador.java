public class espectador {
private String nombre;
private int edad;
private double dinero;
String[] nombres={"juan","pedro","jose","andrea","camila","rafael","susana","jimena"};


public espectador() {
    nombre=nombres[metodoA.generaNumeroAleatorio(0, 7)];
setEdad(metodoA.generaNumeroAleatorio(10, 18));
setDinero(metodoA.generaNumeroAleatorio(2000, 20000));
}


public String getNombre() {
    return nombre;
}
public int getEdad() {
    return edad;
}
public double getDinero() {
    return dinero;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void setEdad(int edad) {
    this.edad = edad;
}
public void setDinero(double dinero) {
    this.dinero = dinero;
}


}
