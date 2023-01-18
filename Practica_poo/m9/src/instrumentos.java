public class instrumentos {
   private String id;
    private double precio;
    tipoInstrumentos tipos;
    public instrumentos(String id, double precio, tipoInstrumentos tipos) {
        this.id = id;
        this.precio = precio;
        this.tipos = tipos;
    }
    
    public String getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "" + "id=" + id + ", precio=" + precio + ", tipos=" + tipos + "";
    }

  
    
}
