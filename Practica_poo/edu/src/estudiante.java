public class estudiante extends participantes {
    private double calActual;
    private int u=0;

    public void cal(double cal){
        if(cal>0 && cal<=5.0){
            this.calActual=cal;
        }else{
            System.out.println("el rango debe ser de 0 a 10");
            
        }
    }
    
       
    public estudiante(String nombre, int edad, String sexo, double calActual) {
        super(nombre, edad, sexo);
        cal(calActual);
        
    }


    public double getCalActual() {
        return calActual;
    }


    @Override
    public boolean faltar() {
        boolean b=false;
        int ram= (int)(Math.random()*100);
       if(ram<50){
        super.setDisponible(false);
        b=true;
       }else{
        super.setDisponible(true);
b=false;
       }
           
          
        
            return b;
        }
       
    

public boolean masculi(){
    int ma=0;
    boolean m=false;
    boolean a=false;
    m=super.masculino();
    if(m){
        if(calActual>3.0){
a=true;
        }else{
            a=false;
        }
    }
   
    return a;
}

public boolean femeni(){
    int ma=0;
    boolean m=false;
    boolean a=false;
    m=super.femenino();
    if(m){
        if(calActual>3.0){
a=true;
        }else{
            a=false;
        }
    }
   
    return a;
}




   

    
    }

   
    

