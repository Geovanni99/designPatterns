import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      FabricaAbstrata fabrica;
      Scanner sc = new Scanner(System.in);
      System.out.println("Forneça qual família você deseja trabalhar");

      int familia = sc.nextInt();
      if (familia == 1) {
        fabrica = new FabricaConcreta1();
      }
      else {
        fabrica = new FabricaConcreta2();
      }

      Cliente cliente = new Cliente(fabrica);
      cliente.executar();
    }
}