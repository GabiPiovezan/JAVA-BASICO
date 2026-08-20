public class Conta {
    double saldo;
    String dono;

    void depositar(double valor){
        this.saldo += valor;
    }
    void sacar(double valor){
        this.saldo -= valor;
    }
    double verSaldo(){
        return this.saldo;
    }

    Conta(String dono){
        this.dono = dono;
        this.saldo = 0;
    }
}
