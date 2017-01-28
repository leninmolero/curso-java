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
public class Profesor extends Empleado{

    private int valorHora;
    private String lenguaje;

    public Profesor(int valorHora, String lenguaje, String nombre, String apellido, String dni, String legajo) {
        super(nombre, apellido, dni, legajo);
        this.valorHora = valorHora;
        this.lenguaje = lenguaje;
    }
    
    
    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    
}
