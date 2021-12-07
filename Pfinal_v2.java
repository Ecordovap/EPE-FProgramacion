public class Pfinal {
    public static double pregAB(String Servicio, int kilos, String Entrega){
        double costo=0;
        int elemento=0;

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

    public static void TipoDePago(String pago, String Servicio, int kilos, String Entrega){
        double precio = pregAB(Servicio, kilos, Entrega);
        double cargo;
        double PagoFinal;
        if (pago.equals("Tarjeta")){
            cargo=(precio*5)/100.00;
            PagoFinal=precio+cargo;
            System.out.println("Estimado cliente al pagar con Tarjeta se le realizará un cargo extra del 5%, por lo cual el precio total es de S/"+PagoFinal);
        }
        else System.out.println("Estimado cliente el precio total al pagar con efectivo es de S/"+precio);
    }

    public static void Promocion(String Cliente, int visitas){
        int divisor=6;
        int elemento;
        for (int i=1; i<=visitas; i++){
            elemento=i%divisor;
            if (elemento==0){
                System.out.println("estimado " +Cliente + " Ud. cuenta con un servicio gratis, gracias por su preferencia");
            }
        }
    }

        public static void TrabajoFinal () {
            String Servicio = "LAgua";
            String Entrega="si";
            int kilos = 20;
            String pago ="Tarjeta";
            String Cliente ="Don Java";
            int visitas = 6;

            double precio = pregAB(Servicio, kilos, Entrega);
            System.out.println("El precio es de S/" + precio);
            TipoDePago(pago, Servicio, kilos, Entrega);
            Promocion(Cliente, visitas);

            /*int num=7;
            int num2=6;
            double f=num%num2;
            System.out.println(f);*/
        }
        public static void main (String[]args){
            TrabajoFinal();
        }
}
