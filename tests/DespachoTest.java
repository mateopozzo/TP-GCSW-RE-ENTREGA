public class DespachoTest {
    public static void main(String[] args) {
        if (Despacho.stockRestante(12, 5) != 7) {
            throw new AssertionError("Tras despachar 5 de 12 deben quedar 7.");
        }
        exigirRechazo(5, 6);
        exigirRechazo(5, 0);
        exigirRechazo(-1, 1);
        System.out.println("OK DespachoTest");
    }

    private static void exigirRechazo(int disponibles, int solicitadas) {
        try {
            Despacho.stockRestante(disponibles, solicitadas);
        } catch (IllegalArgumentException esperada) {
            return;
        }
        throw new AssertionError("Se aceptó un despacho inválido.");
    }
}
