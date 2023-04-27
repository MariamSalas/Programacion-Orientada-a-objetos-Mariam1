package reto11;
/**

 Clase que representa a un Senior Engineer, hereda de JrEngineer e implementa la interfaz Entrevistador
 */
public class SrEngineer extends JrEngineer implements Entrevistador{

    /**

     Atributo que representa el lider de proyecto del Senior Engineer
     */
    public String liderDeProyecto;
    /**

     Constructor de la clase SrEngineer
     @param nombre El nombre del Senior Engineer
     @param edad La edad del Senior Engineer
     @param RFC El RFC del Senior Engineer
     */
    SrEngineer(String nombre, int edad, String RFC){
        super(nombre, edad, RFC);
    }
    /**

     El senior ejecuta la accion de programar
     */
    public void programar(){
        System.out.println("Programa programa");
    }
    /**

     El senior ejecuta la accion de entrevistar
     */
    @Override
    public void entrevistar(){
        System.out.println("pregunta cosas tecnicas de programacion");
    }
}