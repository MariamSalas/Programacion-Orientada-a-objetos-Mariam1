package reto9.ui;
import reto9.process.Ayudante;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase principal del programa que genera cinco ayudantes al azar y los muestra en una lista.
 */
public class CLI {

    private static final String[] COLORES_PIEL = {"amarilla", "morada"};
    private static final String[] ALTURAS = {"mediano", "alto"};
    private static final int NUM_AYUDANTES = 5;
    private static final int MIN_NIVEL = 1;
    private static final int MAX_NIVEL = 5;

    /**
     * Genera un número aleatorio en el rango [min, max].
     * @param min el mínimo valor del rango
     * @param max el máximo valor del rango
     * @return un número aleatorio en el rango [min, max]
     */
    private static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * Crea un ayudante al azar.
     * @return un objeto Ayudante con características aleatorias
     */
    private static Ayudante crearAyudanteAleatorio() {
        int numOjos = generarNumeroAleatorio(1, 2);
        String colorPiel = COLORES_PIEL[generarNumeroAleatorio(0, 1)];
        String altura = ALTURAS[generarNumeroAleatorio(0, 1)];
        int nivelCrear = generarNumeroAleatorio(MIN_NIVEL, MAX_NIVEL);
        int nivelArreglar = generarNumeroAleatorio(MIN_NIVEL, MAX_NIVEL);
        int nivelDestructivo = generarNumeroAleatorio(MIN_NIVEL, MAX_NIVEL);
        return new Ayudante(numOjos, colorPiel, altura, nivelCrear, nivelArreglar, nivelDestructivo);
    }

    /**
     * Crea una lista de ayudantes aleatorios.
     * @return una lista de objetos Ayudante con características aleatorias
     */
    private static List<Ayudante> crearListaAyudantes() {
        List<Ayudante> listaAyudantes = new ArrayList<>();
        for (int i = 0; i < NUM_AYUDANTES; i++) {
            Ayudante ayudante = crearAyudanteAleatorio();
            listaAyudantes.add(ayudante);
        }
        return listaAyudantes;
    }

    /**
     * Imprime la lista de ayudantes en la consola.
     * @param listaAyudantes la lista de objetos Ayudante a imprimir
     */
    private static void imprimirListaAyudantes(List<Ayudante> listaAyudantes) {
        for (int i = 0; i < listaAyudantes.size(); i++) {
            System.out.println("Ayudante #" + (i+1) + ": " + listaAyudantes.get(i));
        }
    }

    /**
     * Punto de entrada del programa.
     */
    public static void main() {
        List<Ayudante> listaAyudantes = crearListaAyudantes();
        imprimirListaAyudantes(listaAyudantes);
    }
}
