import java.util.Random;

public class OperacionesContenedores {

    Random r = new Random();

    public int[][] llenarContenedores(int filas, int columnas, int cantidad, String[][] origen) {

        int[][] m = new int[filas][columnas];

        String[] paises = { "China", "Brasil", "USA", "Colombia", "Mexico", "Argentina" };

        for (int i = 0; i < cantidad; i++) {

            int columna = r.nextInt(columnas);

            for (int fila = 9; fila >= 0; fila--) {

                if (m[fila][columna] == 0) {

                    m[fila][columna] = r.nextInt(900) + 100;
                    origen[fila][columna] = paises[r.nextInt(paises.length)];

                    break;
                }
            }
        }

        return m;
    }

    public String mostrarMatriz(int[][] m) {

        String cad = "";

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                cad += m[i][j] + "\t";

            }
            cad += "\n";
        }

        return cad;
    }

    public String mostrarOrigen(String[][] origen) {

        String cad = "";

        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[0].length; j++) {

                if (origen[i][j] != null) {
                    cad += "Contenedor [" + i + "][" + j + "] origen: " + origen[i][j] + "\n";
                }

            }
        }

        return cad;
    }

    public int pesoTotal(int[][] m) {

        int suma = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                suma += m[i][j];

            }
        }

        return suma;
    }
}