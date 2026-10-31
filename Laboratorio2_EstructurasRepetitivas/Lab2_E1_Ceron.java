
//Nombre : Johnny Ceron
//NRC: 37712
//Fecha: 29/10/2026
//Ejercicio 1:
package Laboratorio2;

public class Lab2_E1_Ceron {
    public static void main(String[] args) {
        // Ciclo externo: una vuelta por cada fila (1 a 10)
        for (int i = 1; i <= 10; i++) {
            // Ciclo interno: una vuelta por cada columna (1 a 10)
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j); // ancho fijo de 4 para alinear a la derecha
            }
            System.out.println(); // salto de linea al terminar la fila
        }
    }
}
