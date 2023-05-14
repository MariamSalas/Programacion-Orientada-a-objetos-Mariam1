package RetoFinal;
/**
 * Clase principal del juego de rescate de hadas.
 * Inicia el juego y muestra un mensaje introductorio para el usuario.
 * Crea una instancia del juego y llama al método start para comenzar el juego.
 */
class Main {
    Main() {
    }
    /**
     * Método principal del juego que se encarga de iniciar el juego y mostrar
     * un mensaje introductorio al usuario.
     * @param var0 Arreglo de argumentos de entrada (no utilizado)
     */
    public static void main(String[] var0) {
        System.out.println("\nExiste una villa que ha sido hechizada por un mago poderoso. Este mago obtiene su poder del polvo de hadas que mantiene en cautiverio. Tenemos que resacatarlas!!!");
        System.out.println("El mago maldito y el rescate de las Hadas!");
        System.out.println("\nPresiona enter para continuar....");

        try {
            System.in.read();
        } catch (Exception var2) {
            var2.printStackTrace();
        }

        Game var1 = new Game(10, 5, 5.0);
        var1.start();
    }
}
