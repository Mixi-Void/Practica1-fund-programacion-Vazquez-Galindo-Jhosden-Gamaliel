import java.util.Scanner;

public class estacionamiento {
    public static void main(String[] args) {
        final double TARIFA_MOTO = 10;
        final double TARIFA_AUTO = 20;
        final double TARIFA_CAMIONETA = 30;
        final double DESC_5_HORAS = 0.10;
        final double DESC_10_HORAS = 0.20;
        final int HORAS_1 = 5;
        final int HORAS_2 = 10;

        Scanner sc = new Scanner(System.in);
        int tipo;
        double horas;
        String vehiculo;
        double tarifa;
        double subtotal;
        double descuento;
        double total;

        System.out.println(" COBRO DE ESTACIONAMIENTO ");
        System.out.print("Tipo de vehiculo (1 = motocicleta, 2 = automovil, 3 = camioneta): ");
        tipo = sc.nextInt();
        System.out.print("Horas estacionado: ");
        horas = sc.nextDouble();

        if (tipo < 1 || tipo > 3) {
            System.out.println("Tipo de vehiculo no valido.");
        } else if (horas <= 0) {
            System.out.println("La cantidad de horas no es valida.");
        } else {
            if (tipo == 1) {
                vehiculo = "Motocicleta";
                tarifa = TARIFA_MOTO;
            } else if (tipo == 2) {
                vehiculo = "Automovil";
                tarifa = TARIFA_AUTO;
            } else {
                vehiculo = "Camioneta";
                tarifa = TARIFA_CAMIONETA;
            }

            subtotal = tarifa * horas;
            descuento = 0;

            if (horas > HORAS_2) {
                descuento = subtotal * DESC_10_HORAS;
            } else if (horas > HORAS_1) {
                descuento = subtotal * DESC_5_HORAS;
            }
            total = subtotal - descuento;
            System.out.println();
            System.out.println("Tipo de vehiculo: " + vehiculo);
            System.out.println("Horas: " + horas);
            System.out.println("Tarifa por hora: " + tarifa);
            System.out.println("Subtotal: " + subtotal);
            System.out.println("Descuento: " + descuento);
            System.out.println("Total a pagar: " + total);
        }
    }
}