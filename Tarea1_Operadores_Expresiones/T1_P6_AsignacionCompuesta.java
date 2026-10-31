package Tarea1;

// Autor: Johnny Ceron
public class T1_P6_AsignacionCompuesta {
    public static void main(String[] args) {
        int x = 4;
        System.out.println("x = 4        -> x vale " + x);
 
        x *= 3;
        System.out.println("x *= 3       -> x vale " + x);
 
        x %= 5;
        System.out.println("x %= 5       -> x vale " + x);
 
        x += x++;
        System.out.println("x += x++     -> x vale " + x);
    }
}
 
