 
@Getter
@Setter
public class Venda {

        private double valorVenda;
        private Funcionario funcionario;
        public void save() {
            /*
             * Calcula o valor da comissão de venda sem que haja a necessidade de
             * usar um switch para o tipo de cargo toda vez que o método <b>save</b> for executado.
             */
            final double valorComissao = this.funcionario.getCargo().calcularComissao(this.valorVenda);
            
        }
    }
