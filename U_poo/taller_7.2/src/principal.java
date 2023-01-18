import java.util.Scanner;

public class principal {
    public static void main (String[] args){
        Scanner leer=new Scanner (System.in);
        int N,posi=0;
        System.out.println("Ingrese dimension de la tabla: ");
        N=leer.nextInt();
        int arreglo[]=new int[N];
        for(int i=0;i<N;i++){
            System.out.println("Ingresa dato "+(i+1)+" de la tabla");
arreglo[i]=leer.nextInt();
if(arreglo[i]>=0){
posi++;
}
        }
        System.out.println("Numero de valores positivos: "+posi);
    }
}
