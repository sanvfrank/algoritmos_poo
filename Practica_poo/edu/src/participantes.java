public abstract class  participantes {
    private String nombre;
    private int edad;
    private String sexo;
    private boolean disponible;
    
    public participantes(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        faltar();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }



public boolean masculino(){
    boolean m=false;
    
    if(sexo.equalsIgnoreCase("masculino")){
        m=true;
    }else{
        m=false;
    }
    return m;
}

public boolean femenino(){
    boolean f=false;
    if(sexo.equalsIgnoreCase("femenino")){
        f=true;
    }else {
        f=false;
    }
    return f;
}

    public abstract boolean faltar();

    
    
}
