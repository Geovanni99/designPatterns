public class Cliente {
    private ProdutoAbstratoA produtoA;
    private ProdutoAbstratoB produtoB;

    public Cliente(FabricaAbstrata fabrica) {
        produtoA = fabrica.createProdutoA();
        produtoB = fabrica.createProdutoB();
    }

    public void executar() {
        produtoB.interagir(produtoA);
    }
}

public interface FabricaAbstrata {
    ProdutoAbstratoA createProdutoA();
    ProdutoAbstratoB createProdutoB();
}
public class FabricaConcreta1 implements FabricaAbstrata {

    @Override
    public ProdutoAbstratoA createProdutoA() {
        return new ProdutoA1();
    }
    @Override
    public ProdutoAbstratoB createProdutoB() {
        return new ProdutoB1();
    }
}
public class FabricaConcreta2 implements FabricaAbstrata {

    @Override
    public ProdutoAbstratoA createProdutoA() {
        return new ProdutoA2();
    }
    @Override
    public ProdutoAbstratoB createProdutoB() {
        return new ProdutoB2();
    }
}
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
public class ProdutoA1 implements ProdutoAbstratoA {
}

class ProdutoA2 implements ProdutoAbstratoA {

}
public interface ProdutoAbstratoA {
}
public interface ProdutoAbstratoB {
    void interagir(ProdutoAbstratoA a);
}
public class ProdutoB1 implements ProdutoAbstratoB {

    @Override
    public void interagir(ProdutoAbstratoA a) {
        System.out.println(this.getClass().getName() + " interage com " + a.getClass().getName());
    }

}
public class ProdutoB2 implements ProdutoAbstratoB {

    @Override
    public void interagir(ProdutoAbstratoA a) {
        System.out.println(this.getClass().getName() + " interage com " + a.getClass().getName());
    }

}
