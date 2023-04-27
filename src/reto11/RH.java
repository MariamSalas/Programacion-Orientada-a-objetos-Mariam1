package reto11;
/**

 Clase que representa un empleado de Recursos Humanos (RH), que extiende de Empleado e implementa la interfaz Entrevistador.
 */
public class RH extends Empleado implements Entrevistador{

    /**

     El correo del empleado de RH.
     */
    public String correo;
    /**

     Crea un nuevo objeto RH.
     @param nombre El nombre del empleado de RH.
     @param edad La edad del empleado de RH.
     @param RFC El RFC del empleado de RH.
     */
    RH(String nombre, int edad, String RFC){
        super(nombre, edad, RFC);
    }
    /**

     Implementa el metodo entrevistar de la interfaz Entrevistador. El empleado de RH ejecuta la accion de preguntar el background.
     */
    @Override
    public void entrevistar(){
        System.out.println("preguntar el background");
    }
    /**

     Implementa el metodo obtenerPago de la clase Empleado. El empleado de RH ejecuta la accion de cobrar sueldo bajo.
     */
    @Override
    public void obtenerPago() {
        System.out.println("RH tiene pago bajo");
    }
}