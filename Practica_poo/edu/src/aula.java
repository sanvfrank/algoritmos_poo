import java.util.ArrayList;

public class aula {
    private int numeroDeAula;
    private String claseDelAula;
    private profesor profesor;
    private int numMaxEstu;
    private String materia;
    private boolean l;
    private boolean j;
    private boolean k;
    private ArrayList <estudiante> listEstudiantes;
    
    
    public aula(int numeroDeAula,String claseDelAula,profesor profesor,int numMaxEstu) {
        this.numeroDeAula=numeroDeAula;
        this.claseDelAula=claseDelAula;
        this.profesor=profesor;
        this.numMaxEstu=numMaxEstu;
        this.listEstudiantes=new ArrayList<>();
       
    }

public void agregarEstudiantes(estudiante e){
    int u=0;
    if(u<=numMaxEstu){
        listEstudiantes.add(e) ;
        u++;
    }else{
        System.out.println("se ha sobrepasado el maximo de estudiantes del aula: "+numeroDeAula);
    }
  
  

   
}

    public int getNumeroDeAula() {
        return numeroDeAula;
    }


    public String getClaseDelAula() {
        return claseDelAula;
    }


public boolean mayoria(){
    double d;
    boolean b=false;
    d=numMaxEstu/2;
    if(cantiDispo()>d){
        b=true;
    }else {
        b=false;
    }
    return b;
}


public int cantiDispo(){
    boolean u;
    int a=0;
    for (estudiante e: listEstudiantes) {
        if(e.faltar()){
            a++;
        }
       
    }
    return a;
}



public boolean auladis(){
    boolean l=false;
if(profesor.getAsignatura().equals(claseDelAula)){
    l=true;
}else{
    l=false;

}
    return l;
}




public void listarA(){
    boolean b=false;
    if(auladis()==true){
        if(profesor.disponible()==true){
            if(mayoria()==true){
               System.out.println("aula: "+numeroDeAula+" puede iniciar clases");
System.out.println(" ");
System.out.println("aula: "+numeroDeAula);
System.out.println("numero de alumnos masculinos aprobados: "+masculi());
System.out.println("numero de alumnos femeninos aprobados: "+femeni());
System.out.println(" ");
            }else{
                System.out.println("El aula "+numeroDeAula+" le hacen falta estudiantes");
            }
        }else{
            System.out.println("El profesor del aula "+numeroDeAula+" no ha asistido");
        }


    }else{
        System.out.println(" ");
                System.out.println("aula: "+numeroDeAula+" materia incorrecta");
                System.out.println("No puede iniciar clases");
                System.out.println(" ");
            }
        
        } 
        
    
    

public int masculi(){
    int m=0;
    for (estudiante e : listEstudiantes) {
        if(e.masculi()){
            m++;
        }
      
    }
    return m;
}

public int femeni(){
    int f=0;
    for (estudiante e : listEstudiantes) {
      if(e.femeni()){
        f++;
      }
    }
    return f;
}



  
   
}
