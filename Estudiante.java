public class Estudiante {
    // Semana 1: Encapsulamiento (Atributos privados)
    private String nombre;
    private int edad;

    // Semana 2: Variable estática para control
    public static int contadorEstudiantes = 0;

    // Constructor
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        // Incrementamos el contador cada vez que se crea un objeto
        contadorEstudiantes++;
    }

    // Semana 1: Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // --- ESTO ES LO QUE AGREGAS EN EL TERCER COMMIT ---
    // Semana 2: Método estático para control
    public static void mostrarContador() {
        System.out.println("Estudiantes registrados actualmente: " + contadorEstudiantes);
    }
}