public class posnet {
static final double porcentaje=0.03;
static final int max=6;
static final int min=1;





public ticket efectuarPago(targetaDeCredito t,double monto,int Ncuotas){
ticket ti=null;
if(valido(t,monto,Ncuotas)){
 double montofinal=monto+monto*recargoPorCuotas(Ncuotas);
 if(t.suficiente(montofinal)){
 t.descontar(montofinal);
 double porCuota= montofinal/Ncuotas;
 String tt=t.nombreCompleto();
 ti= new ticket(tt, montofinal, porCuota);

 }

}
return ti;
}



private boolean valido(targetaDeCredito t,double monto,int Ncuotas){
boolean valido=false;
        if(t!=null && monto>0 && Ncuotas>min && Ncuotas<=max){
        valido=true;
 }
return valido;

}

private double recargoPorCuotas(int Ncuotas){
       
        return (Ncuotas - 1) * porcentaje;
}
}




