import java.util.Scanner;

public class cajero {
    public static void main(String[] args) {
        final double LIMITE_RETIRO = 5000;
        final double SALDO_MINIMO_ADVERTENCIA = 500;

        Scanner sc = new Scanner(System.in);
double saldo;
double retiro;
double nuevoSaldo;
        System.out.println("    CAJERO AUTOMATICO    ");
        System.out.print("Saldo disponible: ");
         saldo = sc.nextDouble();
        System.out.print("Cantidad a retirar: ");
         retiro = sc.nextDouble();

        if (retiro <= 0) {
            System.out.println("Operacion rechazada: la cantidad debe ser mayor que cero.");
        } else if (retiro > LIMITE_RETIRO) {
            System.out.println("Operacion rechazada: la cantidad supera el limite de retiro ($" + LIMITE_RETIRO + ").");
        } else if (retiro > saldo) {
            System.out.println("Operacion rechazada: saldo insuficiente.");
        } else {
            nuevoSaldo = saldo - retiro;
            System.out.println("Retiro autorizado.");
            System.out.println("Efectivo entregado: $" + retiro);
            System.out.println("Saldo restante: $" + nuevoSaldo);
            if (nuevoSaldo < SALDO_MINIMO_ADVERTENCIA) {
                System.out.println("ADVERTENCIA: su saldo restante es menor a $" + SALDO_MINIMO_ADVERTENCIA + ".");
            }
        }
    }
}