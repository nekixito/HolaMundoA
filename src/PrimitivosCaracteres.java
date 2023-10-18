public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("caracter == decimal : " + (caracter==decimal));
        
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo == caracter : " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en \t byte = " + System.lineSeparator() + Character.BYTES);
        System.out.println("char corresponde en bits = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);

    }
}
