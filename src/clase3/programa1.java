/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author educacionit
 */
public class programa1 {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("juan", "perez", "10", "300");
        Administrativo a1 = new Administrativo(10000, "julio", "lopez", "", "301");

        Profesor p1 = new Profesor(300, "juana", "manso", "12", "302", "java");

        e1.trabajar();
        p1.trabajar();
        a1.cobrarSueldo();
        p1.cobrarSueldo();

    }
}
