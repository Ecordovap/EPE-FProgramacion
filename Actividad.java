import groovy.json.JsonOutput;

public class Actividad {
    public static double pregAB(String Servicio, int kilos) {
        double costo = 0;
        int elemento = 0;
        for (int i = 1; i <= kilos; i++) {
            elemento = i;
            if (elemento < kilos) {
                elemento = elemento + 1;
                if (Servicio.equals("LAgua")) costo = elemento * 5;
                else if (Servicio.equals("LSeco")) costo = elemento * 7;
                else if (Servicio.equals("Secado")) costo = elemento * 3.5;
                else costo = elemento * 3; //Planchado


            }

        }
        return costo;

    }

    public static double TipoDePago(String pago) {
        double PagoFinal;
        if (pago.equals("Tarjeta")) PagoFinal = 0.5;
        else PagoFinal = 0;
        return PagoFinal;
    }


    public static double Contador(int client ) {

       int promocion = 6;
       int visita=0;
        for (int i = 0; i < promocion; i++)
            visita=i;
        while (visita >6) {
            System.out.println("noooo");
        }
        return visita ++;
    }



    public static void TrabajoFinal () {
        String Servicio = "LSeco";
        int kilos = 2;
        String pago = "Tarjeta";
        int client = 7;


        double precio = pregAB(Servicio, kilos);
        double PagoFinal = TipoDePago(pago);
        double TotalaPAgar = precio * PagoFinal + precio;
        double CodigoCliente1 = Contador(client);



        System.out.println("Estimado Cliente " + client + " recuerde que el pago con tarjeta , Tendra una recarga de 5% del precio");
        System.out.println("Sub Total es  " + precio);

        if (CodigoCliente1 > 6) {
            System.out.println("Cliente no paga");

        } else
            System.out.println("Total a pagar es " + TotalaPAgar);
    }


    public static void main (String[]args){
        TrabajoFinal();




    }
}