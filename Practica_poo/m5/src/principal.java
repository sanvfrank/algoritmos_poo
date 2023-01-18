public class principal {
    public static void main (String[] args){
        concesionaria c = new concesionaria("Renault");
        auto a1=new auto("uno", "ferrari", 1000, "rojo");
        auto a2=new auto("dos", "mazda", 4000, "verde");
        auto a3=new auto("tres", "bugatii", 4000, "azul");
        auto a4=new auto("cuatro", "bu", 4000, "amarillo");
       
        c.agregar(a1);
        c.agregar(a2);
        c.agregar(a3);
        c.agregar(a4);

        
        System.out.println(c.max());
    }
    }
   
