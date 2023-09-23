public class PrimitivosFloat {
    public static void main(String[] args) {
        float numeroFloat = 3.4028235E38F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("tipo float corresponde en bytes a " + Float.BYTES);
        System.out.println("tipo float corresponde en bits a " + Float.SIZE);
        System.out.println("El valor float minimo de un float es: " + Float.MIN_VALUE);
        System.out.println("El valor maximo de un float es: " + Float.MAX_VALUE);

        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en bits a " + Double.SIZE);
        System.out.println("El valor minimo de un double es: " + Double.MIN_VALUE);
        System.out.println("El valor maximo de un double es: " + Double.MAX_VALUE);
    }
}
