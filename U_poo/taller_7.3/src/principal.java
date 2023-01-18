public class principal {
    public static void main (String[] args){
        int i=0,j=0,contador=1;
        int matriz[][]=new int[4][4];
        for(j=0;j<matriz.length;j++){
        for(i=0;i<matriz.length;i++){
            matriz[j][i]=contador;
contador++;
            if(matriz[j]==matriz[i]){
                matriz[j][i]=1;
            }else{
                matriz[j][i]=0;
            }
            System.out.print("[ "+matriz[j][i]+" ]");

        }
        System.out.println(" ");
    }
   
}
}
