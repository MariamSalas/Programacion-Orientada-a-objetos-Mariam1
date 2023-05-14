package RetoFinal;
import java.io.PrintStream;

/**
 * Clase que representa un juego de rescate de hadas entre un héroe y un mago.
 */
public class Game {
    /**
     * Personaje del heroe
     */
    Character hero;
    /**
     * Personaje del mago
     */
    Character wizard;
    /**
     * Constructor para la clase Game.
     * @param var1 Vida inicial del héroe.
     * @param var2 Vida inicial del mago.
     * @param var3 Habilidad del mago, un valor entre 0 y 10.
     */
    Game(int var1, int var2, double var3) {
        this.hero = new Character(var1, 1.0 - var3 / 10.0, (var0) -> {
            return var0 % 10 == 0;
        });
        this.wizard = new Character(var2, var3 / 10.0, (var0) -> {
            return var0 % 10 == 0;
        });
    }
    /**
     * Inicia el juego termina hasta que uno de los personajes muere.
     */
    public void start() {
        while(true) {
            if (this.hero.isDead()) {
                System.out.println("You loose: Hero Died");
            } else {
                if (!this.wizard.isDead()) {
                    this.step();
                    continue;
                }

                System.out.println("You win: Wizard Died");
            }

            this.ends();
            return;
        }
    }

    /**
     * Imprime los valores finales del juego
     */
    private void ends() {
        System.out.println("\nGame Values: ");
        System.out.println("Rescued Faries: " + this.hero.getFaries());
        System.out.println("Captured Faries: " + this.wizard.getFaries());
    }
    /**
     * Paso para que eel heroe intenta rescatar las hadas del mago
     */
    private void step() {
        PrintStream var10000;
        int var10001;
        if (Math.random() < this.wizard.getHability()) {
            this.wizard.gainFaries();
            var10000 = System.out;
            var10001 = this.wizard.getLife();
            var10000.println("Wizard captured fairy; Wizard has " + var10001 + " lives. And " + this.wizard.getFaries() + " captured fairies.");
        }

        if (Math.random() < this.hero.getHability()) {
            if (this.wizard.getFaries() == 0) {
                System.out.println("There are no captured fairies, rescue attempt finished.");
                return;
            }

            if (Math.random() > this.hero.getHability()) {
                this.hero.damage();
                System.out.println("Troll hit you while trying to rescue fairy!; you have: " + this.hero.getLife() + " lives.");
            }

            this.hero.gainFaries();
            this.wizard.looseFaries(this.hero.getFaries());
            var10000 = System.out;
            var10001 = this.hero.getFaries();
            var10000.println("Hero rescued a fairy! Hero has rescued " + var10001 + " fairies. you have: " + this.hero.getLife() + " lives. Wizard has: " + this.wizard.getLife() + " lives.");
        }

    }
}

