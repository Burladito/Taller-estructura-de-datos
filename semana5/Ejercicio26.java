import java.util.Random;

public class Ejercicio26 {

    public static void main(String[] args) {

        Random random = new Random();

        String[] modelos = { "A", "B", "C", "D", "E", "F", "G", "H" };
        double[] precios = { 2500, 3000, 2800, 3200, 2600, 3100, 2900, 2700 };

        int[][] ventas = new int[8][30];

        // Generar ventas aleatorias (0–20 cuadernos por día)
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 30; j++) {
                ventas[i][j] = random.nextInt(21); // 0 a 20
            }
        }

        // a) Total por modelo
        double[] totalModelo = new double[8];

        System.out.println("Total recaudado por modelo:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 30; j++) {
                totalModelo[i] += ventas[i][j] * precios[i];
            }
            System.out.println("Modelo " + modelos[i] +
                    ": $" + totalModelo[i]);
        }

        // b) Total por día
        System.out.println("\nTotal recaudado por día:");
        for (int j = 0; j < 30; j++) {
            double totalDia = 0;
            for (int i = 0; i < 8; i++) {
                totalDia += ventas[i][j] * precios[i];
            }
            System.out.println("Día " + (j + 1) + ": $" + totalDia);
        }

        // c) Modelo que más produjo
        double mayor = totalModelo[0];
        int posMayor = 0;

        for (int i = 1; i < 8; i++) {
            if (totalModelo[i] > mayor) {
                mayor = totalModelo[i];
                posMayor = i;
            }
        }

        System.out.println("\nModelo que más produjo en 30 días: " +
                modelos[posMayor] + " con $" + mayor);
    }
}