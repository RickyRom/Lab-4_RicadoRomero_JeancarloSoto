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
        Jugador j = new Jugador();
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

                    String[][] tablero = Matriz();

                    Mago mago = new Mago();
                    Arqueros arqueros = new Arqueros();
                    Caballeros caballeros = new Caballeros();
                    Dragon dragon = new Dragon();
                    Duendes duende = new Duendes();
                    Rey rey = new Rey();
                    //COLOCANDO CABALLEROS
                    tablero[0][0] = caballeros.getNombre();
                    tablero[0][9] = caballeros.getNombre();
                    tablero[1][4] = caballeros.getNombre();
                    tablero[9][0] = caballeros.getNombre();
                    tablero[8][5] = caballeros.getNombre();
                    tablero[9][9] = caballeros.getNombre();
                    //COLOCANDO MAGOS 
                    tablero[0][5] = mago.getNombre();
                    tablero[9][4] = mago.getNombre();
                    //COLOCANDO ARQUEROS 
                    tablero[1][2] = arqueros.getNombre();
                    tablero[0][3] = arqueros.getNombre();
                    tablero[0][6] = arqueros.getNombre();
                    tablero[1][7] = arqueros.getNombre();
                    tablero[8][2] = arqueros.getNombre();
                    tablero[9][3] = arqueros.getNombre();
                    tablero[9][6] = arqueros.getNombre();
                    tablero[8][7] = arqueros.getNombre();
                    //COLOCANDO DUENDES
                    tablero[1][0] = duende.getNombre();
                    tablero[1][3] = duende.getNombre();
                    tablero[1][6] = duende.getNombre();
                    tablero[1][9] = duende.getNombre();
                    tablero[8][0] = duende.getNombre();
                    tablero[8][3] = duende.getNombre();
                    tablero[8][6] = duende.getNombre();
                    tablero[8][9] = duende.getNombre();
                    //COLOCANDO REY
                    tablero[0][4] = rey.getNombre();
                    tablero[9][5] = rey.getNombre();
                    //COLOCANDO DRAGON 
                    tablero[9][2] = dragon.getNombre();
                    tablero[8][4] = dragon.getNombre();
                    tablero[9][7] = dragon.getNombre();
                    tablero[0][2] = dragon.getNombre();
                    tablero[1][5] = dragon.getNombre();
                    tablero[0][7] = dragon.getNombre();
                    imprimir(tablero);

                    int turnos = 0;
                    if (turnos == 0) {
                        //TURNOS 

                        int x1;
                        int y1;
                        int x2;
                        int y2;
                        
                        System.out.println("Jugador 1 Ingrese la coordenada en x de la pieza que desea mover: ");
                        x1 = sc.nextInt();
                        System.out.println("Jugador 1 Ingrese la coordenada en y de la pieza que desea mover: ");
                        y1 = sc.nextInt();
                        System.out.println("Jugador 1 Ingrese la coordenada en x adonde desea mover: ");
                        x2 = sc.nextInt();
                        System.out.println("Jugador 1 Ingrese la coordenada en y adonde desea mover: ");
                        y2 = sc.nextInt();
                        System.out.println("1-Mover Rey\n"
                                + "2-Mover mago\n"
                                + "3-Mover Dragon\n"
                                + "4-Mover Duende\n"
                                + "5-Mover arquero\n"
                                + "6-Mover caballero\n");
                        int movimiento = sc.nextInt();
                        switch (movimiento) {
                            case 1: {

                            }
                            break;
                            case 2: {
                                Mago mm = new Mago();
                                mm.movimiento(tablero,x1,y1,x2,y2);
                            }
                            break;
                            case 3: {

                            }
                            break;
                            case 4: {

                            }
                            break;
                            case 5: {

                            }
                            break;
                            case 6: {

                            }
                            break;
                        }
                        turnos = 1;

                    }

                    if (turnos == 1) {

                        int x1;
                        int y1;
                        int x2;
                        int y2;
                        System.out.println("Jugador 2 Ingrese la coordenada en x de la pieza que desea mover: ");
                        x1 = sc.nextInt();
                        System.out.println("Jugador 2 Ingrese la coordenada en y de la pieza que desea mover: ");
                        y1 = sc.nextInt();
                        System.out.println("Jugador 2 Ingrese la coordenada en x adonde  desea mover: ");
                        x2 = sc.nextInt();
                        System.out.println("Jugador 2 Ingrese la coordenada en y adonde desea mover: ");
                        y2 = sc.nextInt();
                        System.out.println("1-Mover Rey\n"
                                + "2-Mover mago\n"
                                + "3-Mover Dragon\n"
                                + "4-Mover Duende\n"
                                + "5-Mover arquero\n"
                                + "6-Mover caballero\n");
                        int movimiento = sc.nextInt();
                        switch (movimiento) {
                            case 1: {

                            }
                            break;
                            case 2: {
                                Mago mm = new Mago();
                                mm.movimiento(tablero,x1,y1,x2,y2);
                            }
                            break;
                            case 3: {

                            }
                            break;
                            case 4: {

                            }
                            break;
                            case 5: {

                            }
                            break;
                            case 6: {

                            }
                            break;
                        }
                        turnos = 0;

                    }

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

    public static String[][] Matriz() {
        String[][] temporal = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                temporal[i][j] = " ";
            }
        }
        return temporal;
    }

    public static void imprimir(String[][] imp) {
        for (int i = 0; i < imp.length; i++) {
            for (int j = 0; j < imp[i].length; j++) {
                System.out.print("[" + imp[i][j] + "]");
            }
            System.out.println("");
        }

    }

}
