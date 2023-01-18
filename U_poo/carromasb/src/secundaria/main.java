/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secundaria;
import java.util.Scanner;
/**
 *
 * @author EQUIPO
 */
public class main {
    
    public static int indicembarato(log coches[]){
        float precio;
        int indice=0,i;
        precio=coches[0].getPrecio();
        for(i=1;i<coches.length;i++){
            if(coches[i].getPrecio()<precio){
                precio=coches[i].getPrecio();
                indice=i;
            }
        }
        return indice;
    }
    public static void main (String[] args){
        Scanner leer=new Scanner (System.in);
        String marca,modelo;
        float precio;
        int numerovehiculos,i,indicebarato;
       
        System.out.println("Numero de vehiculos: ");
        numerovehiculos=leer.nextInt();
        log coches[]=new log[numerovehiculos];
        for(i=0;i<numerovehiculos;i++){
             System.out.println("Ingresa marca del vehiculo: ");
        marca=leer.next();
        System.out.println("Ingresa modelo del vehiculo: ");
        modelo=leer.next();
        System.out.println("Ingresa precio del vehiculo: ");
        precio=leer.nextFloat();
         
        coches[i]=new log  (marca,modelo,precio);
        }
        indicebarato=indicembarato(coches);
        System.out.println("\nel coche mas barato es: ");
        System.out.println(coches[indicebarato].mostrardatos());
    }
}
 /*el arreglo de objetos de la linea 34 se crea con la finalidad de que al enviar
los datos de las variables a la clase secundaria por medio del ciclo en la linea 43,este mismo
tenga la capacidad de memoria para enviar la cantidad requerida de datos a la clase secundaria
por eso el arreglo de objetos y el objeto, tienen el mismo nombre "coches"
*/

/* en la linea 45 se le asigno el valor de retorno del metodo "indicembarato" (que es el que retorna el indice del carro mas barato
este se asigna con el parametro "coches" que es el objeto que contiene los datos) a la variable "indicebarato"
*/
/* en la linea 47 se introdujo el nombre del objeto "coches" y se le asigno de argumento el indice mas 
barato para pedir que muestre los datos de la posicion del coche en el cual se cumplio la condicion del metodo para 
conseguir el indice del coche mas barato, por ultimo para que muestre los datos correspondientes se invoca el metodo 
mostrar datos
*/