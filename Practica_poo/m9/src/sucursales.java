import java.util.ArrayList;

public class sucursales {
    private String nombreSucursal;
    private ArrayList<instrumentos> listInstrumentos;

    public sucursales(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
        this.listInstrumentos=new ArrayList<>();
    }
    public void agregarI(instrumentos i){
        listInstrumentos.add(i);
    }
public void listarInstrumentos(){
for (instrumentos instru : listInstrumentos) {
    System.out.println(instru);
}
}
    public  ArrayList<instrumentos> instrumentosPorTipo (tipoInstrumentos t){
       
        ArrayList<instrumentos> insEncontrados= new ArrayList<>();
        
        for (instrumentos ins : listInstrumentos) {
         if(ins.tipos.equals(t)){
            insEncontrados.add(ins);
         }
        }
        return insEncontrados;
    }

    public void borrarInstrumento(String id){
        
for (instrumentos i : listInstrumentos) {
    if(i.getId().equals(id)){
    listInstrumentos.remove(i);
    
    }
}

    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }
   

    




}
