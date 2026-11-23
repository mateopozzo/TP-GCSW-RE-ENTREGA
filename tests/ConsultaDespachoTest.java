import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class ConsultaDespachoTest {
    public static void main(String[] args) {
        verificar(new String[]{"12", "5"}, 0, "Stock restante: 7 unidades.", "");
        verificar(new String[]{"5", "6"}, 1, "", "Stock insuficiente.");
        verificar(new String[]{"tres", "1"}, 2, "", "Las cantidades deben ser enteros.");
        System.out.println("OK ConsultaDespachoTest");
    }

    private static void verificar(String[] args, int codigo, String salida, String error) {
        ByteArrayOutputStream texto = new ByteArrayOutputStream();
        ByteArrayOutputStream errores = new ByteArrayOutputStream();
        try (PrintStream out = new PrintStream(texto, true, StandardCharsets.UTF_8);
             PrintStream err = new PrintStream(errores, true, StandardCharsets.UTF_8)) {
            int obtenido = ConsultaDespacho.ejecutar(args, out, err);
            if (obtenido != codigo || !texto.toString(StandardCharsets.UTF_8).strip().equals(salida)
                    || !errores.toString(StandardCharsets.UTF_8).strip().equals(error)) {
                throw new AssertionError("Respuesta de consola inesperada para " + String.join(" ", args));
            }
        }
    }
}
