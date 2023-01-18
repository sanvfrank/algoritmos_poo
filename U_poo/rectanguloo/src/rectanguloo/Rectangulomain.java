/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectanguloo;
import java.util.Scanner;
/**
 *
 * @author EQUIPO
 */
public class Rectangulomain {
    public static void main (String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("ingresa la altura");
        int altura=leer.nextInt();
        System.out.println("ingresa la base");
        int base=leer.nextInt();
        
        rectangulo mensajero=new rectangulo(altura, base);
       
        mensajero.imprimir();
    }
}
