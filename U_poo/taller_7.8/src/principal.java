import java.util.Scanner;

public class principal {
    public static void main (String[] args){
      Scanner leer=new Scanner (System.in);
      
      Double matriz[][]=new Double [24][7];
      double p1[]=new double [7];
      String dias[]= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
      double suma=0,suma2=0;
double promediohora=0;
      for(int j=0;j<7;j++){
        suma=0;
        for(int i=0;i<24;i++){
matriz[i][j]= Math.random()*(65)-15;
suma+=matriz[i][j];

        }
p1[j]=suma/24;
      }

      
      System.out.println("Promedio de temperatura de los dias de la semana: ");

      for(int j=0;j<7;j++){
        
System.out.println(dias[j]+" = "+p1[j]);
      }
System.out.println(" ");
      System.out.println("Ingresa una hora del dia: ");
      int hora=leer.nextInt();
      System.out.println(" ");
for(int j=0;j<7;j++){
    suma2=suma2+matriz[hora][j];
}
promediohora=suma2/7;

if(hora>=6){
    System.out.println("Promedio semanal de la temperatura a las: "+hora+" de la noche");
    System.out.println(+promediohora);
    
}else{
    System.out.println("Promedio semanal de la temperatura a las: "+hora+" de la tarde");
    System.out.println(+promediohora);

}

}
    }

