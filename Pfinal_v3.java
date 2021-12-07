public class Pfinal {
    public static double pregAB(String Servicio, int kilos){ // precio de cada servicio por kilo
        double costo=0;
        int elemento;

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

    public static double Entrega(String Servicio, int kilos, String Entrega){  //precio con cargo de S/ 2.0 si solicita entrega a domicilio
        double pago;
        double precio = pregAB(Servicio, kilos);
        if (Entrega.equals("Si")) pago = precio+2;
        else pago=precio;
        return  pago;
    }

    public static double TipoDePago(String pago, String Servicio, int kilos, String Entrega){ // precio con cargo si usa Tarjeta para pagar
        Double precio2= Entrega(Servicio, kilos, Entrega);
        double cargo;
        double PagoFinal;
        if (pago.equals("Tarjeta")){
            cargo=(precio2*5)/100.00;
            PagoFinal=precio2+cargo;
        }
        else PagoFinal=precio2;
        return PagoFinal;
    }

    public static double Promocion(String Cliente, int visitas, String Servicio, int kilos, String Entrega, String pago){
        double precio3= TipoDePago(pago, Servicio, kilos, Entrega);
        int divisor=6;
        int elemento;
        double pagoT=0;
        for (int i=1; i<=visitas; i++){
            elemento=i%divisor;
            if (elemento==0){
                pagoT=0.0;
               //System.out.println("estimado " +Cliente + " por su visita N°" +i + " ,el servicio será gratis, gracias por su preferencia");
            }
            else pagoT=precio3;//System.out.println("En la visita N°"+i+ " el pago fue de S/"+precio3); // Imprime el historial de pagos y servicio gratis que tuvo en "X" visitas.
        }
        return pagoT;
    }

        public static void TrabajoFinal () {
            String Servicio = "LAgua";
            int kilos = 2;
            String Entrega="Si";
            String pago ="Efectivo";
            String Cliente ="Don Java";
            int visitas = 13;

            double precio = pregAB(Servicio, kilos);
            //System.out.println("El precio por el servicio es de S/" + precio);    // precio de cada servicio por kilo
            Double precio2= Entrega(Servicio, kilos, Entrega);
            //System.out.println("El precio es de S/"+precio2);      //precio con cargo de S/ 2.0 si solicita entrega a domicilio
            double precio3= TipoDePago(pago, Servicio, kilos, Entrega);
            //System.out.println("El precio total es de S/"+precio3);      // precio con cargo si usa Tarjeta para pagar
            double PagoT= Promocion(Cliente, visitas, Servicio, kilos, Entrega, pago); // Pago final teniendo en cuenta si le toca el servicio gratis
            if (PagoT==0.0) System.out.println("estimado " +Cliente + ", el servicio será gratis, gracias por su preferencia.");
            else System.out.println("Estimado "+Cliente+ ", el costo total del servicio es de S/"+PagoT);
        }
        public static void main (String[]args) {
            TrabajoFinal();
        }
}