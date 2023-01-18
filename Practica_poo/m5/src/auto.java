public class auto {
    private String nom;
    private String marca;
    private double kRecorridos;
    private String color;
    
    public auto(String nom, String marca, double kRecorridos, String color) {
        this.nom = nom;
        this.marca = marca;
        this.kRecorridos = kRecorridos;
        this.color = color;
    }

    public double getkRecorridos() {
        return kRecorridos;
    }

    @Override
    public String toString() {
        return "color = " + color + " kRecorridos = " + kRecorridos + " marca = " + marca + "  nom = " + nom+ "\n";
    }

    
}
