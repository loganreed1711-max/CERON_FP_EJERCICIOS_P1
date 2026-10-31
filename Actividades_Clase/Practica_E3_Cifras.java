package Actividades5;

// Autor: Johnny Ceron
import java.util.Scanner;

public class Practica_E3_Cifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        int n = Math.abs(numero); // se trabaja con el valor positivo
        int cantidad = 0;
        int suma = 0;

        if (n == 0) {
            cantidad = 1; // el cero tiene una cifra
        }

        // while: no se sabe cuantas cifras tiene; se repite mientras queden cifras
        while (n > 0) {
            suma += n % 10; // ultima cifra
            n /= 10;        // se elimina la ultima cifra
            cantidad++;
        }

        System.out.println("Numero: " + numero);
        System.out.println("Cantidad de cifras: " + cantidad);
        System.out.println("Suma de las cifras: " + suma);

        sc.close();
    }
}