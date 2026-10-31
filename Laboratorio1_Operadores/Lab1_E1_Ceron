package Laboratorio1;

import java.util.Locale;
import java.util.Scanner;

public class Lab1_E1_Ceron {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // punto decimal en entrada y salida
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.print("INGRESE SU TEMPERETURA EN CELSIUS: ");
        double celsius = sc.nextDouble();

        // PROCESO 
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        double kelvin = celsius + 273.15;

        // SALIDA
        System.out.printf("%-12s%10.2f%n", "Celsius", celsius);
        System.out.printf("%-12s%10.2f%n", "Fahrenheit", fahrenheit);
        System.out.printf("%-12s%10.2f%n", "Kelvin", kelvin);

        sc.close();
    }
}
