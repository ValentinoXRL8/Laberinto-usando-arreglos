public class MapaPrinter {
    public void printMapa(char[][] mapa) {
        for(int f = 0; f < mapa.length; f++) {
            for(int c = 0; c < mapa[f].length; c++) {
                System.out.print(mapa[f][c] + " ");
            }
            System.out.println();
        }
    }
}