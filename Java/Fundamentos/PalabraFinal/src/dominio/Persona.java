
package dominio;


public  class Persona { 
//si la clase es final significa que ya no puede tener clases hijas
    
    private String nombre;
    
    
    
    //public final static se conoce como constante
    public final static int MI_CONSTANTE = 1;
    public final void imprimir(){
        //si le ponemos final a un metodo, las clases hijas 
        //ya no pueden sobreescrir(modificar) el metodo
        System.out.println("Metodo imprimir");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
