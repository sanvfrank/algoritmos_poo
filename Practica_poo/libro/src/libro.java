public class libro {
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int Número_páginas;


    
    public libro(int iSBN, String titulo, String autor, int número_páginas) {
        ISBN = iSBN;
        Titulo = titulo;
        Autor = autor;
        Número_páginas = número_páginas;
    }
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String autor) {
        Autor = autor;
    }
    public int getNúmero_páginas() {
        return Número_páginas;
    }
    public void setNúmero_páginas(int número_páginas) {
        Número_páginas = número_páginas;
    }
    @Override
    public String toString() {

            return "el libro "+Titulo+" con ISBN "+ISBN+" creado por el autor "+Autor+" tiene "+Número_páginas+" paginas";

        }
        
                
    
   

    
    
}
