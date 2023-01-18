public class videojuego implements entregable {
private final static String tituloDefecto="gta5";
private final static int horasDefecto=10;
private final static boolean entregadoDefecto=false;
private final static String generoDefecto="accion";
private final static String companiaDefecto="rockstar";

private String titulo;
private int horas;
static boolean entregado;
private String genero;
private  String compania;

public videojuego(){
    this.titulo=tituloDefecto;
    this.horas=horasDefecto;
    this.entregado=entregadoDefecto;
    this.genero=generoDefecto;
    this.compania=companiaDefecto;
}

public videojuego(String titulo,int horas){
    this.titulo=titulo;
    this.horas=horas;
    this.entregado=entregadoDefecto;
    this.genero=generoDefecto;
    this.compania=companiaDefecto;
}

public videojuego(String titulo,int horas,String genero,String compania){
    this.titulo=titulo;
    this.horas=horas;
    this.genero=genero;
    this.compania=compania;
}

public String getTitulo() {
    return titulo;
}

public int getHoras() {
    return horas;
}

public String getGenero() {
    return genero;
}

public String getCompania() {
    return compania;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public void setHoras(int horas) {
    this.horas = horas;
}

public void setGenero(String genero) {
    this.genero = genero;
}

public void setCompania(String compania) {
    this.compania = compania;
}

@Override
public String toString() {
    return "serie [titulo=" + titulo + ", horas=" + horas + ", genero=" + genero + ", compania=" + compania + "]";
}

@Override
public void entregar() {
    // TODO Auto-generated method stub
    
}

@Override
public void devolver() {
    // TODO Auto-generated method stub
    
}

@Override
public boolean isEntregado() {
    boolean a=false;
    return a;
    
}

@Override
public int compareTo(Object a) {
    int o=0;
    return o;
    
}



}
