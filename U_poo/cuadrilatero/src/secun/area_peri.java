/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secun;

/**
 *
 * @author EQUIPO
 */
public class area_peri {
   private float lado1,lado2;
  

    public area_peri(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
   
   public area_peri(float lado1){
       this.lado1=this.lado2=lado1;
   }
   
   public float getperimetro(){
        float perimetro=2*(lado1+lado2);
        return (perimetro);
   }
   public float getarea(){
       float area=(lado1*lado2);
       return(area);
   }
   public void mostrar(float perimetro,float area){
     
       System.out.println("perimetro: "+perimetro);
       System.out.println("area : "+area);
   }
   
}
