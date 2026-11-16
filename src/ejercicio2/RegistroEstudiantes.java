import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Ejercicios APE clase 2 - Ejercicio 1: Registro de estudiantes y calificaciones
 * @author Antony Casillas
 */
public class RegistroEstudiantes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("estudiantes.txt"));

            for (int i = 1; i <= 3; i++) {
                System.out.println("Estudiante " + i);
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Calificacion: ");
                double nota = Double.parseDouble(sc.nextLine());

                // cada estudiante ocupa dos lineas: nombre y nota
                bw.write("Nombre: " + nombre);
                bw.newLine();
                bw.write("Calificacion: " + nota);
                bw.newLine();
            }

            bw.close();
            System.out.println("Datos guardados en estudiantes.txt");
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
        sc.close();
    }
}
