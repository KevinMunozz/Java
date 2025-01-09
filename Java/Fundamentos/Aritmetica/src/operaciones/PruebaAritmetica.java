package operaciones;
public class PruebaAritmetica {
   public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        Aritmetica aritmetica2 = new Aritmetica(1,2);
        aritmetica1.a=3;
        aritmetica1.b=2;
        aritmetica1.sumar();
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde de la prueba = " + resultado);
        resultado = aritmetica1.sumarConArgumentos(4, 6);
        System.out.println("resultado usando argumentos = " + resultado);
        resultado = aritmetica2.sumarConRetorno();
        System.out.println(" resultado con constructor: " + resultado );
   }    

}