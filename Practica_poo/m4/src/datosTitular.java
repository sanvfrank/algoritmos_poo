public class datosTitular {
    String nombreCliente;
    String apellido;
    String id;
    String email;
    
    public datosTitular(String nombreCliente, String apellido, String id, String email) {
        this.nombreCliente = nombreCliente;
        this.apellido = apellido;
        this.id = id;
        this.email = email;
    }

    
    public String nombreCompleto(){
return "nombre: "+nombreCliente+"\nApellido: "+apellido;
    }


    @Override
    public String toString() {
        return "Nombre: "+nombreCliente+"\nApellido: "+apellido+"\nId: "+id+"\nEmail: "+email;
    }

    
}
