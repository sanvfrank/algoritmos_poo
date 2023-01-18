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
public class atletismo {
    int Natleta;
    String nombre;
   private float Tcarrera;
   
   
   public atletismo(int Natleta,String nombre,float Tcarrera){
       this.Natleta=Natleta;
       this.Tcarrera=Tcarrera;
       this.nombre=nombre;
   }
   public float getTcarrera(){
       return(Tcarrera);
   }
   public String mostrar(){
       return("nombre del atleta: "+nombre+"\nNumero de atleta: "+Natleta+"\nTiempo de carrera: "+Tcarrera);
   }
   
   
}
