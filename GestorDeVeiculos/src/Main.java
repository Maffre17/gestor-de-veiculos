public class Main {
    public static void main(String[] args) {
     Gestor gestor = new Gestor();

     Veiculo carro = new Carro("toyota","Corolla", 4);
     Veiculo camiao = new Camiao("yamaha", "R1", 1000);
     Veiculo mota = new Mota("Volvo", "FH", 2000);

     gestor.adicionarVeiculo(camiao);
     gestor.adicionarVeiculo(carro);
     gestor.adicionarVeiculo(mota);
      gestor.imprimir();
    }
}