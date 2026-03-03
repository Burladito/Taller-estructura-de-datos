public class Ejercicio22 {
    public static void main(String[] args) {

        // Dimensiones fijas
        int filas = 3;
        int columnas = 3;

        // Matriz definida directamente
        int[][] matriz = {
                { 5, 8, 2 },
                { 9, 1, 4 },
                { 7, 6, 3 }
        };

        // Mostrar matriz
        System.out.println("Matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Inicializar mayor y menor
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        int filaMayor = 0, colMayor = 0;
        int filaMenor = 0, colMenor = 0;

        // Recorrer matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    filaMayor = i;
                    colMayor = j;
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    filaMenor = i;
                    colMenor = j;
                }
            }
        }

        System.out.println("\nMayor: " + mayor +
                " en posición [" + filaMayor + "][" + colMayor + "]");

        System.out.println("Menor: " + menor +
                " en posición [" + filaMenor + "][" + colMenor + "]");
    }
}
