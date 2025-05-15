

public class Main {

    public static void main(String[] args) throws InterruptedException {

        String[][] tabla = new String[20][70];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 70; j++) {
                tabla[i][j] = "";
            }
        }
        int k = 13;
        int m = 32;
        for (int i = 18; i > 16; i--) {
            for (int j = 13; j < m; j++) {
                tabla[i][k] = "|";
                k++;
            }
            m--;
            k = 14;
        }
        for (int i = 11; i <= 16; i++) {
            for (int j = 15; j < 32; j++) {
                tabla[i][j] = "|";

            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 70; j++) {
                if (i == 19) {
                    tabla[i][j] = "-";

                }
            }
        }
        int broj = 0;
        while(broj != 3){
                int i = 10;
                drawMap(tabla);
                Thread.sleep(1000);
                for (int j = 18; j < 36; j++) {
                    tabla[i][j] = "#";
                }
                drawMap(tabla);
                Thread.sleep(1000);
                i = 9;
                for (int j = 23; j < 40; j++) {
                    tabla[i][j] = "#";
                }
                drawMap(tabla);
                Thread.sleep(1000);
                i = 8;
                for (int j = 27; j < 43; j++) {
                    tabla[i][j] = "#";
                }
                drawMap(tabla);
                Thread.sleep(1000);
                i = 7;
                for (int j = 30; j < 47; j++) {
                    tabla[i][j] = "#";
                }
                drawMap(tabla);
                Thread.sleep(1000);
                i = 6;
                for (int j = 35; j < 52; j++) {
                    tabla[i][j] = "#";
                }
                drawMap(tabla);
                Thread.sleep(1000);
                i = 5;
            broj++;
            clear(tabla);
        }

    }
    static void drawMap(String[][] tabla){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 70; j++) {
                if (i == 19) {
                    tabla[i][j] = "-";
                }
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void clear(String[][] tabla){
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < 70; j++) {
                tabla[i][j] = "";
            }
        }
    }
}
