
package test;

import dominio.Persona;


public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas [] = new Persona[2];
        
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Pedro");
        System.out.println("personas 1 = " + personas[0]);
        System.out.println("personas 2 = " + personas[1]);
        for(int i = 0; i < personas.length; i++){
            System.out.println("persona " + i + ": " + personas[i]);
        }
        
        String frutas[] = {"Naranja", "Banana"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
        }
    }
}
