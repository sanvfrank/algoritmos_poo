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
public class hija_retiro extends padre{

    @Override
    public void transacciones() {
        System.out.print("Cuanto desea retirar? ");
        retiro();
        if(retiro<=getsaldo()){
            transacciones=getsaldo();
            setsaldo(transacciones-getsaldo());
                    
           
            System.out.print("Saldo retirado: "+retiro);
            System.out.print("Saldo actual: "+getsaldo());
        }
    }
    
}
