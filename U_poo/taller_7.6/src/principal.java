import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        Scanner leer=new Scanner (System.in);
       
        int posi=0,neg=0,cer=0;
        int vector[]=new int[60];
        for(int i=0;i<vector.length;i++){
            vector[i]=leer.nextInt();
            if(vector[i]>0){
                posi++;
           }else if(vector[i]<0){
               neg++;
           }else{
               cer++;
           }
        }
        System.out.println("numeros positivos: "+posi);
        System.out.println("numeros negativos: "+neg);
        System.out.println("numeros iguales a cero: "+cer);
        
    }
}
