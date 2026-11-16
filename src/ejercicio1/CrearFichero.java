import java.io.File;
import java.io.IOException;

/**
 * APE 5 - Ejercicio 1: Crear un fichero en Java
 * Autor: Dorian Calderon
 */
public class CrearFichero {

    public static void main(String[] args) {
        // objeto File que representa el archivo curso.txt
        File archivo = new File("curso.txt");

        try {
            // createNewFile devuelve true si lo creo y false si ya estaba
            if (archivo.createNewFile()) {
                System.out.println("El archivo se creo correctamente");
            } else {
                System.out.println("El archivo ya existe");
            }
            System.out.println("Nombre del archivo: " + archivo.getName());
        } catch (IOException e) {
            System.out.println("Ocurrio un error al crear el archivo: " + e.getMessage());
        }
    }
}
