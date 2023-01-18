import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    
    public static final double COSTONINOS= 15000;
   
    private ArrayList <Huesped> lishuesped;


    
    public Hotel() {
        this.lishuesped =new ArrayList<>();
    }



    public void RegistrarHuesped (Huesped h){
            lishuesped.add(h);
    }

    

        public ticket totalAPagar(){

        ticket hue=null;
        
        String nomcom= nomb();
        String cel= cel();
        String pai= pais();
     hue=new ticket(nomcom, cel, pai,p());
    
         return hue;
}



public double p(){
    double t=0;
    for (Huesped hu : lishuesped) {
        t=hu.totalP1();
    }
    return t;
}




public int habi(){
    Scanner leer=new Scanner (System.in);
     int h=0;
  

System.out.println("Que tipo de habitacion desea?\n"
+"1) Individual: 10.000 $\n"
+"2) Doble: 30.000 $\n"
+"3) Familiar: 60.000 $\n"
+"4) Suit: 100.000 $");
h=leer.nextInt();




     return h;
     
 }






















public String nomb(){
    String n="";
    for (Huesped huesp : lishuesped) {
        n=huesp.nomcomp();
    }
return n;
}

public String cel(){
    String c="";
    for (Huesped huesp : lishuesped) {
        c=huesp.cel();
    }
return c;
}

public String pais(){
    String c="";
    for (Huesped huesp : lishuesped) {
        c=huesp.pai();
    }
return c;
}









@Override
public String toString() {
    return "Hotel [lishuesped=" + lishuesped + "]";
}



}


