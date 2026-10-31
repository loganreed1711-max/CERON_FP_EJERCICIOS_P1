package Actividades1;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número entero: ");
        int n = sc.nextInt();

        boolean esPar = n % 2 == 0;

        System.out.println("¿Es par? " + esPar);
        if (esPar) {
            System.out.println("El número " + n + " es par");
        } else {
            System.out.println("El número " + n + " es impar");
        }
        sc.close();
    }
}