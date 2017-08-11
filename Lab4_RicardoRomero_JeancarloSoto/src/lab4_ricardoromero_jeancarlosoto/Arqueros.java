/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_ricardoromero_jeancarlosoto;

import java.awt.Color;

/**
 *
 * @author ricky
 */
public class Arqueros extends Piezas{
    
    String nombre = "A";

    public Arqueros() {
        super();
    }

    public Arqueros(String nombre, Color color, String material) {
        super(color, material);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = "A";
    }

    @Override
    public String toString() {
        return nombre;
    }

    public String movimiento() {
        
    }

    public String comer() {
        
    }
    
}
