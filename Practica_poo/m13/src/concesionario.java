import java.util.ArrayList;
import java.util.Scanner;

public class concesionario {
    Scanner leer=new Scanner (System.in);
   private ArrayList <vendedor> lisvendedores;
   private ArrayList <auto> lisautos;

public concesionario() {
    this.lisvendedores=new ArrayList<>();
    this.lisautos=new ArrayList<>();
}

public void agregarvendedores(vendedor v){
    lisvendedores.add(v);
}
public void agregarautos(auto au){
    lisautos.add(au);
}
   
public void case1(){
    System.out.println("Ingresa numero de autos a añadir: ");
int autos=leer.nextInt();
    for(int i=0;i<autos;i++){
        this.lisautos.add();
        }
        
}
}
