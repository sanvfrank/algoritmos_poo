import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        String titulo;
        serie[] s=new serie[2];
        videojuego[] v=new videojuego[2];
        
for(int i=0;i<s.length;i++){
    System.out.println("Ingresa titulo: ");
     titulo=leer.next();
    System.out.println("Ingresa numero de temporadas: ");
    int numTemps=leer.nextInt();
    System.out.println("Ingresa genero: ");
    String genero=leer.next();
    System.out.println("Ingresa creador: ");
    String creador=leer.next();

    s[i]=new serie(titulo, creador, numTemps, false, genero);
}

serie serieMayor=s[0];
        videojuego videojuegoMayor=v[0];
  
        //Recorremos el array desde la posicion 1 (no 0), comparando el mayor con las posiciones del array
        for(int i=1;i<s.length;i++){
            if(s[i].compareTo(serieMayor)==1){
                serieMayor=s[i];
            }
            

    }
    System.out.println(serieMayor);
}
}
