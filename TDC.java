import java.util.Scanner;

public class TDC {
    public static void main(String[] args) {
        final double DESC_NORMAL = 0.00;
        final double DESC_FRECUENTE = 0.10;
        final double DESC_VIP = 0.20;
        final double DESC_EXTRA = 0.05;
        final double PRECIO_EXTRA = 2000;

        Scanner sc = new Scanner(System.in);
        String nombre;
        String tipoCliente;
        double precio;
        int tipo;
        double porcentaje;
        double descTipo;
        double descExtra;
        double total;

        System.out.println(" TIENDA CON DESCUENTOS ");
        System.out.print("Nombre del cliente: ");
        nombre = sc.nextLine();
        System.out.print("Monto de la compra: ");
        precio = sc.nextDouble();
        System.out.print("Tipo de cliente (1 = normal, 2 = frecuente, 3 = VIP): ");
        tipo = sc.nextInt();

        if (tipo < 1 || tipo > 3) {
            System.out.println("Tipo de cliente no valido.");
        } else if (precio <= 0) {
            System.out.println("El monto de la compra no es valido.");
        } else {
            if (tipo == 1) {
                tipoCliente = "Normal";
                porcentaje = DESC_NORMAL;
            } else if (tipo == 2) {
                tipoCliente = "Frecuente";
                porcentaje = DESC_FRECUENTE;
            } else {
                tipoCliente = "VIP";
                porcentaje = DESC_VIP;
            }

            descTipo = precio* porcentaje;
            descExtra = 0;
            if (precio > PRECIO_EXTRA) {
                descExtra = precio * DESC_EXTRA;
            }

            total = precio- descTipo - descExtra;

            System.out.println();
            System.out.println("Cliente: " + nombre + " (" + tipoCliente + ")");
            System.out.println("precio original: " + precio);
            System.out.println("Descuento por tipo de cliente (" + (porcentaje * 100) + "%): " + descTipo);
            System.out.println("Descuento adicional (" + (DESC_EXTRA * 100) + "%): " + descExtra);
            System.out.println("Total a pagar: " + total);
        }
    }
}