package RetoFinal;
import java.util.function.Predicate;

/**
* La clase Character repressenta un personaje en el juego.
* Estan las variables de vida, hadas, habilidades
 */
public class Character {
    /**
     * Vida del personaje
     */
    int life;
    /**
     * Numero de hadas recolectadas
     */
    int faries = 0;
    /**
     * Predicado para verificar si el numero es multiplo
     */
    Predicate<Integer> isModulo;
    private double hability;

    /**
     *Constructor para crear un nuevo personaje con una vida, habilidad y predicado específicos
     * @param var1 La vida del personaje
     * @param var2 La habilidad del personaje
     * @param var4 El predicado para verificar si un número es múltiplo de algo
    */

    Character(int var1, double var2, Predicate<Integer> var4) {
        this.life = var1;
        this.hability = var2;
        this.isModulo = var4;
    }
    /**
     Metodo para que el personaje recolecte una hada y aumente su vida si el número de hadas recolectadas es múltiplo de 3
     */
    public void gainFaries() {
        this.life = this.isModulo.test(++this.faries) ? this.life + 1 : this.life;
    }
    /**
    Método para que el personaje pierda una hada y disminuya su vida si el parámetro var1 es múltiplo de 5 y tiene hadas recolectadas
    @param var1 El número a verificar si es múltiplo de algo
    */
    public void looseFaries(int var1) {
        if (this.faries != 0) {
            --this.faries;
            this.life = this.isModulo.test(var1) ? this.life - 1 : this.life;
        }

    }
    /**
     Metodo para aumentar la vida del personaje en 1
     */
    public void heal() {
        ++this.life;
    }
    /**
     Método para disminuir la vida del personaje en 1
     */
    public void damage() {
        --this.life;
    }

    /**
     * Metodo para verificar si el personaje está muerto
     * @return True si la vida del personaje es 0, false de lo contrario
     */
    public boolean isDead() {
        return this.life == 0;
    }
    /**
     Metodo para obtener la vida actual del personaje
     @return La vida del personaje
     */
    public int getLife() {
        return this.life;
    }
    /**
    Metodo para obtener el número de hadas recolectadas por el personaje
    @return El número de hadas recolectadas
    */
    public int getFaries() {
        return this.faries;
    }
    /**
     Método para obtener la habilidad del personaje
     @return La habilidad del personaje
     */
    public double getHability() {
        return this.hability;
    }
}

