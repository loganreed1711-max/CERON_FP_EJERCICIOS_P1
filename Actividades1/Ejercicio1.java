package Actividades1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Base: ");
        double base = teclado.nextDouble();
        System.out.print("Altura: ");
        double altura = teclado.nextDouble();

        System.out.println("Área: " + (base * altura));
        System.out.println("Perímetro: " + (2 * (base + altura)));
        teclado.close();
    }
}