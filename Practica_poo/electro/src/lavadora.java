public class lavadora extends electrodomestico {
    private final static double cargaDefecto=5;
    private double carga;



    public lavadora() {
        this.carga = cargaDefecto;
    }

    public lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = cargaDefecto;
    }

    public lavadora(double precioBase, double peso, String color, char consumoEnergetico, double carga) {
        super(precioBase, peso, color, consumoEnergetico);
        this.carga = carga;
    }


    public double getCarga() {
        return carga;
    }

    public double precioFinal(){
        double pfinal=0;
       double plus= super.precioFinal();
       if(carga>30){
        pfinal=plus+50;
       }else{
        pfinal=plus;
       }
        return pfinal;
    }

  
   
}
