/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_ricardoromero_jeancarlosoto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ricky
 */
public class Lab4_RicardoRomero_JeancarloSoto {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        System.out.println("Bienvenido a su nuevoi juego de mesa mejorado");
        char r = 's';
        int puntaje = 0;
        ArrayList jugadores = new ArrayList();
        int menuprincipal;

        do {

            System.out.println("1-Crear Jugador\n"
                    + "2-Eliminar Jugador\n"
                    + "3-Listar Jugadores\n"
                    + "4-Jugar\n"
                    + "5-Salir\n");
            menuprincipal = sc.nextInt();
            switch (menuprincipal) {
                case 1: {
//Agregar

                    Jugador j = new Jugador();
                    System.out.println("Ingrese nombre");
                    String nom;
                    j.setNombre(nom = sc.next());
                    System.out.println("Ingrese usuario");
                    String usuario;
                    j.setUsuario(usuario = sc.next());
                    System.out.println("Ingrese lugar de nacimiento");
                    String nacimiento;
                    j.setNacimiento(nacimiento = sc.next());
                    System.out.println("Ingrese edad");
                    int edad;
                    j.setEdad(edad = sc.nextInt());
                    System.out.println("Ingrese sexo");
                    String sexo;
                    j.setSexo(sexo = sc.next());
                    System.out.println("Su puntaje se sumara de acuerdo al desarollo del juego, actualmente es: " + puntaje);
                    Jugador jj = new Jugador(nom, usuario, nacimiento, sexo, edad);
                    jugadores.add(j);

                }
                break;
                case 2: {
//ELiminar
                    int pos;
                    System.out.println("A continuacion se le muestran los jugadores");
                    int cont = 0;
                    for (Object jug : jugadores) {
                        System.out.println("[" + cont + "]" + jug);
                        cont++;
                    }

                    System.out.println("Elija la posicion del jugador que desea eliminar");
                    pos = sc.nextInt();
                    jugadores.remove(pos);
                }
                break;
                case 3: {
//Listar 
                    int cont = 0;
                    for (Object jug : jugadores) {
                        System.out.println("[" + cont + "]" + jug);
                        cont++;
                    }
                }
                break;
                case 4: {//Jugar
                   
                    String [][] tablero=Matriz();
                    imprimir(tablero);
                   
                    
                }
                break;
                case 5: {//Salir
                    r = 'n';
                    System.out.println("Gracias por jugar, Le esperamos de vuelta pronto");
                }
                break;

            }
        } while (r != 'n');

    }
     public static  String [][] Matriz() {
        String[][] temporal = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                temporal[i][j] = " ";
            }
        }
        return temporal;
    }

    public  static void imprimir(String[][] imp) {
        for (int i = 0; i < imp.length; i++) {
            for (int j = 0; j < imp[i].length; j++) {
                System.out.print("[" + imp[i][j] + "]");
            }
            System.out.println("");
        }

    }
    

}
