import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
       double gramos[]=new double[100],clientes;
       double gr[]=new double[100];
       double total[]=new double[100];
       int galletas,con=0;
       double v,c,a,e;
       int sabores,res;
       int pasteles[] = new int[100];
       double costoCadaPastel[] = new double[100];
       System.out.println("Ingrese numero de clientes: ");
       clientes=leer.nextInt();
       
       for(int i=0;i<clientes;i++){
        System.out.println("Ingrese cantidad de pasteles a comprar cliente : "+(i+1));
        pasteles[i]=leer.nextInt();
        for(int u=0;u<pasteles[i];u++){
            System.out.println("Ingrese tamaño del pastel en gramos: ");
            gramos[u]=leer.nextInt();
            System.out.println(" ");
          
            for(int o=0;o<clientes;o++){
                gr[o]=gramos[o]*50;
               
        
            }
          do{
            System.out.println("elija el sabor del pastel\n1)vainilla\n2)chocolate\n3)arequipe\n4)especial\n5)salir");
            sabores=leer.nextInt();
    
            switch(sabores){
                case 1:
    System.out.println("Has elegido vainilla");
    v=0.02;
gr[u]=gr[u]+gr[u]*v;
                break;
    
                case 2:
                System.out.println("Has elegido chocolate");
                c=0.04;
                gr[u]=gr[u]+gr[u]*c;

                            break;
                            case 3:
                            System.out.println("Has elegido arequipe");
                            a=0.06;
                            gr[u]=gr[u]+gr[u]*a;

                                        break;
                                        case 4:
                                        System.out.println("Has elegido especial");
                                        e=0.1;
                                        gr[u]=gr[u]+gr[u]*e;

                                                    break;
                                                    case 5:
                                                    System.out.println("");
                                                    
                                                                break;
                                                                default: System.out.println("Ingrese una opcion valida");
            }
          }while(sabores!=1 && sabores!=2 && sabores!=3 && sabores!=4);
        
            System.out.println("¿Desea agregar galletas?\n1)si\n2)no");
            res= leer.nextInt();
    if(res==1){
        System.out.println("¿Cuantas galletas desea agregar?");
        galletas=leer.nextInt();
    }
      
gr[i]=con+gr[i];

    


        }
       
       }

       for(int l=0;l<clientes;l++){
        System.out.println("Cliente: "+(l+1));
        total[l]=pasteles[l]*gr[l];
        for(int p=0;p<pasteles[p];p++){
            
            System.out.println("precio del pastel "+(p+1)+": "+gr[p]+"\n");
    
        }
    }
    


      

for(int o=0;o<clientes;o++){
    System.out.println("el cliente "+(o+1)+" compro "+pasteles[o]+" pasteles");
    
    System.out.println(" ");
    System.out.println("Valor total a pagar de cliente "+(o+1)+" es: "+total[o]);
    System.out.println(" ");
}
System.out.println("Cantidad de clientes atendidos en la pasteleria: "+clientes);
 

      


    }
}
