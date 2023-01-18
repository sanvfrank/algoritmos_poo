/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;
import java.util.Scanner;
/**
 *
 * @author EQUIPO
 */
public class padre {
    protected int v1,v2,re;
    Scanner leer=new Scanner (System.in);
    public void op(){
         System.out.println("ingresa numero 1");
         v1=leer.nextInt();
         System.out.println("ingresa numero 2");
         v2=leer.nextInt();
    }
    public void mostrar(){
         System.out.println("resultado: "+re);
    }
   
}
