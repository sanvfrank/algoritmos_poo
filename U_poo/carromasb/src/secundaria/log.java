/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secundaria;

/**
 *
 * @author EQUIPO
 */
public class log {
    private String marca;
    private String modelo;
    private float precio;

    public log(String marca,String modelo,float precio) {
        this.marca = marca;
        this.modelo=modelo;
        this.precio = precio;
        
    }

   

    public float getPrecio() {
        return precio;
    }
    
    public String mostrardatos(){
        return "marca: "+marca+"\nModelo: "+modelo+"\nPrecio: $"+precio+"\n";
        
    }
    }

