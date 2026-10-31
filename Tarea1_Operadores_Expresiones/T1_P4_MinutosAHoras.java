package Tarea1;

// Autor: Johnny Ceron
import java.util.Scanner;
 
public class T1_P4_MinutosAHoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Ingrese los minutos: ");
        int minutosTotales = sc.nextInt();
 
        int horas = minutosTotales / 60;
        int minutos = minutosTotales % 60;
 
        System.out.println(minutosTotales + " min = " + horas + " h " + minutos + " min");
 
        sc.close();
    }
}
