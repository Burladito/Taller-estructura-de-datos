package ArreglosdeObjetos;

public class EjecutarEstudiante {
    public static void main(String[] args) {
        // Arreglo de Objetos
        Estudiante[] est = new Estudiante[4];
        est[0] = new Estudiante("Juan", 3, "Ingeniería de Sistemas", 3.8, 20);
        est[1] = new Estudiante("Miguel", 4, "Ingeniería de Sistemas", 4.2, 19);
        est[2] = new Estudiante("Armando", 3, "Ingeniería de Sistemas", 3.0, 21);
        est[3] = new Estudiante("Milena", 3, "Ingeniería de Sistemas", 3.7, 20);
        
        System.out.println(est[2]);
    }
}