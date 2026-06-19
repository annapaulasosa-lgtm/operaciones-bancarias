package ar.edu.unahur.obj2.banco.observer;

import ar.edu.unahur.obj2.banco.cuenta.Cuenta;

public class NotificacionCliente implements IObservador{

    @Override
    public void notificar(Cuenta cuenta, String operacion, Double monto) {
        if("DEPOSITO".equals(operacion)){
            System.out.println(
                "se acreditaron $ " + monto 
            );
        }
        if("RETIRO".equals(operacion)){
            System.out.println(
                "se retiraron $ " + monto 
            );
        }
        if (cuenta.getSaldo() == 0){
            System.out.println(
                "saldo negativo"
            );
        }
    }
}
