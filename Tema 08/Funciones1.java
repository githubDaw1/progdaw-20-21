public class Funciones1 {
  
  public static void main (String[] args) {
    int a, b;
    System.out.println("Hola. Introducde un par de valores enteros que te los voy a sumar:");
    a = Integer.parseInt(System.console().readLine());
    b = Integer.parseInt(System.console().readLine());
    
    int c, d;
    System.out.println("Introducde otro par de valores enteros que te los voy a sumar:");
    c = Integer.parseInt(System.console().readLine());
    d = Integer.parseInt(System.console().readLine());
    
    Despedida();
    int resultado1 = Suma(a,b);
    
    
    
    System.out.println("El resultado es: "+resultado1);
    System.out.println("El resultado es: "+Suma(c,d));
    
    Despedida();
    
  }
  
  public static int Suma (int a, int b) {
    int resultado;
    resultado = a + b;
    return resultado;
  }
  
  public static void Despedida () {
    int a=1;
    System.out.println("Adiós "+a);
  }
  
}
