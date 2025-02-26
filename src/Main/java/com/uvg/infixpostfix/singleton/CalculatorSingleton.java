package Main.java.com.uvg.infixpostfix.singleton;

public class CalculatorSingleton {

    // Instancia privada estática de la clase
    private static CalculatorSingleton instance;

    // Constructor privado para evitar instanciación externa
    private CalculatorSingleton() {
        // Aquí podrías inicializar cualquier cosa que necesite la calculadora
    }

    // Método público estático para obtener la instancia de la clase
    public static CalculatorSingleton getInstance() {
        // Se crea la instancia solo si es nula (de forma perezosa)
        if (instance == null) {
            instance = new CalculatorSingleton();
        }
        return instance;
    }

    // Métodos de la calculadora
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
    }

    // Otros métodos de la calculadora que desees agregar
}
