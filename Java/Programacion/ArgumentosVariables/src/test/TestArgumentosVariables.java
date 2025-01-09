
package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2);
        variosParametros("juan", 1,2,5);
    }
    
    private static void variosParametros(String nombre, int... numeros){
        //el argumento variable debe de ser el ultimo parametro
        System.out.println("nombre = " +nombre);
         for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: "+i+" "+numeros[i]);
        }
    }
    private static void imprimirNumeros(int... numeros){
        //no necesitamos saber cuantos numeros pasarle comparado con vectores
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: "+i+" "+numeros[i]);
        }
    }
}
