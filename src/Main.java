import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        System.out.println("=== LABERINTO ===\n Reglas del juego: \n");
        System.out.println("Usa las teclas para poder moverte entre el laberinto y llegar a la meta");
        System.out.println("@ = Jugador, M = Meta, # = Pared\n");

        char[][] mapa = {
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                {'#', ' ', '#', '#', '#', ' ', '#', ' ', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', ' ', '#'},
                {'#', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#'},
                {'#', '#', '#', ' ', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#'},
                {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                {'#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', ' ', '#'},
                {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                {'#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#'},
                {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'M', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
        };

        MapaPrinter mapaPrinter = new MapaPrinter();

        int fila = 1;
        int columna = 2;
        mapa[fila][columna] = '@';

        boolean Laberinto = true;

        while (Laberinto) {
            mapaPrinter.printMapa(mapa);
            String movimiento = scanner.nextLine().toUpperCase();

            int nuevafila = fila;
            int nuevacolumna = columna;

            switch (movimiento) {
                case "W": nuevafila--;
                break;
                case "S": nuevafila++;
                break;
                case "A": nuevafila--;
                break;
                case "D": nuevafila++;
                break;
                default:
                    System.out.println("Solo puedes usar las teclas del juego");
                    continue;
            }
        }

        mapaPrinter.printMapa(mapa);
    }
}