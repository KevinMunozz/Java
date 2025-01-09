
package test;

import static manejoarchivos.ManejoArchivos.*;


public class TestManejoArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "prueb.txt";//tambien se puede poner una ruta
       // crearArchivo(nombreArchivo);
       //escribirArchivo(nombreArchivo,"hola desde Java");
       //anexarArchivo(nombreArchivo,"adios");
       leerArchivo(nombreArchivo);
    }
}
