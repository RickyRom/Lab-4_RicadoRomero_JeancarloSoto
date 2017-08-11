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
public abstract class Piezas {
    private Color color;
    private String material;

    public Piezas() {
    }

    public Piezas(Color color, String material) {
        this.color = color;
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Piezas{" + "color=" + color + ", material=" + material + '}';
    }
    
    public abstract String[][] movimiento();
    public abstract String[][] comer();
}
