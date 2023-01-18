import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int posicion=0;
        int ISBN;
        String Titulo;
        String Autor;
        int Número_páginas;
        libro[] l=new libro[2];
for (int i=0;i<l.length;i++) {
    System.out.println("Ingresa ISBN: ");
    ISBN=leer.nextInt();
    System.out.println("ingresa titulo: ");
    Titulo=leer.next();
    System.out.println("Ingresa autor: ");
    Autor=leer.next();
    System.out.println("Ingresa numero de paginas: ");
    Número_páginas=leer.nextInt();
    l[i]=new libro(ISBN, Titulo, Autor, Número_páginas);
    
}
 int mayorPaginas=-1;
       for(int u=0;u<l.length;u++){
        if(l[u].getNúmero_páginas()>mayorPaginas){
mayorPaginas=l[u].getNúmero_páginas();
 posicion=u;
        }
       }

       for (libro lib : l) {
       System.out.println(lib);
        
       }
System.out.println("libro en la posicion: "+posicion+" tiene mas paginas con "+mayorPaginas+" paginas");

    }
    }

