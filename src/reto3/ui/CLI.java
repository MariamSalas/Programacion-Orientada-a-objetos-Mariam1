package reto3.ui;
import reto3.proceso.Conversor;
import reto6.process.ZeroCharacterException;

import java.util.Scanner;
public class CLI {

    public static void showmenu(){
        Scanner input = new Scanner(System.in);
        char option;
        String convertirnumero ;

        System.out.println("Conversor" +
                "\n1)Convertir de decimal a binaria." +
                "\n2)Convertir de decimal a octal." +
                "\n3)Convertir de decimal a hexadecimal." +
                "\n4)Convertir de binario a decimal." +
                "\n5)Convertir de octal a decimal." +
                "\n6)Convertir de hexadecimal a octal.");

        do{
            System.out.println("Elge una opcion: ");
            option = input.nextLine().charAt(0);
            System.out.println("Ingrese el número a convertir");
            convertirnumero = input.nextLine();

            switch(option){
                case '1':
                    System.out.println(Conversor.DecimalaBinOctHex(convertirnumero, (byte)2));
                    break;
                case '2':
                    System.out.println(Conversor.DecimalaBinOctHex(convertirnumero, (byte)8));
                    break;
                case '3':
                    System.out.println(Conversor.DecimalaBinOctHex(convertirnumero, (byte)16));
                    break;
                case '4':
                    System.out.println(Conversor.BinOctHexaDecimal(convertirnumero, (byte)2));
                    break;
                case '5':
                    System.out.println(Conversor.BinOctHexaDecimal(convertirnumero, (byte)8));
                    break;
                case '6':
                    System.out.println(Conversor.BinOctHexaDecimal(convertirnumero, (byte)16));
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción válida.");
                    break;
            }

            System.out.println("¿Quieres hacer otra conversión? " +
                    "\nS) Sí." +
                    "\nN) No.");
            option = leerOpcion(input);

        } while (Character.toUpperCase(option) == 'S');
    }

    private static char leerOpcion(Scanner input) {
        String userInput;
        char option;

        do {
            System.out.println("Ingrese una opción válida:");
            userInput = input.nextLine();
        } while (userInput.isEmpty());

        option = Character.toUpperCase(userInput.charAt(0));

        return option;
    }
}






