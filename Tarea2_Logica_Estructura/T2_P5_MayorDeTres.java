package Tarea2;
import java.util.Locale;
import java.util.Scanner;

public class T2_P5_MayorDeTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.print("Ingrese tres numeros distintos: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == b || a == c || b == c) {
            System.out.println("Error: los tres numeros deben ser distintos.");
        } else {
            // PROCESO: se ordena con condicionales anidados
            double mayor, medio, menor;
            if (a > b) {
                if (b > c) {          // a > b > c
                    mayor = a; medio = b; menor = c;
                } else if (a > c) {   // a > c > b
                    mayor = a; medio = c; menor = b;
                } else {              // c > a > b
                    mayor = c; medio = a; menor = b;
                }
            } else {
                if (a > c) {          // b > a > c
                    mayor = b; medio = a; menor = c;
                } else if (b > c) {   // b > c > a
                    mayor = b; medio = c; menor = a;
                } else {              // c > b > a
                    mayor = c; medio = b; menor = a;
                }
            }

            // SALIDA
            System.out.printf("De mayor a menor: %.2f, %.2f, %.2f%n", mayor, medio, menor);
        }

        sc.close();
    }
}