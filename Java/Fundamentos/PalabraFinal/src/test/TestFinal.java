
package test;

import dominio.Persona;


public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miVariable = 5; ya o podemos modificar su valor si ponemos final
        

        //Persona.MI_CONSTANTE = 5; no se puede modificar ya que es una constante
        System.out.println("mi constante"+ Persona.MI_CONSTANTE);
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); ya no podemos referenciar a otro objeto
        persona1.setNombre("Juan");
        //pero si modificar el contenido del objeto
        System.out.println("persona1 = " + persona1.getNombre());
    }
}
