package Tarea2;
import java.util.Locale;
import java.util.Scanner;

public class T2_P2_DescuentoVolumen {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Tarifas declaradas como constantes
        final double PRECIO_SACO = 8.50;
        final double DESCUENTO_MEDIO = 0.05; // 21 a 50 sacos
        final double DESCUENTO_ALTO = 0.10;  // mas de 50 sacos
        final double IVA = 0.15;

        // ENTRADA
        System.out.print("Cantidad de sacos de cemento: ");
        int sacos = sc.nextInt();

        if (sacos < 1) {
            System.out.println("Error: la cantidad debe ser al menos 1 saco.");
        } else {
            // PROCESO
            double subtotal = sacos * PRECIO_SACO;
            double tasaDescuento;
            if (sacos <= 20) {
                tasaDescuento = 0.0;
            } else if (sacos <= 50) {
                tasaDescuento = DESCUENTO_MEDIO;
            } else {
                tasaDescuento = DESCUENTO_ALTO;
            }
            double descuento = subtotal * tasaDescuento;
            double baseImponible = subtotal - descuento;
            double valorIva = baseImponible * IVA;
            double total = baseImponible + valorIva;

            // SALIDA
            System.out.printf("%-22s%10.2f%n", "Subtotal", subtotal);
            System.out.printf("%-22s%10.2f%n", "Descuento " + (int) Math.round(tasaDescuento * 100) + "%", descuento);
            System.out.printf("%-22s%10.2f%n", "Base imponible", baseImponible);
            System.out.printf("%-22s%10.2f%n", "IVA 15%", valorIva);
            System.out.printf("%-22s%10.2f%n", "TOTAL", total);
        }

        sc.close();
    }
}