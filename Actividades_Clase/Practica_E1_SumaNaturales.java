package Actividades5;

// Autor: Johnny Ceron
import java.util.Scanner;

public class Practica_E1_SumaNaturales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese n (entero positivo): ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Error: n debe ser mayor o igual que 1.");
        } else {
            // for: se sabe exactamente cuantas veces se repite (n veces)
            long suma = 0;
            for (int i = 1; i <= n; i++) {
                suma += i;
            }

            // Comparacion con la formula de Gauss
            long formula = (long) n * (n + 1) / 2;

            System.out.println("Suma con ciclo: " + suma);
            System.out.println("Suma con formula n(n+1)/2: " + formula);
            System.out.println("Coinciden: " + (suma == formula));
        }

        sc.close();
    }
}