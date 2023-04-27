package reto2b.process;
public class Boleteria {

    private final double ADULT_TICKET_PRICE = 100.0;
    private final double CHILD_TICKET_PRICE = 70.0;
    private final double INAPAM_TICKET_PRICE = 50.0;

    public double getPrice(char ticketType) {
        switch (ticketType) {
            case 'A':
                return ADULT_TICKET_PRICE;
            case 'N':
                return CHILD_TICKET_PRICE;
            case 'I':
                return INAPAM_TICKET_PRICE;
            case 'B':
                return CHILD_TICKET_PRICE;
            default:
                return 0.0;
        }
    }

}