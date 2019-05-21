
package hazerta.calculadora;

public class Calculadora {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        System.out.println(restarNumeros(a, b));
        mostrarSuma(8, 4);
    }
    public static int restarNumeros(int a, int b)
    {
     int z=a-b;
     return z;   
    }
    public static void mostrarSuma(int a, int b)
    {
        System.out.println(a+b);
    }
}
