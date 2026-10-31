package Actividades5;

// Autor: Johnny Ceron
import java.util.Locale;
import java.util.Scanner;

public class Practica_E4_Temperaturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double CENTINELA = -999;
        int contador = 0;
        double suma = 0;
        double mayor = 0;
        double menor = 0;

        System.out.print("Temperatura (-999 para terminar): ");
        double temperatura = sc.nextDouble();

        // while con centinela: no se sabe cuantas lecturas habra
        while (temperatura != CENTINELA) {
            contador++;
            suma += temperatura;

            if (contador == 1) {
                mayor = temperatura; // se inician con la primera lectura
                menor = temperatura;
            } else {
                if (temperatura > mayor) {
                    mayor = temperatura;
                }
                if (temperatura < menor) {
                    menor = temperatura;
                }
            }

            System.out.print("Temperatura (-999 para terminar): ");
            temperatura = sc.nextDouble();
        }

        // Caso limite: sin lecturas no se divide para cero
        if (contador == 0) {
            System.out.println("No se ingresaron temperaturas.");
        } else {
            System.out.printf("Mayor: %.2f  Menor: %.2f  Promedio: %.2f%n",
                    mayor, menor, suma / contador);
        }

        sc.close();
    }
}