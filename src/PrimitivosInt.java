public class PrimitivosInt {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en bytes a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println("El valor minimo es un byte es: " + Byte.MIN_VALUE);
        System.out.println("El valor maximo es un byte es: " + Byte.MAX_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en bytes a " + Short.BYTES);
        System.out.println("tipo short corresponde en bits a " + Short.SIZE);
        System.out.println("El valor minimo es un short es: " + Short.MIN_VALUE);
        System.out.println("El valor maximo es un short es: " + Short.MAX_VALUE);


        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en bytes a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("El valor minimo de un int es: " + Integer.MIN_VALUE);
        System.out.println("El valor maximo de un int es: " + Integer.MAX_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en bytes a " + Long.BYTES);
        System.out.println("tipo long corresponde en bits a " + Long.SIZE);
        System.out.println("El valor minimo de un long es: " + Long.MIN_VALUE);
        System.out.println("El valor maximo de un long es: " + Long.MAX_VALUE);

    }
}
