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
        Scanner scanner = new Scanner(System.in);

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
                case "A": nuevacolumna--;
                break;
                case "D": nuevacolumna++;
                break;
                default:
                    System.out.println("Solo puedes usar las teclas del juego");
                    continue;
            }

            if (nuevafila >= 0 && nuevafila < mapa.length && nuevacolumna >= 0 && nuevacolumna < mapa[0].length) {

                if (mapa[nuevafila][nuevacolumna] == 'M') {
                    System.out.println("Llegaste a la meta");
                    Laberinto = false;
                }else if (mapa[nuevafila][nuevacolumna] == ' ') {
                    mapa[nuevafila][nuevacolumna] = ' ';
                    fila = nuevafila;
                    columna = nuevacolumna;
                    mapa[fila][columna] = '@';
                }
            }
        }

        mapaPrinter.printMapa(mapa);
        scanner.close();
    }


}