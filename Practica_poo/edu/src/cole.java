import java.util.ArrayList;

public class cole {

    private ArrayList <aula> listAulas;
    
    public cole(){
        this.listAulas=new ArrayList<>();
    }


    public void agregarAulas(aula a){
listAulas.add(a);
    }



public void comenzarClase(){
           
           listarA();
   }


public void listarA(){
    for (aula a : listAulas) {
       a.listarA();
    }
}









}
