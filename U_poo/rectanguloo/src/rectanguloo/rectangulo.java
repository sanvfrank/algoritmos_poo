/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectanguloo;

/**
 *
 * @author EQUIPO
 */
public class rectangulo {
   private int altura,base,area;
    
    public rectangulo(int base,int altura){
        this.base=base;
        this.altura=altura;
        
    }
    
        public void area(){
            area=base*altura;
        }
        public void imprimir(){
            area();
            System.out.println("el area del rectangulo es: "+area);
        }
    
    
}
