package reto2b.ui;
import reto2b.process.Boleteria;

import java.util.Scanner;

public class CLI {

    public static void showmenu() {

        Scanner scanner = new Scanner(System.in);
        Boleteria boleteria = new Boleteria();

        char ticketType;
        double price;
        String anotherTicket = "s";

        while (anotherTicket.equalsIgnoreCase("s")) {
            System.out.print("Tipo de boleto a escoger: Adulto=A, Niño=N, INAPAM=I, Abuelito sin credencial=B : ");
            ticketType = scanner.next().charAt(0);

            price = boleteria.getPrice(ticketType);

            if (price > 0.0) {
                System.out.printf("El boleto cuesta $%.2f%n", price);
            } else {
                System.out.println("Tipo de boleto inválido.");
            }

            System.out.print("Otro boleto (s/n)? ");
            anotherTicket = scanner.next();
        }

        System.out.println("Fin del programa.");
    }


}
