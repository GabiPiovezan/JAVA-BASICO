package execpitions;

/**
 * erro ao adicionar um valor negativo
 *
 */

public class ValorNegativoException extends RuntimeException {
  /**
   *
   * @param valor
   */

    public ValorNegativoException(double valor) {
      super( "Não é possivel colocar valor negativo: " +valor);

    }
}
