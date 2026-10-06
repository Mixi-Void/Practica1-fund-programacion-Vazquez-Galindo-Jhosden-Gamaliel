import java.util.Scanner;

public class cajeroComision {
    public static void main(String[] args) {
        final double COMISION = 10;
        final double LIMITE_RETIRO = 5000;

        Scanner sc = new Scanner(System.in);
        double saldo;
        double retiro;

        System.out.println(" CAJERO CON COMISION ");
        System.out.print("Saldo disponible: ");
        saldo = sc.nextDouble();
        System.out.print("Cantidad a retirar: ");
        retiro = sc.nextDouble();

        if (retiro > 0 && retiro <= LIMITE_RETIRO && saldo >= retiro + COMISION) {
            double totalDes = retiro + COMISION;
            double saldoFinal = saldo - totalDes;

            System.out.println("Retiro autorizado.");
            System.out.println("Monto retirado: " + retiro);
            System.out.println("Comision: " + COMISION);
            System.out.println("Total descontado: " + totalDes);
            System.out.println("Saldo final: " + saldoFinal);
        } else {
            System.out.println("Retiro rechazado.");
            if (retiro <= 0) {
                System.out.println("Motivo: la cantidad debe ser mayor a cero.");
            } else if (retiro > LIMITE_RETIRO) {
                System.out.println("Motivo: supera el limite de " + LIMITE_RETIRO);
            } else {
                System.out.println("Motivo: saldo insuficiente para el retiro y la comision de " + COMISION);
            }
            System.out.println("Su saldo es: " + saldo);
        }
    }
}
