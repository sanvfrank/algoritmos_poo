import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner leer=new Scanner (System.in);
        double gramos,s;
        int  pudines;
        String menu="";
        String op;
       
        taller_pasteleria t=new taller_pasteleria();

        Clientes c1=new Clientes("Frank");
        Clientes c2=new Clientes("Frank");
        Clientes c3=new Clientes("Frank");
        Clientes c4=new Clientes("Frank");

        t.atenderCliente(c1);
        t.atenderCliente(c2);
        t.atenderCliente(c3);
        t.atenderCliente(c4);

        t.CantpastelesPorCliente();
    }

}
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
     