package reto11;
import java.io.*;
import java.util.ArrayList;
/**

 Clase principal que contiene el método main para ejecutar el programa
 */
class Main {
    /**
     Método main para ejecutar el programa.

     Crea una lista de empleados, los escribe en un archivo, los lee del archivo,

     y filtra los empleados por edad.

     @param args los argumentos de línea de comando
     */
    public static void main(String[] args) {

        // Creacion implementando polimorfismo
        Empleado prog1 = new JrEngineer("Checo", 18, "TDEL231416HJB");
        Empleado prog2 = new JrEngineer("Paco", 19, "BHWY390101TI8");
        Empleado prog3 = new JrEngineer("Tony", 29, "KWAE730718MK3");
        Empleado prog4 = new JrEngineer("Jorge", 28, "MRXP161120HD2");
        Empleado prog5 = new JrEngineer("Pepe", 25, "MPPN030622PT4");
        Empleado prog6 = new JrEngineer("Jose", 27, "DJZZ381002ZK4");
        Empleado prog7 = new JrEngineer("Jesus", 30, "LIQL150320MF2");
        Empleado prog8 = new JrEngineer("Isabel", 27, "FKNK181209MK5");
        Empleado prog9 = new JrEngineer("Miguel", 21, "VQPN881013NK3");
        Empleado prog10 = new JrEngineer("Andres", 35, "BDRS500203QA2");
        Empleado prog11 = new JrEngineer("Andrea", 20, "JFBY410201IC2");
        Empleado prog12 = new JrEngineer("Iliana", 24, "CVJQ720610TY5");
        Empleado prog13 = new JrEngineer("David", 28, "EXKR091105DM4");
        Empleado prog14 = new JrEngineer("Marco", 29, "RKZB480302XA4");
        Empleado prog15 = new JrEngineer("Santiago", 27, "FGEE661124VG5");
        Empleado prog16 = new JrEngineer("Lola", 23, "EFQG720824BM0");
        Empleado prog17 = new JrEngineer("Felipe", 26, "OKSS890325MM7");
        Empleado prog18 = new JrEngineer("Carlos", 34, "UOGJ490426JD8");
        Empleado prog19 = new JrEngineer("Luis", 24, "JGOV220328DQ6");
        Empleado prog20 = new JrEngineer("Juan", 20, "UHXV881019JF4");

        ArrayList<Empleado> empleadosEscritura = new ArrayList<Empleado>();

        empleadosEscritura.add(prog1);
        empleadosEscritura.add(prog2);
        empleadosEscritura.add(prog3);
        empleadosEscritura.add(prog4);
        empleadosEscritura.add(prog5);
        empleadosEscritura.add(prog6);
        empleadosEscritura.add(prog7);
        empleadosEscritura.add(prog8);
        empleadosEscritura.add(prog9);
        empleadosEscritura.add(prog10);
        empleadosEscritura.add(prog11);
        empleadosEscritura.add(prog12);
        empleadosEscritura.add(prog13);
        empleadosEscritura.add(prog14);
        empleadosEscritura.add(prog15);
        empleadosEscritura.add(prog16);
        empleadosEscritura.add(prog17);
        empleadosEscritura.add(prog18);
        empleadosEscritura.add(prog19);
        empleadosEscritura.add(prog20);

        writeObjectsListToFile(empleadosEscritura, "listaEmpleados");

        ArrayList<Empleado> progsLectura =  readObjectsListFromFile("listaEmpleados");

        filtrarXedad(20, progsLectura);
    }

    /**

     Escribe una lista de empleados a un archivo con el nombre especificado.
     @param progs la lista de empleados a escribir
     @param fileName el nombre del archivo
     */
    static void writeObjectsListToFile(ArrayList<Empleado> progs, String fileName){
        try {
            FileOutputStream fos = new FileOutputStream(fileName + ".txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // write object to file
            for(var prog: progs){
                oos.writeObject(prog);
            }
            System.out.println("Archivo Escrito Satisfactoriamente \n");
            // closing resources
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**

     Lee una lista de empleados desde un archivo con el nombre especificado.

     @param fileName el nombre del archivo

     @return una lista de empleados leída desde el archivo
     */
    static ArrayList<Empleado> readObjectsListFromFile(String fileName){

        ArrayList<Empleado> progs = new ArrayList<Empleado>();
        try {
            FileInputStream is = new FileInputStream(fileName + ".txt");
            ObjectInputStream ois = new ObjectInputStream(is);

            while(true){
                try{
                    Empleado emp = (Empleado) ois.readObject();
                    progs.add(emp);
                }catch(Exception e){
                    ois.close();
                    break;
                }
            }

            ois.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return progs;
    }
    /**

     Filtra una lista de empleados por edad y los imprime en la salida estándar.

     @param edad la edad mínima para filtrar

     @param progs la lista de empleados a filtrar
     */
    private static void filtrarXedad(int edad, ArrayList<Empleado> progs) {

        System.out.println("Empleados con menos mas de 20 años: \n");

        for(var prog: progs) {
            if(prog.edad > edad){
                System.out.println(prog);
            }
        }
    }


}