package reto3.proceso;
public class Conversor  {
    public static String DecimalaBinOctHex(String decBaseNum, byte systemBase){
        String strOut = "";
        int num = 0;
        try {
            num = Integer.parseInt(decBaseNum);
        } catch (NumberFormatException e) {
            return "Opción inválida. El número decimal ingresado no es válido.";
        }
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while(num > 0){
            strOut = digits[num % systemBase] + strOut;
            num /= systemBase;
        }
        return strOut;
    }

    public static String BinOctHexaDecimal(String binOctHexBaseNum, byte systemBase){
        String strOut = "";
        int num = 0;
        for (short i = 0; i < binOctHexBaseNum.length(); ++i) {
            char c = binOctHexBaseNum.charAt(i);
            int digit = Character.digit(c, systemBase);
            if (digit == -1) {
                return "Opción inválida. El número binario/octal/hexadecimal ingresado no es válido.";
            }
            num += Math.pow(systemBase, i) * digit;
        }

        return Integer.toString(num);
    }
}

