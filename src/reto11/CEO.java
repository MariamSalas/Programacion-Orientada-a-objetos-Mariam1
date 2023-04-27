package reto11;
/**

 La clase CEO hereda de Manager y representa a un CEO en una empresa.
 */
public class CEO extends Manager {

    /**

     El número de la empresa que el CEO dirige.
     */
    public int empresa;
    /**

     El valor total de la empresa que el CEO dirige.
     */
    public int valorEmpresa;
    /**

     El valor de la fracción de la empresa que el CEO dirige.
     */
    public int valorFraccionEmpresa;
    /**

     Constructor para la clase CEO.
     @param nombre El nombre del CEO.
     @param edad La edad del CEO.
     @param RFC El RFC del CEO.
     */
    CEO(String nombre, int edad, String RFC){
        super(nombre, edad, RFC);
    }
}