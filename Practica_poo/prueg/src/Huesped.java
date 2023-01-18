import java.util.ArrayList;
import java.util.Scanner;

public class Huesped {
    public static final double DESTUR= 0.10;
    public static final double DESNACIONALIDAD= 0.15;
    public static final double DESt= 0.25;
    public static final double TINDIVIDUAL= 10000;
    public static final double TDOBLE= 30000;
    public static final double TFAMILIAR= 60000;
    public static final double TSUIT= 100000;
    public static final double ALIMENT1= 100000;
    public static final double ALIMENT2= 50000;
    private String nombre;
    private String dni;
    private String fecha;
    private String celular;
    private String pais;
    private int personasAHospedar;
    private String ninos;
    private int habitacion;
    private String tour;
    private int alimentacion;
    private ArrayList<nino> lisninos;
    private ArrayList<nino> edades;
   private  int [] edad = new int [1000];



    public Huesped(String nombre, String dni, String fecha, String celular, String pais, int personasAHospedar,String ninos,int habitacion,String tour,int alimentacion) {
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.celular = celular;
        this.pais = pais;
        this.personasAHospedar = personasAHospedar;
        this.ninos= ninos;
        this.habitacion=habitacion;
        this.tour=tour;
        this.alimentacion=alimentacion;
        
        this.lisninos= new ArrayList<>();
        this.edades= new ArrayList<>();
    }


    public double totalP1(){
double p=0;
double p1=0;
double p2=0;

if(tiene()){ 
    lecturas();
    p= (ninopagan()*habitacion()/2)+(adultos()*habitacion()+alimentacion());
    p1=p*descuento();
    p2=p-p1;
}else{
    p= (adultos())+(habitacion()*+alimentacion());
    p1=p*descuento();
    p2=p-p1;  
}

return p;
    }








    public void lecturas(){
        nino ni=null;
        int k=0;
        int t=0;
        int i=0;
        int o=0;
        Scanner leer=new Scanner (System.in);

        do{
               
            System.out.println("¿Cuantos niños son?");
            t=leer.nextInt();
            if(t>=personasAHospedar){
               System.out.println(" ");
               System.out.println("se necesita minimo un adulto");
           }else if(t<=0){
               System.out.println(" ");
               System.out.println("Ingresa un numero mayor a 0");
           }
           
        } while(t>=personasAHospedar || t<=0);
      
   
  
        for(int r=0;r<t;r++){
            do{
                System.out.println("¿Que edad tiene el niño "+(r+1)+"?\n");
                edad[r]=leer.nextInt();
            if(edad[r]>=18){
                System.out.println("no debe de ser mayor a 17");
             }
            }while(edad[r]>=18);
            
            
            k++;
        }  
    
    for(int y=0;y<k;y++){
        ni= new nino(edad[y]);
        Registrarnino(ni);
     }

     if(desea()){
        touur();
      }
   
    }

   





        public boolean tiene(){
            return ninos.equals("si") ;
        }

        public boolean desea(){
            return tour.equals("si");
        }
       


        public double descuento(){

            double desc=0;
        if(pais.equals("colombia")&& tour.equals("si")){
            desc=DESt;
        }else if(pais.equals("colombia")){
            desc=DESNACIONALIDAD;
        }else if(tour.equals("si")){
            desc=DESTUR;
        }
            return desc;
        }
        

       

      

      
           
            public int touur(){
    Scanner leer=new Scanner (System.in);
    System.out.println(" ");
    System.out.println("TOUR\n1)Cabalgata\n2)Teleferico por nuestro bosque lluvioso\n3Visita a las Cataratas de la Plata.\n");
    int c=leer.nextInt();
    
    return c;
}


         public int ninoQNopaga(){
            int h=0;
        for (nino ni : lisninos) {
            if(ni.edad<6){
                h++;
             }
        }
        return h;
         }

        public int ninopagan() {
            int s=0;
            for (nino ni : lisninos) {
                if(ni.edad>=6 && ni.edad<=12){
                   s++;
                }
            }
            return s;
        }
        
        public int adultos(){
            return personasAHospedar-ninopagan()-ninoQNopaga();
            
            }
        

            public double habitacion(){
                double tarifa=0;
            if(habitacion==1){
                tarifa=TINDIVIDUAL;
            }else if(habitacion==2){
                tarifa=TDOBLE;
            }else if(habitacion==3){
                tarifa=TFAMILIAR;
            
            }else if(habitacion==4){
                tarifa=TSUIT;
            }
            
            return tarifa;
            }

            public int num(int i){
                return i;
            }

         

           
            

            public double alimentacion(){
                double al=0;
                if(alimentacion==1){
            al=ALIMENT1;
                }else if(alimentacion==2){
                    al=ALIMENT2;
                }
                return al;
            }
            
        
        


public String nomcomp(){
    return nombre;
}
public String cel(){
    return celular;
}
public String pai(){
    return pais;
}

public void Registrarnino (nino n){
    lisninos.add(n);
}

@Override
public String toString() {
    return "Huesped [lisninos=" + lisninos + "]";
}
        

       


    
    

    

    
}


