public class bicicleta {
    String color;
    int velocidad;

    public bicicleta(String color, int velocidad) {
        this.color = color;
        this.velocidad = velocidad;
    }

    public int velocidad(){
        if(velocidad>70){
            System.out.println("Excedio la velocidad");
            System.out.println("Bajando la veocidad...");
velocidad=30;

        }else{
            System.out.println("Velocidad correcta");
         
   }
return velocidad;
    }



    public String mostrarColor(){
        System.out.println("Color de la bicicleta");
        return color;
    }
    
    public int SegunColor(){
        if(color.equals("rojo")){
            velocidad=40;
        }else if(color.equals("blanco")){
            velocidad=30;
        }else{
            velocidad=50;
        }

        return velocidad;
    }
    
    
}
