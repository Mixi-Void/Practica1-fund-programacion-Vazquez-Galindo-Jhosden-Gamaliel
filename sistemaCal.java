import java.util.Scanner;

public class sistemaCal {
        public static void main(String[] args) {
            final double MINIMO_APROBATORIO = 70;
            final double MINIMO_UNIDAD = 60;

            Scanner sc = new Scanner(System.in);
            double cal1;
            double cal2;
            double cal3;
            double promedio;

            System.out.println(" SISTEMA DE CALIFICACIONES ");
            System.out.print("Calificacion 1: ");
            cal1 = sc.nextDouble();
            System.out.print("Calificacion 2: ");
            cal2 = sc.nextDouble();
            System.out.print("Calificacion 3: ");
            cal3 = sc.nextDouble();

            promedio = (cal1 + cal2 + cal3) / 3;

            System.out.println();
            System.out.println("Unidad 1: " + cal1);
            System.out.println("Unidad 2: " + cal2);
            System.out.println("Unidad 3: " + cal3);
            System.out.println("Promedio: " + promedio);

            if (promedio >= MINIMO_APROBATORIO) {
                System.out.println(" APROBADO");
            } else {
                System.out.println(" REPROBADO");
            }

            if (cal1 < MINIMO_UNIDAD) {
                System.out.println("Debe presentar recuperacion de la unidad 1.");
            }
            if (cal2 < MINIMO_UNIDAD) {
                System.out.println("Debe presentar recuperacion de la unidad 2.");
            }
            if (cal3 < MINIMO_UNIDAD) {
                System.out.println("Debe presentar recuperacion de la unidad 3.");
            }
        }
    }
