public class Puerto {

    public static void main(String[] args) {

        OperacionesContenedores op = new OperacionesContenedores();

        int filas = 10;
        int columnas = 10;

        int cantidadContenedores = 20; 

        String[][] origen = new String[filas][columnas];

        int[][] contenedores = op.llenarContenedores(filas, columnas, cantidadContenedores, origen );

        System.out.println("MATRIZ DE CONTENEDORES");
        System.out.println(op.mostrarMatriz(contenedores));

        System.out.println("ORIGEN DE LOS CONTENEDORES");
        System.out.println(op.mostrarOrigen(origen));
        System.out.println("Peso total de contenedores: " + op.pesoTotal(contenedores));

    }
}