public class profesor extends participantes {
    private String asignatura;


    public void asig(String as){
        if(as.equalsIgnoreCase("filosofia") || as.equalsIgnoreCase("matematicas" )|| as.equalsIgnoreCase("fisica")){
this.asignatura=as;
        }
        else{
            System.out.println("Materias incorrectas");
        }


    }
    



    public profesor(String nombre, int edad, String sexo, String asignatura) {
        super(nombre, edad, sexo);
        asig(asignatura);
    }




    public String getAsignatura() {
        return asignatura;
    }




    @Override
    public boolean faltar() {
        boolean a=false;
        int ram= (int)(Math.random()*100);
      if(ram<20){
        super.setDisponible(false);
      }else{
        super.setDisponible(true);
      }
           
             return a;
        
        
    }

    public boolean disponible(){
        boolean b=false;
        if(super.isDisponible()==true){
b=true;
        }else{
            b=false;
        }
       
        return b;
    }


    public String correspondiente(){
        return asignatura;
    }

    
}
