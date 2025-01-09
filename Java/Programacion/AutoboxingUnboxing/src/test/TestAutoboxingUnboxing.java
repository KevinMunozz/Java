
package test;


public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //clases envolventes de tipos primitivos
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
        */
        Integer entero = 10; //Autoboxing: usar la clase (envolcer el tipo primirivo)
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.toString()); //es una cadena
        System.out.println("entero = " + entero.doubleValue()); // es un double
        
        int entero2 = entero; //unbonxing: desenvolver una clase a tipo primitivo
        
    }
}
