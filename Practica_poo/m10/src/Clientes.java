import java.util.ArrayList;
import java.util.Scanner;

public class Clientes {
    String nombre;
    Scanner leer=new Scanner (System.in);
    ArrayList<Pastel> listpasteles;

    public Clientes(String nombre) {
        this.nombre=nombre;
        this.listpasteles = new ArrayList<>();
    }

    public int pedidos(){
        int p;
        System.out.println("Ingresar cantidad de pasteles a comprar: ");
        p=leer.nextInt();
        return p;
    }

    public String getNombre() {
        return nombre;
    }
    
   

}
