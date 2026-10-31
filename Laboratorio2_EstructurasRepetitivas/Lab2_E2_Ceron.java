
//Nombre : Johnny Ceron
//NRC: 37712
//Fecha: 29/10/2026
//Ejercicio 1:
package Laboratorio2;

import java.util.Locale;
import java.util.Scanner;

public class Lab2_E2_Ceron {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // punto decimal en entrada y salida
        Scanner sc = new Scanner(System.in);

        // Contador y acumulador se inicializan justo antes del ciclo
        int contador = 0;
        double suma = 0;
        double maximo = 0;
        double minimo = 0;

        // Primera lectura (fuera del ciclo) para poder evaluar el centinela
        System.out.print("Lectura (negativo para terminar): ");
        double lectura = sc.nextDouble();

        // while: no se sabe cuantas lecturas habra, depende del centinela
        while (lectura >= 0) {
            contador++;
            suma += lectura;

            if (contador == 1) {
                // El maximo y el minimo arrancan con la primera lectura valida
                maximo = lectura;
                minimo = lectura;
            } else {
                if (lectura > maximo) {
                    maximo = lectura;
                }
                if (lectura < minimo) {
                    minimo = lectura;
                }
            }

            // Se lee la siguiente lectura dentro del ciclo para que termine
            System.out.print("Lectura (negativo para terminar): ");
            lectura = sc.nextDouble();
        }

        // Caso limite: sin lecturas validas no se divide para cero
        if (contador == 0) {
            System.out.println("No hubo lecturas validas.");
        } else {
            double promedio = suma / contador;
            System.out.printf("Lecturas: %d  Promedio: %.2f  Max: %.2f  Min: %.2f%n",
                    contador, promedio, maximo, minimo);
        }

        sc.close();
    }
}
