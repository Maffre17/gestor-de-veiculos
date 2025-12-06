final class Mota extends Veiculo {
    private double cilindradas;

    public Mota(String marca, String modelo, double cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public double getCilindradas() {
        return cilindradas;
    }
}