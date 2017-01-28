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
public class Administrativo extends Empleado {

    private int sueldo;

    public Administrativo(int sueldo, String nombre, String apellido, String dni, String legajo) {
        super(nombre, apellido, dni, legajo);
        this.sueldo = sueldo;
    }
    
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    
}
