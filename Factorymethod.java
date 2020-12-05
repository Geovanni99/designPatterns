public interface Bebida {
}
public class Cafe implements Bebida {
  public Cafe() {
    System.out.println("Café");
  }
}
class Main {
  public static void main(String[] args) {
    MaquinaBebidas maquinaCafe = new MaquinaCafe();
    Bebida b1 = maquinaCafe.entregaBebiba();

    MaquinaBebidas maquinaRefrigerante = new MaquinaRefrigerante();
    Bebida b2 = maquinaRefrigerante.entregaBebiba();

    Bebida b3 = maquinaRefrigerante.entregaBebiba();
  }
}
public abstract class MaquinaBebidas {
  public abstract Bebida entregaBebiba();

  public String exibeMensagem() {
    return "Bem-vindo à máquina de bebidas";
  }
}
public class MaquinaCafe extends MaquinaBebidas {
  public Bebida entregaBebiba() {
    return new Cafe();
  }
}
public class MaquinaRefrigerante extends MaquinaBebidas {
  public Bebida entregaBebiba() {
    return new Refrigerante();
  }
}
public class Refrigerante implements Bebida {
  public Refrigerante() {
    System.out.println("Refrigerante");
  }
}
