import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 Ejercicios APE clase 2 - Ejercicio 2: Registro de productos con modo append
 Hecho por: Dereck Acosta
*/
public class RegistroProductos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;

        try {
            // append = true para no borrar los productos de otras ejecuciones
            BufferedWriter bw = new BufferedWriter(new FileWriter("productos.txt", true));

            do {
                System.out.print("Nombre del producto: ");
                String nombre = sc.nextLine();
                System.out.print("Precio: ");
                double precio = Double.parseDouble(sc.nextLine());
                System.out.print("Cantidad disponible: ");
                int cantidad = Integer.parseInt(sc.nextLine());

                double total = precio * cantidad;
                System.out.println("Valor total: $" + String.format("%.2f", total));

                bw.write(nombre + " | Precio: $" + String.format("%.2f", precio)
                        + " | Cantidad: " + cantidad + " | Total: $" + String.format("%.2f", total));
                bw.newLine();

                System.out.print("Registrar otro producto? (s/n): ");
                respuesta = sc.nextLine();
            } while (respuesta.equalsIgnoreCase("s"));

            bw.close();
            System.out.println("Productos guardados en productos.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
