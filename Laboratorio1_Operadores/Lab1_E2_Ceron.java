package Laboratorio1;

import java.util.Scanner;

public class Lab1_E2_Ceron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.print("INGRESE EL TIEMPO TOTAL EN SEGUNDOS: ");
        int totalSegundos = sc.nextInt();

        // PROCESO
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        // SALIDA
        System.out.println("Tiempo total: " + totalSegundos + " segundos");
        System.out.println("Equivalente: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos");

        // VERIFICACION: 
        int verificacion = horas * 3600 + minutos * 60 + segundos;
        System.out.println("Verificacion: " + horas + "*3600 + " + minutos
                + "*60 + " + segundos + " = " + verificacion);
        System.out.println("Coincide con el valor leido: "
                + (verificacion  == totalSegundos));

        sc.close();
    }
}