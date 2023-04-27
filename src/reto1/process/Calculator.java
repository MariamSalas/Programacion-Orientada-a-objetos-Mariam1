package reto1.process;
/**
 * Clase para el procesamiento de las operaciones matemáticas.
 */
public class Calculator {
    /**
     * Método para realizar la suma de dos números.
     * @param a Primer número a sumar.
     * @param b Segundo número a sumar.
     * @return Resultado de la suma de los dos números.
     */
    public static double suma(double a, double b) {
        return a + b;
    }

    /**
     * Método para realizar la resta de dos números.
     * @param a Número del cual se va a restar el segundo número.
     @param b Número que se va a restar del primer número.
     @return Resultado de la resta de los dos números.
     */
    public static double resta(double a, double b) {
        return a - b;
    }
    /**
     Método para realizar la multiplicación de dos números.
     @param a Primer número a multiplicar.
     @param b Segundo número a multiplicar.
     @return Resultado de la multiplicación de los dos números.
     */
    public static double multiplicacion(double a, double b) {
        return a * b;
    }
    /**
     Método para realizar la división de dos números.
     @param a Número que se va a dividir.
     @param b Número por el cual se va a dividir.
     @return Resultado de la división de los dos números.
     @throws IllegalArgumentException si se intenta dividir entre cero.
     */
    public static double division(double a, double b) {
        if(b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero.");
        }
        return a / b;
    }
}
