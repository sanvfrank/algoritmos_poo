import ar.charlycimino.ejemplos.ejercicioIII.cartas.Carta;
import ar.charlycimino.ejemplos.ejercicioIII.cartas.CartaFigura;
import ar.charlycimino.ejemplos.ejercicioIII.cartas.CartaJoker;
import ar.charlycimino.ejemplos.ejercicioIII.cartas.CartaNumeral;
import java.util.ArrayList;
public class BarajaInglesa {
    private ArrayList<Carta> cartas;

    public BarajaInglesa() {
        this.cartas = new ArrayList<>();
        generarCartas();
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            carta.mostrar();
        }
    }

    private void generarCartas() {
        generarCartasNumerales();
        generarCartasFiguras();
        generarCartasJokers();
    }

    private void generarCartasNumerales() {
        final int MIN_VALOR = 2;
        final int MAX_VALOR = 10;
        Palo[] palos = Palo.values();

        for (int p = 0; p < palos.length; p++) {
            Palo paloActual = palos[p];
            for (int i = MIN_VALOR; i <= MAX_VALOR; i++) {
                this.cartas.add(new CartaNumeral(i, paloActual));
            }
        }

    }

    private void generarCartasFiguras() {
        char[] letras = {'A', 'J', 'Q', 'K'};
        Palo[] palos = Palo.values();

        for (int p = 0; p < palos.length; p++) {
            Palo paloActual = palos[p];
            for (int i = 0; i < letras.length; i++) {
                char letraActual = letras[i];
                this.cartas.add(new CartaFigura(letraActual, paloActual));
            }
        }
    }

    private void generarCartasJokers() {
        this.cartas.add(new CartaJoker(true));
        this.cartas.add(new CartaJoker(false));
    }

}
