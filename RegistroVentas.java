import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Ejercicios APE clase 2 - Ejercicio 3: Sistema de registro de ventas
 * Estudiante: Paola Sanchez
 */
public class RegistroVentas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double acumulado = 0;

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("ventas.txt", true));

            System.out.print("Producto (escriba fin para terminar): ");
            String producto = sc.nextLine();

            while (!producto.equalsIgnoreCase("fin")) {
                System.out.print("Precio: ");
                double precio = Double.parseDouble(sc.nextLine());
                System.out.print("Cantidad vendida: ");
                int cantidad = Integer.parseInt(sc.nextLine());

                double subtotal = precio * cantidad;
                double descuento = 0;
                if (subtotal >= 100) {
                    descuento = subtotal * 0.10; // 10% desde 100 dolares
                }
                double total = subtotal - descuento;
                acumulado += total;

                System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                System.out.println("Descuento: $" + String.format("%.2f", descuento));
                System.out.println("Total a pagar: $" + String.format("%.2f", total));
                System.out.println();

                bw.write(producto + " | " + cantidad + " x $" + String.format("%.2f", precio)
                        + " | Subtotal: $" + String.format("%.2f", subtotal)
                        + " | Descuento: $" + String.format("%.2f", descuento)
                        + " | Total: $" + String.format("%.2f", total));
                bw.newLine();

                System.out.print("Producto (escriba fin para terminar): ");
                producto = sc.nextLine();
            }

            // al final se guarda el total de todas las ventas
            bw.write("TOTAL ACUMULADO: $" + String.format("%.2f", acumulado));
            bw.newLine();
            bw.write("--------------------------------------------");
            bw.newLine();
            bw.close();

            System.out.println("Total acumulado de las ventas: $" + String.format("%.2f", acumulado));
            System.out.println("Ventas guardadas en ventas.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
