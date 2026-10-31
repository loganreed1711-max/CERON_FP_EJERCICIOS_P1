package Actividades5;

// Autor: Johnny Ceron
public class Practica_E6_Bacterias {
    public static void main(String[] args) {
        long poblacion = 100;
        int horas = 0;

        // while: no se sabe cuantas horas pasaran, depende de que se supere el millon
        while (poblacion <= 1000000) {
            poblacion *= 2; // se duplica cada hora
            horas++;
        }

        System.out.println("Horas necesarias: " + horas);
        System.out.println("Poblacion final: " + poblacion);
    }
}