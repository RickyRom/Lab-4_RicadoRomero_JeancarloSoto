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
public class Duendes extends Piezas{
    
    String nombre = "D";

    public Duendes() {
        super();
    }

    public Duendes(String nombre, Color color, String material) {
        super(color, material);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = "D";
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public String[][] movimiento(String[][] matriz, int x1, int y1, int x2, int y2) {
         String tempo[][] = new String[10][10];
         if (matriz[x1][y1].contains("D")) {
             matriz[x2][y2] = matriz[x1][y1];
             matriz[x1][y1] = "";
         }
        return matriz;
    }

    public String[][] comer(String[][] matriz, int x1, int y1, int x2, int y2) {
         String tempo[][] = new String[10][10];
        return tempo;
    }
    
}
