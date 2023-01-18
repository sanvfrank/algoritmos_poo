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
    public static void main (String[] args){
        Scanner leer=new Scanner (System.in);
        float lado1,lado2;
        area_peri c1;
        System.out.println("Ingresar lado 1");
        lado1=leer.nextFloat();
        System.out.println("Ingresar lado 2");
        lado2=leer.nextFloat();
        if(lado1==lado2){
            c1=new area_peri(lado1);
        }else{
            c1=new area_peri(lado1,lado2);
        }
        float perimetro = c1.getperimetro();
        float area=c1.getarea();
        c1.mostrar(perimetro, area);
    }
}
