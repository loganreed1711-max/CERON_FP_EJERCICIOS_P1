package Tarea2;
import java.util.Scanner;

public class T2_P4_HoraSiguiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.print("Ingrese la hora (hh mm ss): ");
        int horas = sc.nextInt();
        int minutos = sc.nextInt();
        int segundos = sc.nextInt();

        // VALIDACION DE RANGOS
        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59
                || segundos < 0 || segundos > 59) {
            System.out.println("Error: horas 0-23, minutos 0-59 y segundos 0-59.");
        } else {
            // PROCESO: se suma un segundo y se propaga el acarreo
            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                    if (horas == 24) {
                        horas = 0;
                    }
                }
            }

            // SALIDA
            System.out.printf("Un segundo despues: %02d:%02d:%02d%n", horas, minutos, segundos);
        }

        sc.close();
    }
}