package ar.edu.unahur.obj2.banco.operaciones;

import ar.edu.unahur.obj2.banco.cuenta.Cuenta;

public class RetirarComando implements IComandos{
    private final Cuenta cuenta;
    private final Double monto;
    private Boolean ejecutado = Boolean.FALSE;

    public RetirarComando(Cuenta cuenta, Double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void ejecutar() {
        if (!ejecutado){
            cuenta.retirar(monto);
            ejecutado = Boolean.TRUE;
        }
    }

    @Override
    public void deshacer() {
        if (ejecutado){
            cuenta.depositar(monto);
            ejecutado = Boolean.FALSE;
        }
    }

}