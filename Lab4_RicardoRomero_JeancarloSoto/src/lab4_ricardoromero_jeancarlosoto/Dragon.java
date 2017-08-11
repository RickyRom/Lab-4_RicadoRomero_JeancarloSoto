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
public class Dragon extends Piezas{
    
    String nombre = "F";

    public Dragon() {
        super();
    }

    public Dragon(String nombre, Color color, String material) {
        super(color, material);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = "F";
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public void movimiento() {
        
    }

    @Override
    public void comer() {
        
    }
    
}
