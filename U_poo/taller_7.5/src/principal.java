import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        Scanner leer=new Scanner (System.in);
        int N,suma=0;
        double media=0;
        System.out.println("Ingresa dimensiones del vector: ");
        N=leer.nextInt();
        int vector[]=new int[N];
        for(int i=0;i<N;i++){
            System.out.println("Ingrese valor "+(i+1)+" del vector");
            vector[i]=leer.nextInt();
            suma+=vector[i];
            media=suma/N;

        }
System.out.println("Sumatoria de los valores del vector: "+suma);
System.out.println("media aritmetica: "+media);


    }
}
