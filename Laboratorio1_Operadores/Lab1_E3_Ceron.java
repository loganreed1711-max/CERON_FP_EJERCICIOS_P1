package Laboratorio1;

import java.util.Scanner;

public class Lab1_E3_Ceron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.print("INGRESE UN ENTERO DE CUATRO CIFRAS: ");
        int n = sc.nextInt();

        // PROCESO: extraccion de cifras con / y %
        int unidades = n % 10;
        int decenas = (n / 10) % 10;
        int centenas = (n / 100) % 10;
        int millares = (n / 1000) % 10;

        int suma = unidades + decenas + centenas + millares;
       

        int invertido = unidades * 1000 + decenas * 100 + centenas * 10 + millares;
        boolean esPar = n % 2 == 0;

        // SALIDA
        System.out.println("SUMA DE CIFRAS: " + suma);
        System.out.println("INVERTIDO: " + invertido);
        System.out.println("ES PAR: " + esPar);

        sc.close();
    }
}