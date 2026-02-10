package semana2;

public class Ejercicio1 {
    public static void main(String[] args) {
        // forma 1, definiendo directamente los valores del arreglo
        int[] a = { 4, 8, 9, 6, 1, 2, 10 };
        // recorrer los elementos del arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
        int sumaimpar = 0;
        int sumapar = 0;  
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sumapar += a[i];
            } else {
                sumaimpar += a[i];
            }
        }
        System.out.println("Suma de pares: " + sumapar);
        System.out.println("Suma de impares: " + sumaimpar);
    }
}
