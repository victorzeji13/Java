package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan" , 500);
        System.out.println("empleado1 = " + empleado1);

//         Cliente cliente1 = new Cliente(new Date(), true, "Carlos", 'F', 28, "Saturno 15");
//         System.out.println("cliente1 = " +cliente1);
    }
}