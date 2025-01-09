
package test;

import enumeracion.Continentes;
import enumeracion.Dias;


public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Dia 1 de la semana: "+ Dias.LUNES);
        //indicarDiaSemana(Dias.MARTES);
        System.out.println("Continente nro 4: "+ Continentes.AMERICA);
        System.out.println("Nro se paises en el 4 continente: "
                +Continentes.AMERICA.getPaises());
        
        System.out.println("Continente nro 1: "+ Continentes.AFRICA);
        System.out.println("Nro se paises en el 1 continente: "
                +Continentes.AFRICA.getPaises());
    }
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
        }
    }
}
