package reto11;
/**
 La clase abstracta Empleado representa a un empleado en una empresa.
 */
import java.io.Serializable;
public abstract class Empleado implements Serializable{
    /**
     * La edad del empleado.
     */
    public int edad;
    /**
     * La paga del empleado.
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
     * El RFC del empleado.
     */
    public String RFC;

    /**
     * Constructor para la clase Empleado.
     *
     * @param nombre El nombre del empleado.
     * @param edad La edad del empleado.
     * @param RFC El RFC del empleado.
     */
    Empleado(String nombre, int edad, String RFC){
        this.nombre = nombre;
        this.edad = edad;
        this.RFC = RFC;
    }

    /**
     * Los empleados ejecutan la acción de trabajar.
     */
    public void trabajar(){
        System.out.println("Ejecutando trabajar");
    }

    /**
     * Método abstracto que define cómo el empleado obtiene su pago.
     */
    abstract public void obtenerPago();

    /**
     * Retorna una cadena que representa el objeto Empleado.
     *
     * @return Una cadena que representa el objeto Empleado.
     */
    @Override
    public String toString() {
        return "Empleado: Nombre=" + this.nombre + " Edad=" + this.edad + " RFC=" + this.RFC;
    }
}