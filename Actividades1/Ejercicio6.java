package Actividades1;

public class Ejercicio6 {
    public static void main(String[] args) {
        int x = 4;
        x *= 3;     // x = 12
        x %= 5;     // x = 2
        x += x++;   // x = 2 + 2 = 4
        System.out.println(x);
    }
}