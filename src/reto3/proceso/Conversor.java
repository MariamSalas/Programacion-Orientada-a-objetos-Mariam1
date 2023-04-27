package reto3.proceso;
/**
 * Clase que realiza las conversiones entre bases numéricas.
 */
public class Conversor {

    /**
     * Convierte un número decimal a binario.
     * @param decimal el número decimal a convertir.
     * @return el número en binario.
     */
    public static String decimalToBinary(int decimal) {
        String binary = "";
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal /= 2;
        }
        return binary;
    }

    /**
     * Convierte un número decimal a octal.
     * @param decimal el número decimal a convertir.
     * @return el número en octal.
     */
    public static String decimalToOctal(int decimal) {
        String octal = "";
        while (decimal > 0) {
            int remainder = decimal % 8;
            octal = remainder + octal;
            decimal /= 8;
        }
        return octal;
    }

    /**
     * Convierte un número decimal a hexadecimal.
     * @param decimal el número decimal a convertir.
     * @return el número en hexadecimal.
     */
    public static String decimalToHexadecimal(int decimal) {
        String hexadecimal = "";
        while (decimal > 0) {
            int remainder = decimal % 16;
            if (remainder < 10) {
                hexadecimal = remainder + hexadecimal;
            } else {
                hexadecimal = (char) (remainder - 10 + 'A') + hexadecimal;
            }
            decimal /= 16;
        }
        return hexadecimal;
    }

    /**
     * Convierte un número binario a decimal.
     * @param binary el número binario a convertir.
     * @return el número en decimal.
     */
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = binary.length() - 1, j = 0; i >= 0; i--, j++) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, j);
        }
        return decimal;
    }

    /**
     * Convierte un número octal a decimal.
     * @param octal el número octal a convertir.
     * @return el número en decimal.
     */
    public static int octalToDecimal(String octal) {
        int decimal = 0;
        for (int i = octal.length() - 1, j = 0; i >= 0; i--, j++) {
            int digit = octal.charAt(i) - '0';
            decimal += digit * Math.pow(8, j);
        }
        return decimal;
    }

    /**
     * Convierte un número hexadecimal a decimal.
     * @param hexadecimal el número hexadecimal a convertir.
     * @return el número en decimal.
     */
    public static int hexadecimalToDecimal(String hexadecimal) {
        int decimal = 0;
        for (int i = hexadecimal.length() - 1, j = 0; i >= 0; i--, j++) {
            char digit = hexadecimal.charAt(i);
            if (digit >= '0' && digit <= '9') {
                decimal += (digit - '0') * Math.pow(16, j);
            } else if (digit >=      'A' && digit <= 'F') {
                decimal += (digit - 'A' + 10) * Math.pow(16, j);
            }
        }
        return decimal;
    }
}


