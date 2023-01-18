public class electrodomestico {
    private final static String colorDefecto="blanco";
    private final static double precioDefecto=100;
    private final static char consumoDefecto='F';
    private final static double pesoDefecto=50;

    private String color;
    private double precioBase;
    private char consumoEnergetico;
    private double peso;



public void comprobarColor(String color){
if(color.equals("blanco") || color.equals("negro")|| color.equals("rojo") || color.equals("azul") || color.equals("gris")){
    this.color=color;
}else{
    this.color=colorDefecto;
}
}

   public void comprobarConsumoEnergetico(char letra){
if(letra>=65 && letra<=70){
    this.consumoEnergetico=letra;
}else{
    this.consumoEnergetico=consumoDefecto;
}
    }



 public double precioFinal(){
double pFinal=0;
pFinal=precioBase+segunConsumo()+segunTamanio();
return pFinal;
    }

 public double segunConsumo(){
double consu=0;
switch(consumoEnergetico){
    case 'A':
consu=100;
    break;
    case 'B':
consu=80;
    break;
    case 'C':
consu=60;
    break;
    case 'D':
consu=50;
    break;
    case 'E':
consu=30;
    break;
    case 'F':
consu=10;
    break;
}

return consu;
    }


public double segunTamanio(){
    double tam=0;
    if(peso>0 && peso<=19){
        tam=10;
    }else if(peso>=20 && peso<=49){
tam=50;
    }
    else  if(peso>50 && peso<=79){
        tam=80;
    }else  if(peso>80){
tam=100;
    }
    return tam;
}

    
    public String getColor() {
        return color;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public electrodomestico(){
        this.precioBase=precioDefecto;
        this.peso=pesoDefecto;
        this.color=colorDefecto;
        this.consumoEnergetico=consumoDefecto;
    }

    public electrodomestico(double precioBase,double peso){
        this.precioBase=precioBase;
        this.peso=peso;
        this.color=colorDefecto;
        this.consumoEnergetico=consumoDefecto;
    }

public electrodomestico(double precioBase,double peso,String color,char consumoEnergetico){
this.precioBase=precioBase;
this.peso=peso;
comprobarColor(color);
comprobarConsumoEnergetico(consumoEnergetico);
    }

    
}
