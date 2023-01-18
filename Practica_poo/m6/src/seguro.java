public class seguro {
    private static final double p1=0.10;       
    private static final double p2=0.15;       
    private static final double p3=0.25; 

public double precioSeguro (conductor c, automovil a){
double precioFinal=0;

if(c.p1()){
    precioFinal=a.precioBaseSeguro()+a.precioBaseSeguro()*(p3+p3);
    }else if(c.p11()){
    precioFinal=a.precioBaseSeguro()+a.precioBaseSeguro()*p3;
    }
    else if(c.p2()){
        precioFinal=a.precioBaseSeguro()+a.precioBaseSeguro()*(p1+p3);;
    }else if(c.p22()){
        precioFinal=a.precioBaseSeguro()+a.precioBaseSeguro()*p1;
    }
    else if(c.p3()){
        precioFinal=a.precioBaseSeguro()+ a.precioBaseSeguro()*p3;
    }else if(c.p33()){
        precioFinal=a.precioBaseSeguro();
    }
return precioFinal;
}




    
}
