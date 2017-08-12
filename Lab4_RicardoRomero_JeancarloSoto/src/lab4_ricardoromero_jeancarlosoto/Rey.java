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
public class Rey extends Piezas{
    
    String nombre = "R";

    public Rey() {
        super();
    }

    public Rey(String nombre, Color color, String material) {
        super(color, material);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = "R";
    }

    @Override
    public String toString() {
        return nombre;
    }

    public String[][] movimiento(String[][] matriz, int x1, int y1, int x2, int y2) {
         String tempo[][] = new String[10][10];
         if (matriz[x1][y1].contains("R")) {
             matriz[x2][y2] = matriz[x1][y1];
             matriz[x1][y1] = "";
         }
        return tempo;
    }

    public String[][] comer(String[][] matriz, int x1, int y1, int x2, int y2) {
         String tempo[][] = new String[10][10];
        return tempo;
    }
    
}
