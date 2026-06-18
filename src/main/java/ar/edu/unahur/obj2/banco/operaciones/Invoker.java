package ar.edu.unahur.obj2.banco.operaciones;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List< IComandos> lote = new ArrayList<>();
    private IComandos ultimoComando;


    //ejecucion individual
    public void ejecutar(IComandos comando){
        comando.ejecutar();
        ultimoComando = comando;
    }

    public void agregarAlLote(IComandos comando){
        lote.add(comando);

    }
    //ejecucion por lote
    public void ejecutarLote(){
        lote.forEach(IComandos::ejecutar);
        lote.clear();
    }

    public void deshacer(){
        if (ultimoComando != null){
            ultimoComando.deshacer();
            
        }
    }
}
