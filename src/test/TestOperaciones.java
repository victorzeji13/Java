package test;

import operaciones.Operaciones;
public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.suma(5, 3);
        System.out.println("resultado = "+resultado);
        
        var resultado2 = Operaciones.suma(2.0, 3);
        System.out.println("resultado = "+resultado2);
        
        var resultado3 = Operaciones.suma(3, 5L);
        System.out.println("resultado = "+resultado3);
    }
}
