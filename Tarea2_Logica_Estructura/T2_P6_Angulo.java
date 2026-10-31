package Tarea2;
import java.util.Locale;
import java.util.Scanner;

public class T2_P6_Angulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.print("Ingrese el angulo en grados: ");
        double angulo = sc.nextDouble();

        if (angulo < 0) {
            System.out.println("Error: el angulo no puede ser negativo.");
        } else {
            // PROCESO: reduccion de vueltas completas con el operador %
            if (angulo > 360) {
                angulo = angulo % 360;
                if (angulo == 0) {
                    angulo = 360; // multiplo exacto de 360: vuelta completa
                }
            }

            String tipo;
            if (angulo == 0) {
                tipo = "nulo";
            } else if (angulo < 90) {
                tipo = "agudo";
            } else if (angulo == 90) {
                tipo = "recto";
            } else if (angulo < 180) {
                tipo = "obtuso";
            } else if (angulo == 180) {
                tipo = "llano";
            } else if (angulo < 360) {
                tipo = "concavo";
            } else {
                tipo = "completo";
            }

            // SALIDA
            System.out.printf("Angulo equivalente: %.2f grados%n", angulo);
            System.out.println("Clasificacion: " + tipo);
        }

        sc.close();
    }
}