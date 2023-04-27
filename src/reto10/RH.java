package reto10;
/**

 Clase que representa a un Empleado de Recursos Humanos que implementa la interfaz Entrevistador.
 */
public class RH extends Empleado implements Entrevistador{

    public String correo;

    /**

     Método que permite al Empleado de RH realizar la acción de entrevistar.
     */
    @Override
    public void entrevistar(){
        System.out.println("Preguntar el background");
    }
    /**

     Método que permite al Empleado de RH realizar la acción de obtener su pago.
     */
    @Override
    public void obtenerPago() {
        System.out.println("RH tiene pago bajo");
    }
}