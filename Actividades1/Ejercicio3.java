package Actividades1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de 3 cifras: ");
        int n = sc.nextInt();

        int centenas = n / 100;
        int decenas = (n / 10) % 10;
        int unidades = n % 10;

        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);
        sc.close();
    }
}