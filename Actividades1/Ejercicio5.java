package Actividades1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();

        boolean puedePostular = edad <= 25 && promedio >= 8.5;

        System.out.println("¿Puede postular a beca? " + puedePostular);
        if (puedePostular) {
            System.out.println("Sí puede postular: tiene " + edad + " años y promedio " + promedio);
        } else {
            System.out.println("No puede postular a la beca.");
        }
        sc.close();
    }
}