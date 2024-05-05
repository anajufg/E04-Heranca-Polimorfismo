import java.util.Date;

public class OperacaoDeposito extends Operacao{
    OperacaoDeposito(double valor) {
        super.setTipo('d');
        super.setValor(valor);
        this.data = new Date();
    }
}
