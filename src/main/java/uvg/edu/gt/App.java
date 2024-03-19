package uvg.edu.gt;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Leo leo = new Leo();
        UVGBST<Association<String, String>> arbol = new UVGBST<>();
        String dirDic = "/home/juan/Documentos/diccionario.txt";
        leo.llenarArbol(dirDic, arbol);
        String dirTexto = "/home/juan/Documentos/texto.txt";
        List<String> textoaT = leo.leerArchivo(dirTexto);

        System.out.println("Recorido in-order de el diccionario:");
        arbol.inOrderTraversal();

        System.out.println("\nTexto traducido:");
        for (String linea : textoaT) {
            String[] textoaT2 = linea.split(" ");

            for (String palabra : textoaT2) {
                Association<String, String> palaso = new Association<>(palabra, "");
                String traduccion = arbol.get(palaso) != null ? arbol.get(palaso).getData() : null;
                if (traduccion != null) {
                    System.out.print(traduccion + " ");
                } else {
                    System.out.print("*" + palabra + "* ");
                }
            }
            System.out.println("");
        }

    }
}
