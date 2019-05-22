
package com.mycompany.mavenproject1;

public class Educado {
    public static void main(String[] argumentos) {
        //camel case NiñoEducado
        //           decirHola
        //upper case
        //lower  case
        String a="Luis";
        String b="Sanz";
        saludar(a, b);
        String respuesta=despedirse(a, b);
        System.out.println(respuesta);
    }
    public static String despedirse(String nombre,String apellido)
    {
        String despedida="Adios "+nombre+" "+apellido;
        return despedida;
    }
    public static void saludar(String nombre, String apellido)
    {
        //System.out.println("Hola "+nombre+" "+apellido);
        String saludo="Hola "+nombre+" "+apellido;
        System.out.println(saludo);
    }
}
