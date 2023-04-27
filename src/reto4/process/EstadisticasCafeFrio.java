package reto4.process;
/**
 * Clase encargada de procesar los datos y obtener las estadísticas requeridas.
 */
public class EstadisticasCafeFrio {

    private int[][] ventas; // Arreglo para almacenar las ventas de cada sabor de café frío por trimestre.

    /**
     * Constructor de la clase EstadisticasCafeFrio.
     * Inicializa el arreglo de ventas con los valores indicados en el enunciado.
     */
    public EstadisticasCafeFrio() {
        ventas = new int[][]{
                {111, 483, 471, 427},
                {192, 500, 355, 158},
                {289, 470, 474, 160},
                {415, 114, 161, 308}
        };
    }

    /**
     * Método que retorna el trimestre que más se vende de un determinado sabor de café frío.
     * @param sabor El sabor del café frío (Chocolate, Vainilla, Fresa, Oreo).
     * @return El trimestre que más se vende del sabor de café frío indicado.
     */
    public String trimestreMasVendido(String sabor) {
        int fila = 0;
        switch (sabor) {
            case "Chocolate":
                fila = 0;
                break;
            case "Vainilla":
                fila = 1;
                break;
            case "Fresa":
                fila = 2;
                break;
            case "Oreo":
                fila = 3;
                break;
            default:
                throw new IllegalArgumentException("Sabor de café frío inválido.");
        }
        int maxVentas = ventas[fila][0];
        int trimestreMasVendido = 1;
        for (int i = 1; i < 4; i++) {
            if (ventas[fila][i] > maxVentas) {
                maxVentas = ventas[fila][i];
                trimestreMasVendido = i + 1;
            }
        }
        return "El trimestre que más se vende de " + sabor + " es el trimestre " + trimestreMasVendido;
    }

    /**
     * Método que retorna el trimestre que más producto se vende en general.
     * @return El trimestre que más producto se vende en general.
     */
    public String trimestreMasVendidoEnGeneral() {
        int maxVentas = ventas[0][0] + ventas[1][0] + ventas[2][0] + ventas[3][0];
        int trimestreMasVendido = 1;
        for (int i = 1; i < 4; i++) {
            int ventasTrimestre = ventas[0][i] + ventas[1][i] + ventas[2][i] + ventas[3][i];
            if (ventasTrimestre > maxVentas) {
                maxVentas = ventasTrimestre;
                trimestreMasVendido = i + 1;
            }
        }
        return "El trimestre que más producto se vende en general es el trimestre " + trimestreMasVendido;
    }
}

