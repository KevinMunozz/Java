package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();//guarda el orden en que se inserto lo elementos
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("viernes");

        //imprimir(miLista);
        Set miSet = new HashSet();
        //no guarda el orden en el que se inserto
        //no se puede puede duplicar elementos
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        //imprimir(miSet);
        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        //la key puede ser cualquier tipo
        //se relaciona con un diccionario (key,values)
        miMapa.put("valor2", "Mario");
        miMapa.put("valor3", "karla");
        String elemento = (String) miMapa.get("valor2");
        System.out.println("elemento = " + elemento);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        

    }

    public static void imprimir(Collection coleccion) {
        for (Object elemento : coleccion) {
            System.out.println("elemento = " + elemento);
        }
    }
}
