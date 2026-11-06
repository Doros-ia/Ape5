import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// APE 5 - Ejercicio 2: Escribir informacion en un fichero
// Integrante: Brishy Ashanga
// Nota: estudiantes.txt tiene que existir antes de ejecutar

public class EscribirFichero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escriba un mensaje: ");
        String mensaje = teclado.nextLine();

        try {
            // con true se agrega al final y no se borra lo que ya habia
            FileWriter escritor = new FileWriter("estudiantes.txt", true);
            escritor.write(mensaje + "\n");
            escritor.close();
            System.out.println("La informacion se guardo correctamente");
        } catch (IOException e) {
            System.out.println("No se pudo escribir en el archivo");
        }

        teclado.close();
    }
}
