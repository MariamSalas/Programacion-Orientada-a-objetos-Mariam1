package reto5.process;
import java.util.HashSet;
import java.util.Set;

/**
 * Clase encargada de procesar la lógica del juego de adivinar palabras.
 */
public class WordGameProcess {

    // Palabras base para cada nivel
    private static final String[] EASY_WORDS = {"tina", "cama", "saco", "moto"};
    private static final String[] INTERMEDIATE_WORDS = {"abogados", "computar", "director", "estudiar", "hospital", "matematic"};
    private static final String[] ADVANCED_WORDS = {"bicicletario", "espectacular", "organizacion"};

    // Número máximo de intentos
    private static final int MAX_TRIES = 6;

    // Palabra base del juego
    private String word;

    // Palabra a mostrar al usuario
    private StringBuilder displayedWord;

    // Letras que ha ingresado el usuario
    private Set<Character> guessedLetters;

    // Número de intentos restantes
    private int triesLeft;

    /**
     * Constructor del juego.
     *
     * @param level Nivel del juego (1: fácil, 2: intermedio, 3: avanzado).
     */
    public WordGameProcess(int level) {
        // Escoger palabra base según el nivel
        String[] words;
        switch (level) {
            case 1:
                words = EASY_WORDS;
                break;
            case 2:
                words = INTERMEDIATE_WORDS;
                break;
            case 3:
                words = ADVANCED_WORDS;
                break;
            default:
                throw new IllegalArgumentException("Nivel inválido");
        }
        word = words[(int) (Math.random() * words.length)];

        // Inicializar displayedWord con los caracteres ocultos
        displayedWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            displayedWord.append("X");
        }

        guessedLetters = new HashSet<>();
        triesLeft = MAX_TRIES;
    }

    /**
     * Procesa la letra ingresada por el usuario y actualiza displayedWord si es necesario.
     *
     * @param letter Letra ingresada por el usuario.
     * @return true si la letra está en la palabra base, false si no.
     */
    public boolean processLetter(char letter) {
        // Validar letra
        if (!Character.isLetter(letter)) {
            throw new IllegalArgumentException("Letra inválida");
        }
        letter = Character.toLowerCase(letter);

        // Verificar si la letra ya fue adivinada
        if (guessedLetters.contains(letter)) {
            return true;
        }
        guessedLetters.add(letter);

        // Verificar si la letra está en la palabra base
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                displayedWord.setCharAt(i, letter);
                found = true;
            }
        }

        if (!found) {
            triesLeft--;
        }

        return found;
    }
    /**
     * Indica si el usuario ha adivinado la palabra base.
     *
     * @return true si la palabra ha sido adivinada, false si no.
     */
    public boolean hasWon() {
        return displayedWord.toString().equals(word);
    }
    /**
     * Indica si el juego ha terminado.
     *
     * @return true si el juego ha terminado (ya sea porque el usuario ha adivinado la palabra o porque se ha quedado sin intentos), false si no.
     */
    public boolean isGameOver() {
        return hasWon() || triesLeft == 0;
    }

    /**
     * Devuelve la palabra base.
     *
     * @return Palabra base.
     */
    public String getWord() {
        return word;
    }

    /**
     * Devuelve la palabra que se muestra al usuario (con las letras adivinadas).
     *
     * @return Palabra mostrada al usuario.
     */
    public String getDisplayedWord() {
        return displayedWord.toString();
    }

    /**
     * Devuelve el número de intentos restantes.
     *
     * @return Número de intentos restantes.
     */
    public int getTriesLeft() {
        return triesLeft;
    }

    /**
     * Devuelve las letras que ha ingresado el usuario.
     *
     * @return Letras ingresadas por el usuario.
     */
    public Set<Character> getGuessedLetters() {
        return guessedLetters;
    }
}
