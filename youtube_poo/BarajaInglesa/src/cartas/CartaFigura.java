package cartas;
import ar.charlycimino.ejemplos.ejercicioIII.Palo;
public class CartaFigura extends CartaConPalo{
    private char letra;

    public CartaFigura(char letra, Palo palo) {
        super(palo);
        this.letra = letra;
    }
}
