package operaciones;
public class Aritmetica {
    int a;
    int b;
    //Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando Constructor");
    }
    public Aritmetica( int a, int b){
        this.a = a;
        this.b = b;
    }
    //Metodo
    public void sumar(){
        int resultado = this.a + this.b;
        System.out.println("resultado= " + resultado);
    }
    public int sumarConRetorno(){
        return a + b;
    }
    public int sumarConArgumentos( int a, int b){
        this.a = a; // el argumento a se asigna a this.a
        this.b = b;
        //return a + b;
        return this.sumarConRetorno();
    }
}