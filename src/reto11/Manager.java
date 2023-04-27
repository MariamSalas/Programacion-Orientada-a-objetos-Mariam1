package reto11;
/**

 Clase que representa un Manager, que extiende de Empleado e implementa la interfaz Entrevistador.
 */
public class Manager extends Empleado implements Entrevistador {

    /**

     El nombre de la division.
     */
    public String nombreDivision;
    /**

     Crea un nuevo objeto Manager.
     @param nombre El nombre del Manager.
     @param edad La edad del Manager.
     @param RFC El RFC del Manager.
     */
    Manager(String nombre, int edad, String RFC){
        super(nombre, edad, RFC);
    }
    /**

     Implementa el metodo entrevistar de la interfaz Entrevistador. El Manager ejecuta la accion de entrevistar.
     */
    @Override
    public void entrevistar(){
        System.out.println("Ejecutando entrevista");
    }
    /**

     Implementa el metodo obtenerPago de la clase Empleado. El Manager ejecuta la accion de cobrar sueldo.
     */
    @Override
    public void obtenerPago() {
        System.out.println("Manager tiene paga elevada");
    }
}