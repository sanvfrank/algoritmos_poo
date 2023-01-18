/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

/**
 *
 * @author EQUIPO
 */
public class hija_depo extends padre {

@Override
            public void transacciones(){
                System.out.println("Cuanto desea depositar: ");
       deposito();
      transacciones=getsaldo();
      setsaldo(getsaldo()+deposito);
       System.out.println("Saldo depositado: "+deposito);
       System.out.println("Saldo actual: "+getsaldo());
            }
    
    
        
    }
    
       

   
