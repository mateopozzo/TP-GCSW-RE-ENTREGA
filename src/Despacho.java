public final class Despacho {
    private Despacho() {}

    public static int stockRestante(int disponibles, int solicitadas) {
        if (disponibles < 0 || solicitadas <= 0) {
            throw new IllegalArgumentException("Cantidades inválidas.");
        }
        if (solicitadas >= disponibles) {
            throw new IllegalArgumentException("Stock insuficiente.");
        }
        return disponibles - solicitadas;
    }
}
