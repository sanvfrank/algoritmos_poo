public class ticket {
   String nom;
   double montototal;
   double monPorCuota;
   
public ticket(String nom, double montototal, double monPorCuota) {
    this.nom = nom;
    this.montototal = montototal;
    this.monPorCuota = monPorCuota;
}

@Override
public String toString() {
    return "Monto por cuota: " + monPorCuota + "\nMontototal: " + montototal + "\nNombre: " + nom;
}

   

    
}
