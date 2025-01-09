
package paquete1;


public class Clase1 {
    public String atributoPublico = "Valor atributo publico"; 
//tambien se puede cambiar su valor
    protected String atributoProtected = "valor atributo protected";
   // protected: se van a poder acceder desde la clases Padres e hijas
    // y tambien si estamos dentro del mismo paquete
    
   /* public Clase1(){
        System.out.println("Constructor publico");
    }*/
    protected Clase1(){
        System.out.println("Constructor protected");
    }
    /*no se puede utilizar en otra clase, 
    -a noser que se herede y con super tengamos acceso
    - o que este en el mismo paquete
    - usar protected cuando vamos a heredar*/
    
   /* public void metodoPublico(){
        System.out.println("Metodo publico");
    }*/
    
    //default
    /*
    - una clase definida con default no puede utilizarce fuera del paquete
    - sino le pones modificador de acceso se toma como default o paquete
    - tambien se puede modificar los atributos si estan en el mismo paquete tambien desde el main
    
    */
    
    //private
    
    /*
    - no se pueden definir clases private
    -en atributos ya no se puede modificar desde otras clases. solo con get y set
    - constructor(vacio) private no se puede crear objetos fuera de la clase. 
    - se necesita un constructor publico
    - metodo privado tampoco se puede utilizar desde otras clases
    */
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
    public Clase1(String arg){
        System.out.println("constructor = " + arg);
    }
    
}
