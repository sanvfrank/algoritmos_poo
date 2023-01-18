/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;
import java.util.Scanner;
/**
 *
 * @author EQUIPO
 */

   
public abstract class padre {
    
    protected double retiro,deposito,transacciones,rt,dep;
    private static double saldo;
        Scanner leer=new Scanner(System.in);
       public String menu="";
       public int op;
       
       public void operaciones(){
           menu+="  Menu de opciones\n"
            +"1)Consulta de saldo\n"
            +"2)Retiro de efectivo\n"
            +"3)Deposito de efectivo\n"
            +"4)Salir";
           do{
               System.out.println(menu);
               op=leer.nextInt();
               switch(op){
                   case 1:
                          hija_consulta h=new hija_consulta();
                          mensajero1.transacciones();
                          
                   break;
                       case 2:
                        padre mensajero2=new hija_retiro();
                          mensajero2.transacciones();
                          break;
                        case 3:
                           padre mensajero3=new hija_depo();
                          mensajero3.transacciones();
                         break;
                       
                         case 4:
                           System.out.println("Vuelva pronto");
                         break;
                       
                       
               }
               
           }while(op!=4);
       }
       public abstract void transacciones();
           
       
       
    public void retiro(){
        retiro=leer.nextDouble();
    }
    public void deposito(){
        deposito=leer.nextDouble();
    }
   public double getsaldo(){
       return(saldo);
   }
   public void setsaldo(double saldo){
       this.saldo=saldo;
   }
    
        
    
}

