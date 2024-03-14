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
        String dirDic = "/home/juan/Documentos/education/U/Semestres/Semestre_9/Algoritmos y Estructura/HDT7_binary_searsh_tree/idea/src/main/java/uvg/edu/gt/Diccionario.txt";
        leo.llenarArbol(dirDic, arbol);
        String dirTexto = "/home/juan/Documentos/education/U/Semestres/Semestre_9/Algoritmos y Estructura/HDT7_binary_searsh_tree/idea/src/main/java/uvg/edu/gt/Texto.txt";
        List<String> textoaT = leo.leerArchivo(dirTexto);

        System.out.println("\nTexto traducido:");
        for (String linea : textoaT) {
        String[] textoaT2 = linea.split(" ");

        for (String palabra : textoaT2) {

            //String traduccion = arbol.get(palabra);
            if (traduccion != null) {
                System.out.print(traduccion + " ");
            } else {
                System.out.print("*" + palabra + "* ");
            }
        }
    }
    }
}
