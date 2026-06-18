package ar.edu.unahur.obj2.banco.cuenta;

public class Cuenta {
    private final Integer numeroCta;
    private Double saldo;
    public Cuenta(Integer numeroCta, Double saldo) {
        this.numeroCta = numeroCta;
        this.saldo = saldo;
    }
    public Integer getNumeroCta() {
        return numeroCta;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void depositar(Double monto){
        this.saldo += monto;
    }
    public void retirar(Double monto){
        this.saldo -= monto;
    }
}
