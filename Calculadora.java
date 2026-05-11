public class Calculadora {
    // Variable estática para llevar un conteo global de operaciones
    public static int totalOperaciones = 0;
    public static String historial = "";

    // Método para sumar dos números decimales
    public double sumar(double a, double b) {
        double resultado = a + b;
        totalOperaciones++;
        historial += a + " + " + b + " = " + resultado + "\n";
        return resultado;
    }

    // Sobrecarga de método: sumar tres números enteros
    public int sumar(int a, int b, int c) {
        int resultado = a + b + c;
        totalOperaciones++;
        historial += a + " + " + b + " + " + c + " = " + resultado + "\n";
        return resultado;
    }

    // Método estático para mostrar el reporte global
    public static void imprimirReporte() {
        System.out.println("--- Reporte de la Calculadora ---");
        System.out.println("Operaciones realizadas: " + totalOperaciones);
        System.out.println("Detalle:\n" + historial);
    }
}
