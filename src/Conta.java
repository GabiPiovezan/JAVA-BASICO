import execpitions.SaldoInsuficienteException;
import execpitions.ValorNegativoException;

public class Conta {
     private double saldo;
    private String dono;

    void depositar(double valor) throws ValorNegativoException {
        if (valor < 0){
            throw new ValorNegativoException(valor);
        }

        this.saldo += valor;

    }
    void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {

        if (valor < 0){
            throw new ValorNegativoException(valor);
        }
        if (this.saldo < valor){
            throw new SaldoInsuficienteException(saldo);
        }

        this.saldo -= valor;

    }
    double verSaldo(){
        return this.saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    Conta(){}
    Conta(String dono){
        this.dono = dono;
        this.saldo = 0;
    }
}
