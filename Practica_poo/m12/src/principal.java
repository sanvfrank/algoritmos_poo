import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
       double gramos[]=new double[100],clientes;
       double gr[]=new double[100];
       double total[]=new double[100];
       int sa=0,p[]=new int[100],pi=0;
       double v,a, t[]=new double[100],acum[]=new double[100];
       int sabores[]=new int[100],c=0,ñ=0;
       String res="",galletas="";
       int pasteles[]=new int [100],ga[]=new int[100],ge,pas;
       double costoCadaPastel[] = new double[100];

       do{
        c=c+1;
        System.out.println("Ingrese cantidad de pasteles a comprar: ");
        pas=leer.nextInt();
       
        
       
        for(int u=0;u<pas;u++){
            pi=pi+1;
            p[u]=p[u]+1;
            System.out.println("Ingrese tamaño del pastel en gramos: ");
            gramos[u]=leer.nextInt();
            System.out.println(" ");
            gr[u]=gramos[u]*50;
            System.out.println("Ingrese sabor del pastel:\n1)vainilla\n2)chocolate\n3)arequipe\n4)especial");
            sabores[u]=leer.nextInt();
            if(sabores[u]==1){
                System.out.println("Has elegido vainilla");
            gr[u]=gr[u]+gr[u]*0.02;
            }
           else if(sabores[u]==2){
                System.out.println("Has elegido chocolate");
                gr[u]=gr[u]+gr[u]*0.04;
            }
           else if(sabores[u]==3){
                System.out.println("Has elegido arequipe");
                gr[u]=gr[u]+gr[u]*0.06;
            }
            else if (sabores[u]==4){
                System.out.println("Has elegido especial");
                gr[u]=gr[u]+gr[u]*0.1;
            }else{
                System.out.println("Elija una opcion valida");
            }
            System.out.println(" ");
            System.out.println("¿Desea agregar galletas?");
            galletas=leer.next().toUpperCase();
            if(galletas.equals("SI")){
                System.out.println("¿Cuantas galletas desea?");
                ge=leer.nextInt();
                ga[u]=ge*500;
                total[u]=gr[u]+ga[u];
            }else{
                total[u]=gr[u];
 
            }
           

  acum[u]=acum[u]+total[u];
        }
       
            System.out.println("¿Aun hay clientes?(si o no)");
            res=leer.next().toUpperCase();
       }while(res.equals("SI"));

       


      


       for(int i=0;i<c;i++){
           System.out.println("cliente "+(i+1));
           System.out.println("cantidad de pasteles: "+pasteles[i]);
          
           for(int o=0;o<pasteles[pi];o++){
           
               System.out.println("costo del pastel "+(o+1)+": "+total[o]);
              
           }    
           System.out.println("Valor total a pagar: "+acum[i]);
       }




       System.out.println("");
       System.out.println("total clientes "+c);
       System.out.println("total de pudines comprados: "+p);
    
}
}

