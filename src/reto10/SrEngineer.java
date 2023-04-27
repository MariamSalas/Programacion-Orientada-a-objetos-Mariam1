package reto10;
/**

 Clase que representa a un ingeniero senior que es capaz de programar y entrevistar
 */
public class SrEngineer extends JrEngineer implements Entrevistador {

    /** El líder de proyecto asignado a este ingeniero senior */
    public String liderDeProyecto;

    /**

     Implementación del método programar de la interfaz Programer
     El ingeniero senior ejecuta la acción de programar
     */
    @Override
    public void programar() {
        System.out.println("Programando...");
    }
    /**

     Implementación del método entrevistar de la interfaz Entrevistador
     El ingeniero senior ejecuta la acción de entrevistar preguntando cosas técnicas de programación
     */
    @Override
    public void entrevistar() {
        System.out.println("Realizando entrevista técnica...");
    }
}
