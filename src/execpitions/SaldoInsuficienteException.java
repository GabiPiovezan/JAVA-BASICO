package execpitions;

/**
 * Erro saldo insuficiente
 */

public class SaldoInsuficienteException extends RuntimeException {
  /**
   *
   * @param saldo
   */

    public SaldoInsuficienteException(double saldo) {
      super("O saldo é insuficiente: " + saldo);
    }
}
