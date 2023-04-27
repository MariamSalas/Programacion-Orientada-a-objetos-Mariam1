package reto10;
/**
 * La clase JrEngineer representa a un ingeniero junior que trabaja como programador en una empresa.
 */
public class JrEngineer extends Empleado implements Programer{

    /**
     * El stack tecnológico en el que trabaja el ingeniero.
     */
    public String stack;

    /**
     * El nombre del supervisor del ingeniero.
     */
    public String nombreSupervisor;

    /**
     * Método que define la acción de programar para un ingeniero junior.
     */
    @Override
    public void programar(){
        System.out.println("programa como puede");
    }

    /**
     * Método que define cómo se obtiene el pago para un ingeniero junior.
     */
    @Override
    public void obtenerPago(){
        System.out.println("Jrs cobran sueldo medio");
    }
}