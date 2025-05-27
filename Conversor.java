import java.util.Scanner;

public class Conversor {
    

    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Tasa de cambio fija
            double tasaDolar = 0.00025; // 1 peso colombiano ≈ 0.00025 USD (ejemplo)
            double tasaEuro = 0.00023;  // 1 peso colombiano ≈ 0.00023 EUR

            System.out.println("=== Conversor de Moneda ===");
            System.out.print("Ingrese cantidad en pesos colombianos: ");
            double pesos = scanner.nextDouble();

            System.out.println("Seleccione la moneda a convertir:");
            System.out.println("1. Dólares (USD)");
            System.out.println("2. Euros (EUR)");
            int opcion = scanner.nextInt();

            double resultado = 0;
            String moneda = "";

            switch (opcion) {
                case 1:
                    resultado = pesos * tasaDolar;
                    moneda = "USD";
                    break;
                case 2:
                    resultado = pesos * tasaEuro;
                    moneda = "EUR";
                    break;
                default:
                    System.out.println("Opción inválida.");
                    System.exit(0);
            }

            System.out.printf("Resultado: %.2f %s%n", resultado, moneda);
            scanner.close();
        }

    public static void eleccionUserMenu() {
    }
}

    
