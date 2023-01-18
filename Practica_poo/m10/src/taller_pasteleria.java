import java.util.ArrayList;

public class taller_pasteleria {
    ArrayList<Clientes> listclientes;

    public taller_pasteleria() {
        this.listclientes= new ArrayList<>();
    }

    public void atenderCliente(Clientes ci){
        listclientes.add(ci);
    }


    public int cantClientes(){
        return listclientes.size();
    }

    public void CantpastelesPorCliente(){
        
        for (Clientes clien : listclientes) {
           
         clien.pedidos();    
    }
        System.out.println("cantidad de pasteles del cliente[] ");
       
    }
}
