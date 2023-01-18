import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese cantidad de contraseñas a crear: ");
        int canCon=0;
        canCon=leer.nextInt();
        password [] pass=new password[canCon];
        boolean[] boo=new boolean[canCon];

        System.out.println("Ingrese una longitud");
        int longi=leer.nextInt();
        if(longi<8){
            System.out.println("La longitud debe ser mayor a 8 caracteres");
            
        }else{
            for(int i=0;i<pass.length;i++){

                pass[i]=new password(longi);
                boo[i]=pass[i].esFuerteONo();
                System.out.println(pass[i]+" es "+boo[i]);
               
                
                        }
        }

       
    }
}
