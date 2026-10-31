package Laboratorio1;

import java.util.Locale;
import java.util.Scanner;

public class Lab1_E4_Ceron {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double IVA = 0.15; // constante

        // ENTRADA
        System.out.print("PRODUCTO: ");
        String producto = sc.nextLine();
        System.out.print("CANTIDAD: ");
        int cantidad = sc.nextInt();
        System.out.print("PRECIO UNITARIO : ");
        double precio = sc.nextDouble();

        // PROCESO
        double subtotal = cantidad * precio;
        double valorIva = subtotal * IVA;
        double total = subtotal + valorIva;

        // SALIDA
        System.out.println();
        System.out.println(producto);
        System.out.printf("%-25s%10.2f%n", "SUBTOTAL", subtotal);
        System.out.printf("%-25s%10.2f%n", "IVA 15%", valorIva);
        System.out.printf("%-25s%10.2f%n", "TOTAL", total);

        sc.close();
    }
}