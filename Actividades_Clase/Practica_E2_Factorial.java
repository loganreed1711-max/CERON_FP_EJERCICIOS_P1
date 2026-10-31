package Actividades5;

// Autor: Johnny Ceron
import java.util.Scanner;

public class Practica_E2_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        // do-while: se pide el dato al menos una vez y se repite si no es valido
        // (el limite 20 evita que el resultado desborde el tipo long)
        do {
            System.out.print("Ingrese n (0 a 20): ");
            n = sc.nextInt();
            if (n < 0 || n > 20) {
                System.out.println("Valor invalido: n debe estar entre 0 y 20.");
            }
        } while (n < 0 || n > 20);

        long factorial = 1; // el factorial de 0 es 1
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(n + "! = " + factorial);

        sc.close();
    }
}