public class DespachoExactoTest {
    public static void main(String[] args) {
        int restante = Despacho.stockRestante(5, 5);
        if (restante != 0) {
            throw new AssertionError("El despacho de toda la existencia debe dejar stock cero.");
        }
        System.out.println("OK DespachoExactoTest");
    }
}
