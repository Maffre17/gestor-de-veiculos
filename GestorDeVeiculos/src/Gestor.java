import java.util.ArrayList;
import java.util.List;

public class Gestor {

  private List<Veiculo> frota = new ArrayList<>();

  public void adicionarVeiculo(Veiculo v){
      frota.add(v);
  }
  public void exibirDetalhes(Veiculo v){
      switch (v){
          case Carro c -> {
              System.out.println("Tipo: carro");
              System.out.println("Marca: "+c.getMarca());
              System.out.println("Modelo: "+c.getModelo());
              System.out.println("Numero de portas: "+c.getNumeroDePortas());

          }
          case Mota m -> {
              System.out.println("Tipo: carro");
              System.out.println("Marca: "+m.getMarca());
              System.out.println("Modelo: "+m.getModelo());
              System.out.println("Numero de portas: "+m.getCilindradas());

          }
          case Camiao camiao -> {
              System.out.println("Tipo: carro");
              System.out.println("Marca: "+camiao.getMarca());
              System.out.println("Modelo: "+camiao.getModelo());
              System.out.println("Capacidade de carga: "+camiao.getCapacidadeDeCarga());

          }

          default -> throw new IllegalStateException("Unexpected value: " + v);
      }
      System.out.println();
  }
  public void imprimir(){
      for (Veiculo v :frota){
          exibirDetalhes(v);
      }
  }
}



