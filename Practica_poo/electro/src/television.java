public class television extends electrodomestico {
    private final static int resoDefecto=20;
    private final static boolean sintoniDefecto=false;

private int resolucion;
private boolean sintonizadorTDT;

public television() {
    this.resolucion = resoDefecto;
    this.sintonizadorTDT = sintoniDefecto;
}
public television(double precioBase, double peso) {
    super(precioBase, peso);
    this.resolucion = resoDefecto;
    this.sintonizadorTDT = sintoniDefecto;
}
public television(double precioBase, double peso, String color, char consumoEnergetico, int resolucion,
        boolean sintonizadorTDT) {
    super(precioBase, peso, color, consumoEnergetico);
    this.resolucion = resolucion;
    this.sintonizadorTDT = sintonizadorTDT;
}

public double precioFinal(){
    double pfinal=0,plus=0;
   plus= super.precioFinal();
if(resolucion>40 && sintonizadorTDT==true){
    pfinal=plus*0.3;
    pfinal=pfinal+plus+50;
}else if(resolucion>40){
    pfinal=plus*0.30;
    pfinal=pfinal+plus;
}else if(sintonizadorTDT==true){
    pfinal=plus+50;
}

    return pfinal;
}


}
