import java.util.ArrayList;

import javax.naming.LinkException;

public class fabrica {
    private ArrayList<sucursales> listSucursales;

    public fabrica() {
        this.listSucursales = new ArrayList<>();
    }

    public void agregarS(sucursales s){
        listSucursales.add(s);
    }
    
    public void listarInstrumentos(){
        for (sucursales sucur : listSucursales) {
            sucur.listarInstrumentos();
        }
    }
    
    public ArrayList<instrumentos> instrumentosPorTipo(tipoInstrumentos tipo) {
        ArrayList<instrumentos> instEncontrados = new ArrayList<>();
        for (sucursales sucursal : listSucursales) {
            instEncontrados.addAll(sucursal.instrumentosPorTipo(tipo));
        }
        return instEncontrados;
    }


public void borrarInstrumento(String id){
    for (sucursales sucur: listSucursales) {
        sucur.borrarInstrumento(id);
        System.out.println("instrumento borrado");

    }
}
}
