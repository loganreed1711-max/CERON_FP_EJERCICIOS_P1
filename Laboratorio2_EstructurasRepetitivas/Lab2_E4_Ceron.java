//Nombre : Johnny Ceron
//NRC: 37712
//Fecha: 29/10/2026
//Ejercicio 1:
package Laboratorio2;

import java.util.Scanner;

public class Lab2_E4_Ceron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        // do-while: se pide el tamano al menos una vez y se repite si no es valido
        do {
            System.out.print("Ingrese un numero impar positivo: ");
            n = sc.nextInt();
            if (n <= 0 || n % 2 == 0) {
                System.out.println("Valor invalido: debe ser impar y positivo.");
            }
        } while (n <= 0 || n % 2 == 0);

        int mitad = n / 2; // indice de la fila central

        for (int fila = 0; fila < n; fila++) {
            // k = distancia de la fila al borde: crece hasta la mitad y luego baja
            int k = (fila <= mitad) ? fila : n - 1 - fila;
            int espacios = mitad - k;
            int asteriscos = 2 * k + 1;

            for (int e = 0; e < espacios; e++) {
                System.out.print(" ");
            }
            for (int a = 0; a < asteriscos; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
