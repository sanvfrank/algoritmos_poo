import java.util.ArrayList;
import java.util.Scanner;

public class principal {
    public static void main (String[] args){
        int edad, tiempo;
        
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingresar numero de seguros a calcular: ");
        int N=leer.nextInt();
        ArrayList <conductor> co =new ArrayList<>();
        seguro s= new seguro();

        for(int i=0;i<N;i++){
            System.out.println("Ingresa la edad: ");
            edad=leer.nextInt();
            System.out.println("Ingresa experiencia del conductor: ");
            tiempo=leer.nextInt();
            automovil a= new automovil(modelo.A, color.claro);
            conductor c=new conductor(edad, tiempo, a);
            co.add(c);

        }
        System.out.println("El precio del seguro es: "+s.precioSeguro(co,a)); 


    }
}
