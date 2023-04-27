package reto5.ui;
import reto5.process.WordGameProcess;

import java.util.Scanner;

/**

 Clase encargada de la interfaz de usuario del juego de adivinar palabras.
 */
public class CLI {

    /**

     Método principal del programa.

     */
    public static void showmenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar palabras!");

        int level = chooseLevel(scanner);

        WordGameProcess game = new WordGameProcess(level);

        while (!game.isGameOver()) {
            displayGameStatus(game);
            char letter = readLetter(scanner);

            boolean letterFound = game.processLetter(letter);

            if (!letterFound) {
                System.out.println("LETRA INVALIDA!");
            }
        }

        displayGameResult(game);
    }

    /**

     Muestra el mensaje para elegir nivel y devuelve el nivel elegido por el usuario.
     @param scanner Scanner para leer la entrada del usuario.
     @return Nivel elegido por el usuario (1: fácil, 2: intermedio, 3: avanzado).
     */
    private static int chooseLevel(Scanner scanner) {
        while (true) {
            System.out.println("Elija el nivel: (1) Fácil, (2) Intermedio, (3) Avanzado");
            String input = scanner.nextLine();
            try {
                int level = Integer.parseInt(input);
                if (level >= 1 && level <= 3) {
                    return level;
                } else {
                    System.out.println("Nivel inválido");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida");
            }
        }
    }
    /**

     Muestra el estado actual del juego (palabra adivinada hasta ahora, letras ingresadas, intentos restantes).
     @param game Objeto WordGameProcess que representa el estado actual del juego.
     */
    private static void displayGameStatus(WordGameProcess game)
    {
        System.out.println("Palabra: " + game.getDisplayedWord());
        System.out.println("Letras ingresadas: " + game.getGuessedLetters());
        System.out.println("Intentos restantes: " + game.getTriesLeft());
    }
    /**
     * Lee una letra ingresada por el usuario.
     *
     * @param scanner Scanner para leer la entrada del usuario.
     * @return Letra ingresada por el usuario.
     */
    private static char readLetter(Scanner scanner) {
        while (true) {
            System.out.print("Introduce la letra: ");
            String input = scanner.nextLine();
            if (input.length() != 1) {
                System.out.println("Entrada inválida");
            } else {
                char letter = input.charAt(0);
                if (Character.isLetter(letter)) {
                    return letter;
                } else {
                    System.out.println("Entrada inválida");
                }
            }
        }
    }

    /**
     * Muestra el resultado final del juego (si el usuario ha ganado o perdido).
     *
     * @param game Objeto WordGameProcess que representa el estado final del juego.
     */
    private static void displayGameResult(WordGameProcess game) {
        if (game.hasWon()) {
            System.out.println("¡Felicidades, has adivinado la palabra " + game.getWord() + "!");
        } else {
            System.out.println("Lo siento, has agotado tus intentos. La palabra era " + game.getWord() + ".");
        }
    }



}