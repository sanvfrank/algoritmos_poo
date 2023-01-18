public class password {
    private int longitud;
    


   
    public password(int longitud) {
        this.longitud = longitud;
    }



    public String contrasena(){
        char[] mayusculas ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] minusculas ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] numeros={'1','2','3','4','5','6','7','8','9','0'};

        StringBuilder caracteres= new StringBuilder();
caracteres.append(mayusculas);
caracteres.append(minusculas);
caracteres.append(numeros);

StringBuilder contrasena= new StringBuilder();
for(int i=0;i<longitud;i++){
    int cantidadCaracteres=caracteres.length();
    int numeroRamdon=(int)(Math.random()*cantidadCaracteres);

    contrasena.append((caracteres.toString()).charAt((numeroRamdon)));
}
        return contrasena.toString();
    }



public boolean esFuerteONo(){

    boolean e=false;
    int u=0,o=0;
    for(int i=0;i<getContrasenna().length();i++){
        if(Character.isUpperCase(getContrasenna().charAt(i))){
u++;
    }else{   
        o++;
    }

    if(u>4 && o>1){
e=true;
    }else{
        e=false;
    }
   
}
return e;
}



    public int getLongitud() {
        return longitud;
    }



    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }



    public String getContrasenna() {
        return contrasena();
    }



   
    
    

}
