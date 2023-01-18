public class serie implements entregable  {
private final static String tituloDefecto="caperucita";
private final static int numeroTDefecto=3;
private final static boolean entregadoDefecto=false;
private final static String generoDefecto="fantasia";
private final static String creadorDefecto="warner";
private final static int menor=-1;
private final static int mayor=1;
private final static int igual=0;

private String titulo;
private int numeroDeTemps;
private boolean entregado;
private String genero;
private String creador;

public serie(){
    this.titulo=tituloDefecto;
    this.numeroDeTemps=numeroTDefecto;
    this.entregado=entregadoDefecto;
    this.genero=generoDefecto;
    this.creador=creadorDefecto;
}

public serie(String titulo,String creador){
    this.titulo=titulo;
    this.creador=creador;
    this.numeroDeTemps=numeroTDefecto;
    this.entregado=entregadoDefecto;
    this.genero=generoDefecto;

}

public serie(String titulo,String creador,int numTemps,boolean entregado,String genero){
    this.titulo=titulo;
    this.creador=creador;
    this.numeroDeTemps=numTemps;
    this.entregado=entregado;
    this.genero=genero;

}

public String getTitulo() {
    return titulo;
}

public int getNumeroDeTemps() {
    return numeroDeTemps;
}

public String getGenero() {
    return genero;
}

public String getCreador() {
    return creador;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public void setNumeroDeTemps(int numeroDeTemps) {
    this.numeroDeTemps = numeroDeTemps;
}

public void setGenero(String genero) {
    this.genero = genero;
}

public void setCreador(String creador) {
    this.creador = creador;
}

@Override
public String toString() {
    return "serie [titulo=" + titulo + ", numeroDeTemps=" + numeroDeTemps + ", entregado=" + entregado + ", genero="
            + genero + ", creador=" + creador + "]";
}

@Override
public void entregar() {
    entregado=true;
    
}

@Override
public void devolver() {
    
    
}

@Override
public boolean isEntregado() {
    if(entregado){
        return true;
    }
    return false;
    
}

@Override
public int compareTo(Object a) {
   int estado=menor;
    serie ref=(serie)a;
        if (numeroDeTemps>ref.getNumeroDeTemps()){
            estado=mayor;
        }else if(numeroDeTemps==ref.getNumeroDeTemps()){
            estado=igual;
        }
  
        return estado;
    }
  
    
}





