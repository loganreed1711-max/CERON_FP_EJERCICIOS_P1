package Tarea2;
import java.util.Locale;
import java.util.Scanner;

public class T2_P1_Resistencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- PROBLEMA 1: Resistencia Equivalente ---");
        System.out.print("Ingrese el valor de la Resistencia 1: ");
        double r1 = sc.nextDouble();

        System.out.print("Ingrese el valor de la Resistencia 2: ");
        double r2 = sc.nextDouble();

        System.out.print("Ingrese el tipo de conexion ('S' para Serie, 'P' para Paralelo): ");
        char conexion = sc.next().charAt(0);

        double rEquivalente = 0.0;

        if (r1 > 0 && r2 > 0) {
            if (conexion == 'S' || conexion == 's') {
                rEquivalente = r1 + r2;
                System.out.println("Proceso: Conexion en Serie (R1 + R2)");
                System.out.println("Resistencia Equivalente Total: " + rEquivalente);
            } else {
                if (conexion == 'P' || conexion == 'p') {
                    rEquivalente = (r1 * r2) / (r1 + r2);
                    System.out.println("Proceso: Conexion en Paralelo ((R1 * R2) / (R1 + R2))");
                    System.out.println("Resistencia Equivalente Total: " + rEquivalente);
                } else {
                    System.out.println("Error: Tipo de conexion no valido. Use S o P.");
                }
            }
        } else {
            System.out.println("Error: Las resistencias deben ser valores positivos mayores a cero.");
        }
        sc.close();
    }
}
