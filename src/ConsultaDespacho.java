import java.io.PrintStream;

public class ConsultaDespacho {
    public static void main(String[] args) {
        System.exit(ejecutar(args, System.out, System.err));
    }

    static int ejecutar(String[] args, PrintStream salida, PrintStream errores) {
        if (args.length != 2) {
            errores.println("Uso: ConsultaDespacho DISPONIBLES SOLICITADAS");
            return 2;
        }
        try {
            int disponibles = Integer.parseInt(args[0]);
            int solicitadas = Integer.parseInt(args[1]);
            int restantes = Despacho.stockRestante(disponibles, solicitadas);
            salida.printf("Stock restante: %d unidades.%n", restantes);
            return 0;
        } catch (NumberFormatException error) {
            errores.println("Las cantidades deben ser enteros.");
            return 2;
        } catch (IllegalArgumentException error) {
            errores.println(error.getMessage());
            return 1;
        }
    }
}
