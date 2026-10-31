package Laboratorio1;


public class Lab1_E5_Ceron {
    public static void main(String[] args) {

        int a = 9, b = 4;
        int respuesta1 = a / b + a % b * 2;

        boolean respuesta2 = 10 - 3 * 2 > 3 && 5 % 2 == 1;

        double respuesta3 = (double) 7 / 2 + 7 / 2;

        boolean respuesta4 = !(4 >= 4) || 2 * 3 != 6;

        System.out.println("1. a / b + a % b * 2 = " + respuesta1);
        System.out.println("2. 10 - 3 * 2 > 3 && 5 % 2 == 1 = " + respuesta2);
        System.out.println("3. (double) 7 / 2 + 7 / 2 = " + respuesta3);
        System.out.println("4. !(4 >= 4) || 2 * 3 != 6 = " + respuesta4);
    }
}
