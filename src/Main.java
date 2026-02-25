import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Creación de Triángulo ---");
        System.out.print("Ingrese lado 1: ");
        double s1 = input.nextDouble();
        System.out.print("Ingrese lado 2: ");
        double s2 = input.nextDouble();
        System.out.print("Ingrese lado 3: ");
        double s3 = input.nextDouble();

        System.out.print("Ingrese color: ");
        String color = input.next();
        System.out.print("¿Está lleno? (true/false): ");
        boolean filled = input.nextBoolean();

        try {
            Triangle t1 = new Triangle(s1, s2, s3, color, filled);

            System.out.println("\n--- Datos del Triángulo ---");
            System.out.println(t1.toString());
            System.out.printf("Área: %.2f\n", t1.getArea());
            System.out.printf("Perímetro: %.2f\n", t1.getPerimeter());

        } catch (MiExcepcion e) {
            System.out.println("\nERROR: No se pudo crear el triángulo.");
            System.out.println("Razón: " + e.getMessage());
        }

        input.close();
    }
}
