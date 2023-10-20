import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroString = JOptionPane.showInputDialog(null,"Ingrese un número entero");

        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(numeroString);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error, debe introducir un numero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);

        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);

        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexadecimal);

        int numeroHexadecimal = 0x1e;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexadecimal;
        JOptionPane.showMessageDialog(null,mensaje);

    }
}
