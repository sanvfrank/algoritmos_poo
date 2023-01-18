/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavadoraone;
import libreria.lavadorasan;
import java.util.Scanner;
/**
 *
 * @author EQUIPO
 */
public class lavamain {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int kilos,tiposderopa;
        System.out.println("la ropa es blanca o de color?");
        System.out.println("ropa blanca -1- | ropa de color -2-");
        tiposderopa=leer.nextInt();
         System.out.println("cuantos kilos de ropa?");
        kilos=leer.nextInt();
        
        lavadorasan mensajero=new lavadorasan(kilos,tiposderopa);
        mensajero.settipoderopa(2);
        System.out.println("el tipo de ropa es: " +mensajero.gettipoderopa());
        
        mensajero.ciclofinalizado();
    }
}
