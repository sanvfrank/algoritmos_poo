public class pelicula {
    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;

    String directores[]={"jhon cazas","hernando jimenez","jose fernandez","stephen carri","jhosep gut"};
    String titulos[]={"Spiderman","El camino","El hostal","Avengers","dragon ball"};

    public pelicula() {
titulo=titulos[metodoA.generaNumeroAleatorio(0, 4)];
setDuracion(metodoA.generaNumeroAleatorio(1, 3));
setEdadMinima(metodoA.generaNumeroAleatorio(0, 10));
director=directores[metodoA.generaNumeroAleatorio(0, 4)];

    }

public int tam(){
    int p=0;
   p= titulos.length;
   return p;
}


    public String getTitulo() {
        return titulo;
    }
    public int getDuracion() {
        return duracion;
    }
    public int getEdadMinima() {
        return edadMinima;
    }
    public String getDirector() {
        return director;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }


    public void setDirector(String director) {
        this.director = director;
    }

    
}
