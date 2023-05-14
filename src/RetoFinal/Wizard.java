package RetoFinal;
import java.util.function.Predicate;
/**
 La clase Wizard es una subclase de Character que representa a un personaje de tipo mago.
 El mago tiene la habilidad de capturar hadas y mantenerlas cautivas, obteniendo poder de ellas.
 */
class Wizard extends Character {
    /**
     * Constructor de la clase Wizard.
     * @param var1 La cantidad de vidas del mago.
     * @param var2 La habilidad del mago para capturar hadas.
     * @param var4 Un predicado que determina si el mago pierde una vida al perder una hada.
     */
    Wizard(int var1, double var2, Predicate<Integer> var4) {
        super(var1, var2, var4);
    }

    /**
     * Metodo que permite al mago perder una hada.
     * @param var1 La cantidad de hadas que el mago pierde.
     */
    public void looseFaries(int var1) {
        if (this.faries != 0) {
            --this.faries;
            this.life = this.isModulo.test(var1) ? this.life - 1 : this.life;
        }

    }
}
