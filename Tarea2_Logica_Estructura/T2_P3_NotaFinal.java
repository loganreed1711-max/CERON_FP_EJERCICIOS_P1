package Tarea2;
import java.util.Locale;
import java.util.Scanner;

public class T2_P3_NotaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.print("Nota parcial 1 (0-20): ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota parcial 2 (0-20): ");
        double nota2 = sc.nextDouble();
        System.out.print("Nota parcial 3 (0-20): ");
        double nota3 = sc.nextDouble();

        boolean notasValidas = nota1 >= 0 && nota1 <= 20
                && nota2 >= 0 && nota2 <= 20
                && nota3 >= 0 && nota3 <= 20;

        if (!notasValidas) {
            System.out.println("Error: cada nota debe estar entre 0 y 20.");
        } else {
            // PROCESO
            double promedio = (nota1 + nota2 + nota3) / 3.0;
            String estado;
            if (promedio >= 14) {
                estado = "Aprobado";
            } else if (promedio >= 9) {
                estado = "Supletorio";
            } else {
                estado = "Reprobado";
            }

            // SALIDA
            System.out.printf("Promedio: %.2f%n", promedio);
            System.out.println("Estado: " + estado);
        }

        sc.close();
    }
}