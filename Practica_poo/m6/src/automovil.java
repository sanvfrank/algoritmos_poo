public class automovil {
    private modelo modelo;
    private color color;


    public automovil(modelo modelo, color color) {
        this.modelo = modelo;
        this.color = color;
    }


    public double precioBaseSeguro(){

        double precio=0;
       if(modelo.equals(modelo.A) && color.equals(color.claro)){
              precio=3800;
       } else if(modelo.equals(modelo.A) && color.equals(color.oscuro)){
               precio=4340;
       }else if(modelo.equals(modelo.B) && color.equals(color.claro)){
           precio=4930;
       }else if(modelo.equals(modelo.B) && color.equals(color.oscuro)){
           precio=5600;
       }else if(modelo.equals(modelo.C) && color.equals(color.claro)){
           precio=7570;
       }else if(modelo.equals(modelo.C) && color.equals(color.oscuro)){
           precio=8250;
       }
       
       return precio;
       }
       

    public modelo getModelo() {
        return modelo;
    }
    public color getColor() {
        return color;
    }

   

    
}
