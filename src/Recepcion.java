public class Recepcion {
    public static int stockFinal(int inicial, int bultos, int porBulto) {
        if (inicial < 0 || bultos < 0 || porBulto <= 0) {
            throw new IllegalArgumentException("Cantidades inválidas.");
        }
        return Math.addExact(inicial, Math.multiplyExact(bultos, porBulto));
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Uso: Recepcion STOCK_INICIAL BULTOS UNIDADES_POR_BULTO");
            System.exit(2);
            return;
        }
        try {
            int inicial = Integer.parseInt(args[0]);
            int bultos = Integer.parseInt(args[1]);
            int porBulto = Integer.parseInt(args[2]);
            int total = stockFinal(inicial, bultos, porBulto);
            System.out.printf("Ingreso: %d bultos de %d unidades.%n", bultos, porBulto);
            System.out.printf("Stock final: %d unidades.%n", total);
        } catch (NumberFormatException error) {
            System.err.println("Las cantidades deben ser enteros.");
            System.exit(2);
        } catch (IllegalArgumentException | ArithmeticException error) {
            System.err.println("Cantidad inválida o fuera del rango de enteros.");
            System.exit(1);
        }
    }
}
