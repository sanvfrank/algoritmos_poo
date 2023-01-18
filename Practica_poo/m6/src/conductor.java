import java.util.ArrayList;

public class conductor {
    private int edad;
    private int tiempoConduciendo;
    private automovil automovil;
    private ArrayList<automovil> lisauto;

    public conductor(int edad, int tiempoConduciendo, automovil automovil) {
        this.edad = edad;
        this.tiempoConduciendo = tiempoConduciendo;
        this.automovil = automovil;
        this.lisauto=new ArrayList<>();
    }
   

    
    public boolean p1(){
        return edad<20 && tiempoConduciendo<2;
    }
    public boolean p11(){
        return edad<20;
    }
    public boolean p2(){
        return edad>=20 && edad<=30 && tiempoConduciendo<2;
    }
    public boolean p22(){
        return edad>=20 && edad<=30;
    }
    public boolean p3(){
        return edad>=31 && edad<=65 && tiempoConduciendo<2;
    }
    public boolean p33(){
        return edad>=31 && edad<=65;
    }
    public int getEdad() {
        return edad;
    }

    public int getTiempoConduciendo() {
        return tiempoConduciendo;
    }

    
}
