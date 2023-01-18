import java.util.ArrayList;

public class principal {
    public static void main(String[] args){
        fabrica f=new fabrica();
        sucursales s1=new sucursales("primer");
        sucursales s2=new sucursales("segunda");
        sucursales s3=new sucursales("tercera");

        instrumentos i1A=new instrumentos("1234", 1000,tipoInstrumentos.CUERDA);
        instrumentos i1B=new instrumentos("12345", 6000,tipoInstrumentos.CUERDA);

        instrumentos i2A=new instrumentos("123456", 5000,tipoInstrumentos.CUERDA);
        instrumentos i2B=new instrumentos("12345", 4000,tipoInstrumentos.PERCUSION);

        instrumentos i3A=new instrumentos("1234567", 2000,tipoInstrumentos.PERCUSION);
        instrumentos i3B=new instrumentos("123456", 3000,tipoInstrumentos.PERCUSION);


s1.agregarI(i1A);
s1.agregarI(i1B);

s2.agregarI(i2A);
s2.agregarI(i2B);

s3.agregarI(i3A);
s3.agregarI(i3B);

f.agregarS(s1);
f.agregarS(s2);
f.agregarS(s3);

ArrayList<instrumentos> list= f.instrumentosPorTipo(tipoInstrumentos.CUERDA);
for (instrumentos instrumentos : list) {
    System.out.println(instrumentos);
}
    }
}
