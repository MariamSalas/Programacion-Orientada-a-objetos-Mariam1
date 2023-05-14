package reto10;
/**

 Clase que representa a un Manager que es un Empleado y también es capaz de realizar entrevistas.
 */
public class Manager extends Empleado implements Entrevistador {

    public String nombreDivision;

    /**

     Método que permite al Manager realizar una entrevista.
     */
    @Override
    public void entrevistar(){
        System.out.println("Ejecutando entrevista");
    }
    /**

     Método que permite al Manager obtener su pago correspondiente.
     */
    @Override
    public void obtenerPago() {
        System.out.println("Manager tiene paga elevada");
    }
}
