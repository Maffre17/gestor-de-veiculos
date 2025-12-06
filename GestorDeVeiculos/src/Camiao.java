final class Camiao extends Veiculo {
    private double capacidadeDeCarga;

    public Camiao(String marca, String modelo, double capacidadeDeCarga) {
        super(marca, modelo);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }
}
