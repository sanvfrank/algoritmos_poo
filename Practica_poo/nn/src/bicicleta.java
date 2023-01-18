public class bicicleta {
String color;
int velocidad;

public bicicleta(String color, int velocidad) {
    this.color = color;
    this.velocidad = velocidad;
}

public int velocidad (){
    int v;
    if(velocidad>60){
System.out.println("esta excediendo los limites de velocidad");
System.out.println("bajando velocidad....");
velocidad=40;
System.out.println("velocidad actual: ");
    }else{
        System.out.println("no excede los limites de velocidad");
        velocidad=this.velocidad;
    }
    return velocidad;
}


public String mostrarColor(){
    System.out.println("El color del auto es: ");
    return color;
}

public int SegunColor(){
    if(color.equals("rojo")){
        velocidad=30;
    }else if(color.equals("verde")){
        velocidad=40;
    }else{
        velocidad=60;
    }

    return velocidad;
}

}
