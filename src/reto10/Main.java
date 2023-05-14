package reto10;
/**
 * La clase Main es la clase principal que se ejecuta al correr el programa.
 */
public class Main {

    /**
     * El método main es el punto de entrada del programa.
     * @param args los argumentos pasados al programa en la línea de comandos
     */
    public static void main(String[] args) {

        // Creacion implementando polimorfismo
        Programer prog1 = new JrEngineer();
        Programer prog = new JrEngineer();
        Empleado emp1 = new JrEngineer();
        Empleado emp3 = new Manager();
        Empleado emp2 = new CEO();

        Entrevistador ent1 = new RH();
        Entrevistador ent2 = new CEO();
        Entrevistador ent3 = new SrEngineer();

        // métodos usando polimorfismo

        probarProgramador(prog1);
        probarProgramador(prog);
        probarEmpleado(emp1);
        probarEmpleado(emp2);
        probarEmpleado(emp3);
        probarEntrevistador(ent1);
        probarEntrevistador(ent2);
        probarEntrevistador(ent3);
    }

    /**
     * Realiza una prueba a un Empleado.
     * @param e el empleado que va a ser probado
     */
    static void probarEmpleado(Empleado e) {
        e.trabajar();
        System.out.println("La clase abstraida fue: " + e.getClass().getSimpleName());
    }

    /**
     * Realiza una prueba a un programador.
     * @param p el programador que va a ser probado
     */
    public static void probarProgramador(Programer p) {
        p.programar();
        System.out.println("La clase abstraida fue: " + p.getClass().getSimpleName());
    }

    /**
     * Realiza una prueba a un entrevistador.
     * @param e el entrevistador que va a ser probado
     */
    static void probarEntrevistador(Entrevistador e) {
        e.entrevistar();
        System.out.println("La clase abstraida fue: " + e.getClass().getSimpleName());
    }
}
