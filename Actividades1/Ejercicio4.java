package Actividades1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Minutos: ");
        int total = sc.nextInt();

        int horas = total / 60;
        int minutos = total % 60;

        System.out.println(horas + " h " + minutos + " min");
        sc.close();
    }
}