//Nombre : Johnny Ceron
//NRC: 37712
//Fecha: 29/10/2026
//Ejercicio 1:
package Laboratorio2;

import java.util.Locale;
import java.util.Scanner;

public class Lab2_E5_Ceron {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double saldo = 500.00;
        int opcion;

        
        do {
            System.out.println();
            System.out.println("--- CAJERO AUTOMATICO ---");
            System.out.println("1. CONSULTAR SALDO");
            System.out.println("2. DEPOSITAR");
            System.out.println("3. RETIRAR");
            System.out.println("0. SALIR");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("Saldo: $%.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Deposito aceptado.");
                    } else {
                        System.out.println("Monto invalido.");
                    }
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double retiro = sc.nextDouble();
                    if (retiro <= 0 || retiro > saldo) {
                        System.out.println("Fondos insuficientes o monto invalido.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro aceptado.");
                    }
                    break;
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}

