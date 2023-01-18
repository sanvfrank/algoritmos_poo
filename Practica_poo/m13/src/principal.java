import java.util.ArrayList;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) throws Exception {
       
    
    Scanner leer=new Scanner (System.in);
    int i,op,autos;
    String menu="",marca,color;
    boolean band=false;
concesionario c=new concesionario();
    System.out.println("");
    menu+="MENU DE OPCIONES:\n"
    +"1) Registrar Autos\n"
    +"2) Registrar Autos Automaticamente\n"
    +"3) Registrar vendedores\n"
    +"4) Registrar vendedores automaticamente\n"
    +"5) Insertar venta y liquidar comision\n"
    +"6) Descuento por auto\n"
    +"7) Descuento para todos\n"
    +"8) Cantidad de autos disponibles\n"
    +"9) Cantidad de autos vendidos, total de las ventas y total de comisiones\n"
    +"10) Cantidad total de comisiones por vendedores\n"
    +"11) Total de ventas y comisiones\n"
    +"12) Salir\n";

    do{
    System.out.println(menu);
    System.out.println("Ingrese una opcion: ");
    op=leer.nextInt();
    System.out.println(" ");

    switch(op){
case 1:

System.out.println("Ingresa nombre del vendedor: ");
color=leer.next();
System.out.println("Ingresa marca del auto: ");
marca=leer.next();
auto a1=new auto(color, marca);




break;
    }
}while(op!=12);
   


}
}
