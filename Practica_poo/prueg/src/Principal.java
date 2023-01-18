import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        Scanner leer=new Scanner (System.in);
    int i=0,s=0,ha=0,a=0,y=0,q=0,numeroDeninos,habitacion,alimentacion,personasAHospedar,hu=0;
    String t,nombre,dni,fecha,celular,pais,ninos,tour;
    int [] que = new int [1000];

    Hotel h= new Hotel();

do{
  System.out.println("Nombre: ");
    nombre=leer.next();
    System.out.println("Dni: ");
    dni=leer.next();
    System.out.println("Numero telefonico: ");
    celular=leer.next();
    System.out.println("pais: ");
    pais=leer.next();
    System.out.println("Fecha: ");
    fecha=leer.next();
    System.out.println("Personas a hospedar: ");
    personasAHospedar=leer.nextInt();
    System.out.println("Que tipo de habitacion desea?\n"
+"1) Individual: 10.000 $\n"
+"2) Doble: 30.000 $\n"
+"3) Familiar: 60.000 $\n"
+"4) Suit: 100.000 $");
    hu=leer.nextInt();
    System.out.println("Alimentacion\n1)Todo incluido\n2)Corporativa\n");
    alimentacion=leer.nextInt();
    System.out.println("¿Desea ir a un tour?: ");
    tour=leer.next();
    System.out.println("¿Hay ninos?: ");
    ninos=leer.next();
  
      Huesped h1= new Huesped(nombre, dni, fecha, celular, pais, personasAHospedar,ninos,hu,tour,alimentacion); 
      h.RegistrarHuesped(h1);
 

     
    
ticket ticketGenerado= h.totalAPagar();
System.out.println(ticketGenerado);

    System.out.println("HOTEL\n1)Seguir abierto\n2)Cerrar\n");
    i=leer.nextInt();
}while(i!=2);
    




}
}