public class ticket {
    private String nom;
    private String celularr;
    private String pais;
    private double totall;

    public ticket(String nom, String celularr, String pais, double totall) {
        this.nom = nom;
        this.celularr = celularr;
        this.pais = pais;
        this.totall = totall;
    }

    @Override
    public String toString() {
        return "nombre = " + nom + "\ncelularr = " + celularr + "\npaiss = " + pais + "\ntotal a pagar = " + totall;
    }

    
    
}
