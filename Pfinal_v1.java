import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;
public class Pfinal {
    public static double pregAB(String Servicio, int kilos){
        double costo=0;
        int elemento=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Servicio: ");
        Servicio = sc.next();

        System.out.println("kilos: ");
        kilos = sc.nextInt();

        for (int i = 1; i <= kilos; i++) {
            elemento=i;
            if (elemento<kilos) {
                elemento = elemento + 1;
                 if (Servicio.equals("LAgua")) costo = elemento * 5;
                 else if (Servicio.equals("LSeco")) costo = elemento * 7;
                 else if (Servicio.equals("Secado")) costo = elemento * 3.5;
                 else costo = elemento * 3; //Planchado
            }
        }
            return costo;
        }
        public static void TrabajoFinal () {
            String Servicio = " ";
            int kilos = 0;

            double precio = pregAB(Servicio, kilos);
            System.out.println("El precio es de S/" + precio);
        }
        public static void main (String[]args){
            TrabajoFinal();
        }
}