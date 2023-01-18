import java.util.ArrayList;
public class auto {
    String color;
    String marca;
    
    public auto(String color, String marca) {
        setColor(color);
        setMarca(marca);
        
    }

    public void setColor(String color) {
        if(color!=null){
            this.color = color;
        }
       
    }

    public void setMarca(String marca) {
        if(marca!=null){
 this.marca = marca;
        }
       
    }

    
    
}
