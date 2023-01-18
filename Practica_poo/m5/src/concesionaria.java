import java.util.ArrayList;

public class concesionaria {
    private String nombre;
    private ArrayList<auto> lisAuto;

    public concesionaria(String nombre) {
        this.nombre=nombre;
        this.lisAuto=new ArrayList<>();
    }

    public void agregar(auto a){
        lisAuto.add(a);
    }

public int cantAutos(){
    int a=0;
   a = lisAuto.size();
    return a;
}



public double min(){
    double max= Double.MAX_VALUE;
    auto autoMax=null;
    for (auto au : lisAuto) {
        if(au.getkRecorridos()<max){
            max=au.getkRecorridos();
           
        }
    }
    return max;
}



public ArrayList <auto> max(){
    ArrayList<auto> lisnueva = new ArrayList<>();
    double kmax=-1;
    for (auto aut : lisAuto) {
        if(aut.getkRecorridos()==kmax){
        
            lisnueva.add(aut);
        }else if(aut.getkRecorridos()>kmax){
            kmax=aut.getkRecorridos();
            lisnueva.clear();
            lisnueva.add(aut);
        }
    }
    return lisnueva;
}

    
}
