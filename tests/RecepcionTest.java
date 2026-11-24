public class RecepcionTest {
    public static void main(String[] args) {
        comprobar(7, 3, 5, 22);
        comprobar(7, 0, 5, 7);
        comprobar(0, 3, 5, 15);
        comprobar(Integer.MAX_VALUE - 1, 1, 1, Integer.MAX_VALUE);
        try {
            Recepcion.stockFinal(Integer.MAX_VALUE, 1, 1);
            throw new AssertionError("La recepción debe rechazar un desborde.");
        } catch (ArithmeticException esperada) {
            // El stock se representa mediante un int.
        }
        try {
            Recepcion.stockFinal(0, 1, 0);
            throw new AssertionError("Cada bulto debe contener unidades.");
        } catch (IllegalArgumentException esperada) {
            // Una cantidad por bulto igual a cero es inválida.
        }
        System.out.println("OK RecepcionTest");
    }

    private static void comprobar(int inicial, int bultos, int porBulto, int esperado) {
        int obtenido = Recepcion.stockFinal(inicial, bultos, porBulto);
        if (obtenido != esperado) {
            throw new AssertionError("Se esperaba " + esperado + " y se obtuvo " + obtenido);
        }
    }
}
