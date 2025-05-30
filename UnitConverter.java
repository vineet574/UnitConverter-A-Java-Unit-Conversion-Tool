import java.util.*;

public class UnitConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Unit Converter ===");
            System.out.println("1. Length");
            System.out.println("2. Temperature");
            System.out.println("3. Weight");
            System.out.println("4. Exit");
            System.out.print("Choose a category: ");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {
                case 1 -> convertLength(sc);
                case 2 -> convertTemperature(sc);
                case 3 -> convertWeight(sc);
                default -> System.out.println("Invalid option.");
            }
        }

        sc.close();
    }

    static void convertLength(Scanner sc) {
        System.out.println("\nLength Conversion:");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Miles");
        System.out.println("3. Feet to Meters");
        int ch = sc.nextInt();
        System.out.print("Enter value: ");
        double val = sc.nextDouble();

        switch (ch) {
            case 1 -> System.out.println(val + " m = " + (val / 1000) + " km");
            case 2 -> System.out.println(val + " km = " + (val * 0.621371) + " miles");
            case 3 -> System.out.println(val + " ft = " + (val * 0.3048) + " m");
            default -> System.out.println("Invalid option.");
        }
    }

    static void convertTemperature(Scanner sc) {
        System.out.println("\nTemperature Conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        int ch = sc.nextInt();
        System.out.print("Enter value: ");
        double val = sc.nextDouble();

        switch (ch) {
            case 1 -> System.out.println(val + " °C = " + (val * 9 / 5 + 32) + " °F");
            case 2 -> System.out.println(val + " °F = " + ((val - 32) * 5 / 9) + " °C");
            case 3 -> System.out.println(val + " °C = " + (val + 273.15) + " K");
            default -> System.out.println("Invalid option.");
        }
    }

    static void convertWeight(Scanner sc) {
        System.out.println("\nWeight Conversion:");
        System.out.println("1. Grams to Kilograms");
        System.out.println("2. Kilograms to Pounds");
        System.out.println("3. Pounds to Grams");
        int ch = sc.nextInt();
        System.out.print("Enter value: ");
        double val = sc.nextDouble();

        switch (ch) {
            case 1 -> System.out.println(val + " g = " + (val / 1000) + " kg");
            case 2 -> System.out.println(val + " kg = " + (val * 2.20462) + " lbs");
            case 3 -> System.out.println(val + " lbs = " + (val * 453.592) + " g");
            default -> System.out.println("Invalid option.");
        }
    }
}
