/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secun;
import java.util.Scanner;
/**
 *
 * @author EQUIPO
 */
public class main {
    public static int tmayor(atletismo ob[]){
        int i,indice = 0;
        float mayor = 0;
       
        
        for(i=0;i<ob.length;i++){
            if(ob[i].getTcarrera()<mayor)
                mayor=ob[i].getTcarrera();
            indice=i;
        }
        
        return(indice);
    }
    
    
    public static void main (String[] args){
        Scanner leer=new Scanner(System.in);
    int Natleta,Catleta,i,inmayor;
    String nombre;
    float Tcarrera;
    
    System.out.println("Ingresa cantidad de atletas");
    Catleta=leer.nextInt();
    atletismo ob[]=new atletismo[Catleta];
    for(i=0;i<Catleta;i++){
        System.out.println("Ingresa nombre del atleta");
        nombre=leer.next();
        System.out.println("Ingresa numero del atleta");
        Natleta=leer.nextInt();
        System.out.println("Ingresa su tiempo en carrera");
        Tcarrera=leer.nextFloat();
        ob[i]=new atletismo( Natleta, nombre, Tcarrera);
    }
    
    inmayor=tmayor(ob);
    System.out.println("el atleta mas rapido fue: ");
    System.out.println(ob[inmayor].mostrar());
    }
}
