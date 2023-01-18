import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int  edn,th,ph,costo,op=0,op2=0, i=0, np,adu,u=0;
        String menu1="",menu2="",menu3="",nombre,cel,fh,dni,ni,pais,tour="";
        double costo1,costo2=30000,costo3,costo4,costoA1=0,costoA2=0,total=0,cosmitad=15000,tn=0,tt=0,des,tu,to=0,ta;

       menu1+="Que tipo de habitacion desea?\n"
       +"1) Familiar: 100.000 $\n"
       +"2) Suit: 200.000 $";

       menu2+="¿Que tipo de alimentacion desea?\n"
       +"1) Todo incluido: 50.000 $\n"
       +"2) Corporativa: 20.000 $";

       menu3+="TOURS\n"
       +"1) Cabalgata\n"
       +"2) Teleferico por nuestro bosque lluvioso\n"
       +"3) Visita a las Cataratas de la Plata\n";
      
       


        do{
            u++;
            System.out.println("Nombre: ");
            nombre=leer.next();
            System.out.println("Dni: ");
            dni=leer.next();
            System.out.println("Numero telefonico: ");
            cel=leer.next();
            System.out.println("Pais: ");
            pais=leer.next();
            System.out.println("Fecha de hospedaje: ");
            fh=leer.next();
            System.out.println("Personas a hospedar: ");
            ph=leer.nextInt();
if(pais.equals("colombia")){
    des=0.15;
}
            if(ph>1 && ph<8){

            System.out.println("Habitacion doble");
           
            System.out.println("¿Incluye niños?");
            ni=leer.next().toLowerCase();

                if(ni.equals("si")){

         System.out.println("¿Cuantos niños son?");
         edn=leer.nextInt();
         adu=ph-edn;
          
                if(edn<ph){

             int []n= new int [edn];

             for(int o=0;o<edn;o++){

        System.out.println("Edad niño "+(o+1)+" :");
               n[o]=leer.nextInt();

               if(n[o]>=6 && n[o]<=12){

    
    tn=cosmitad*edn;
    tt=costo2*adu;
    total=tt+tn;

               }else if(n[o]<6){
                total=tt;
                }
            }
        }else{
                System.out.println("Error");
            }
           

            }

            System.out.println(menu2);
            op2=leer.nextInt();
            switch(op2){
                case 1: 
                costoA1=50000;
    
                break;
                case 2: 
                costoA2=20000;
                break;
            }
            
            System.out.println("¿Desea asistir a un tour?");
            tour=leer.next().toLowerCase();
            if(tour.equals("si")){
               System.out.println(menu3);
               op2=leer.nextInt();
               switch(op2){
                case 1: 
                System.out.println("Has elegido cabalgata\n");
    
                break;
                case 2: 
                System.out.println("Has elegido Teleferico por bosque lluvioso\n");

                break; 

                case 3: 
                System.out.println("Visitar a las Cataratas de la Plata\n");

                break;
                default: System.out.println("Elige una opcion valida\n");
            }
        }    
                    

            if(tour.equals("si") && pais.equals("colombia")&& op2==1 && ni.equals("si")){
                total=(tt+tn)+costoA1;
                tu=total*0.25;
                to=total-tu;
                
            }else if(tour.equals("si") && pais.equals("colombia")&& op2==2 && ni.equals("si")){
                total=(tt+tn)+costoA2;
                tu=total*0.25;
                to=total-tu;
            }
            else if(tour.equals("si") && pais.equals("colombia")&& op2==1 && ni.equals("no")){
                total=tt+costoA2;
                tu=total*0.25;
                to=total-tu;
            }
            else if(tour.equals("si") && pais.equals("colombia")&& op2==2 && ni.equals("no")){
                total=tt+costoA2;
                tu=total*0.25;
                to=total-tu;
            }
            else if(tour.equals("no") && pais.equals("colombia")&& op2==2 && ni.equals("si")){
                total=(tt+tn);
                tu=(total+costoA2);
                ta=tu*0.25;
                to=tu-ta;
            }
            else if(tour.equals("no") && pais.equals("colombia")&& op2==1 && ni.equals("no")){
                total=tt;
                tu=(total+costoA1);
                ta=tu*0.15;
                to=ta-tu;
            }
            else if(tour.equals("no") && pais.equals("colombia")&& op2==2 && ni.equals("no")){
                total=tt;
                tu=(total+costoA2);
                ta=tu*0.15;
                to=tu-ta;
            }
            else if(tour.equals("no") && pais!="colombia"&& op2==2 && ni.equals("si")){
                total=(tt+tn);
                tu=(total+costoA2);
                ta=tu*0.15;
                to=tu-ta;
            }
            else if(tour.equals("no") && pais!="colombia"&& op2==1 && ni.equals("no")){
                total=ph*costo2;
                total=(total+costoA1);
            }
            else if(tour.equals("no") && pais!="colombia"&& op2==2 && ni.equals("no")){
                total=ph*costo2;
                total=(total+costoA2);
            }
            else if(tour.equals("si") &&pais!="colombia"&& op2==1 && ni.equals("si")){
                total=(tt+tn);
                tu=(total+costoA1);
                ta=tu*0.10;
                to=tu-ta;
            }else if(tour.equals("si") && pais!="colombia"&& op2==2 && ni.equals("si")){
                total=(tt+tn);
                tu=(total+costoA2);
                ta=tu*0.10;
                to=tu-ta;
            }
            else if(tour.equals("si") && pais!="colombia"&& op2==1 && ni.equals("no")){
                total=ph*costo2;
                tu=(total+costoA1);
                ta=tu*0.10;
                to=tu-ta;
            }
            else if(tour.equals("si") && pais!="colombia"&& op2==2 && ni.equals("no")){
                total=ph*costo2;
                tu=(total+costoA2);
                ta=tu*0.10;
                to=tu-ta;
            }
           int y=(int) (Math.random()*1000+1);
            System.out.println("Nombre de cliente: "+nombre);
            System.out.println("numero de recerba de cliente: "+y);
            System.out.println("Fecha de hospedaje del cliente : "+fh);
            System.out.println("Total a pagar: "+to);
               
       


 
 
            System.out.println(" ");
            System.out.println("HOTEL\n1) Seguir abierto\n2) Cerrar");
            i=leer.nextInt();
        
        }
    } while(i!=2);
        System.out.println();
        System.out.println("Numero de habitaciones: "+u);
    }


}
            
        
       
       
           
        







    

