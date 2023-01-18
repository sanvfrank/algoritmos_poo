package cartas;
import ar.charlycimino.ejemplos.ejercicioIII.Palo;
public abstract class CartaConPalo extends Carta {
    private Palo palo;

    public CartaConPalo(Palo palo) {
        this.palo = palo;
    }

}
