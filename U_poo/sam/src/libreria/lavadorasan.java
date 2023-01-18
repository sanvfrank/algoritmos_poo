/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 *
 * @author EQUIPO
 */
public class lavadorasan {
    private int kilos=0,llenadocompleto=0,tipoderopa=0,lavadocompleto=0,secadocompleto=0;
public lavadorasan(int kilos,int tipoderopa){
    this.kilos=kilos;
    this.tipoderopa=tipoderopa;
}
private void llenado(){ //metodo para llenado de la ropa
    if(kilos<=12){
        llenadocompleto=1;
        System.out.println("llenando...");
        System.out.println("llenado completo.");
    }
    else{
        System.out.println("la carga de ropa es muy pesada");
        
    }
}
private void lavado(){ //metodo de lavado para la ropa
    llenado();
    if(llenadocompleto==1){
        if(tipoderopa==1){
            System.out.println("ropa blanca/lavado suave");
            System.out.println("lavando...");
            lavadocompleto=1;
        }
        else if(tipoderopa==2){
            System.out.println("ropa de color /lavado intenso");
            System.out.println("lavando...");
        }
        else{
            System.out.println("el tipo de ropa no esta disponible");
            System.out.println("se lavara como ropa de color/lavado intenso");
            lavadocompleto=1;
        }
    }
}
private void secado(){ //metodo de secado de la ropa
    lavado();
    if(lavadocompleto==1){
        System.out.println("secando...");
        secadocompleto=1;
    }
}
public void ciclofinalizado(){ //metodo para mostrar finalizacion
    secado();
    if(secadocompleto==1){
        System.out.println("tu ropa esta lista");
    }
}
public int gettipoderopa(){
    return tipoderopa;
}
public void settipoderopa(int tipoderopa){
    this.tipoderopa=tipoderopa;
}
}
