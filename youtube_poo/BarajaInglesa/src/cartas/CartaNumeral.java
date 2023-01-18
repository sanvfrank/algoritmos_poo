package cartas;
import ar.charlycimino.ejemplos.ejercicioIII.Palo;
public class CartaNumeral extends CartaConPalo{
    private int numero;

    public CartaNumeral(int numero, Palo palo) {
        super(palo);
        this.numero = numero;
    }
}
