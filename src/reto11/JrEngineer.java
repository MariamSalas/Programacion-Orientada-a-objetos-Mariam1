package reto11;
/**

 La clase JrEngineer hereda de Empleado e implementa la interfaz Programer.

 Representa a un programador Jr en una empresa.
 */
public class JrEngineer extends Empleado implements Programer{

    /**

     El lenguaje de programación en el que el programador Jr tiene experiencia.
     */
    public String stack;
    /**

     El nombre del supervisor del programador Jr.
     */
    public String nombreSupervisor;
    /**

     Constructor para la clase JrEngineer.
     @param nombre El nombre del programador Jr.
     @param edad La edad del programador Jr.
     @param RFC El RFC del programador Jr.
     */
    JrEngineer(String nombre, int edad, String RFC){
        super(nombre, edad, RFC);
    }
    /**

     El programador Jr ejecuta la acción de programar.
     */
    public void programar(){
        System.out.println("programa como puede");
    }
    /**

     El programador Jr ejecuta la acción de cobrar el sueldo.
     */
    @Override
    public void obtenerPago(){
        System.out.println("Jrs cobran sueldo medio");
    }
}