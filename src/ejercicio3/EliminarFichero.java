import java.io.File;

/**
 * APE 5 - Ejercicio 3: Eliminar un fichero en Java
 * @author Antony Casillas
 */
public class EliminarFichero {

    public static void main(String[] args) {
        File archivo = new File("estudiantes.txt");

        boolean eliminado = archivo.delete();

        if (eliminado) {
            System.out.println("El archivo " + archivo.getName() + " fue eliminado");
        } else {
            System.out.println("No se pudo eliminar " + archivo.getName() + ", revise que exista y que no este abierto");
        }
    }
}
