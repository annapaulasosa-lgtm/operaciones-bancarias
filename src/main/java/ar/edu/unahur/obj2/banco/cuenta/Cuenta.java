package ar.edu.unahur.obj2.banco.cuenta;
import ar.edu.unahur.obj2.banco.observer.*;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private final Integer numeroCta;
    private Double saldo;
    private List<IObservador> observadores = new ArrayList<>();

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
        notificar("DEPOSITO", monto);
    }

    public void retirar(Double monto){
        this.saldo -= monto;
        notificar("RETIRO", monto);
    }

    public void  agregarObservador(IObservador observador){
        observadores.add(observador);
    }

    public void  eliminarObservador(IObservador observador){
        observadores.remove(observador);
    }

    public void notificar(String operacion, Double monto){
        observadores.forEach(o -> o.notificar(this, operacion, monto));
    }
}
