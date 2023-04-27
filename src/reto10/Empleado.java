package reto10;
/**
 * La clase abstracta Empleados define los atributos y métodos que son comunes a todos los empleados de una empresa.
 */
public abstract class Empleado {

    /**
     * La edad del empleado.
     */
    public int edad;

    /**
     * La paga que recibe el empleado.
     */
    public int paga;

    /**
     * La matrícula del empleado.
     */
    public int matricula;

    /**
     * El número de teléfono del empleado.
     */
    public int numeroTelefono;

    /**
     * El nombre del empleado.
     */
    public String nombre;

    /**
     * Método que define la acción de trabajar para los empleados.
     */
    public void trabajar(){
        System.out.println("Ejecutando trabajar");
    }

    /**
     * Método abstracto que define cómo se obtiene el pago para un empleado.
     */
    abstract public void obtenerPago();
}