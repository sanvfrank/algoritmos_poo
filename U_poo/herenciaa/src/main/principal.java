/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import operaciones.resta;
import operaciones.suma;
/**
 *
 * @author EQUIPO
 */
public class principal {
    public static void main (String[] args ){
        suma mensajerosuma=new suma();
        mensajerosuma.op();
        mensajerosuma.sumar();
        System.out.println("el resultado de la suma es: ");
        mensajerosuma.mostrar();
        
        resta mensajeroresta=new resta();
        mensajeroresta.op();
        mensajeroresta.restar();
        System.out.println("el resultado de la resta es: ");
        mensajeroresta.mostrar();
        
    }
}
 