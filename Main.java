public class Main {
    public static void main(String[] args) {
        // Creación de 3 instancias de la clase Estudiante
        Estudiante est1 = new Estudiante("Gonzalo", 26);
        Estudiante est2 = new Estudiante("Luis", 24);
        Estudiante est3 = new Estudiante("Gustavo", 23);

        // Imprimimos un dato usando el getter (Encapsulamiento)
        System.out.println("Nombre del primer estudiante: " + est1.getNombre());

        // Llamada al método estático para ver el total
        Estudiante.mostrarContador();
    }
}
// Prueba de 3 estudiantes y metodo estatico
