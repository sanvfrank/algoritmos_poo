import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        Scanner leer=new Scanner (System.in);
        int matriz[][]=new int [2][2];
        String menu="";
        int op;
        boolean sw=false;
        
        menu+="MENU DE OPCIONES \n"
        +"1) Rellenar toda la matriz\n"
        +"2) Sumar una fila\n"
        +"3) Sumar una columna\n"
        +"4) Sumar la diagonal principal\n"
        +"5) Sumar diagonal inversa\n"
        +"6) Promedio de la matriz\n"
        +"7) Salir";

do{
    System.out.println(menu);
    System.out.println(" ");
System.out.println("Ingresa una opcion: ");
op=leer.nextInt();
switch(op){


    case 1: 
    
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.println("Ingresar fila "+(i+1)+" columna "+(j+1));
matriz[i][j]=leer.nextInt();
        }
    }

    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.print("["+matriz[i][j]+"]");
        }
        System.out.println(" ");
    }
    sw=true;
    break;

    case 2:
    if(sw){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
        }
        int fila=0,suma=0; 
        System.out.println("Ingresar fila a sumar: ");
        fila=leer.nextInt();
            for(int j=0;j<2;j++){
    suma=suma+matriz[fila][j];
            }
            System.out.println("Suma de la fila: "+suma);
    System.out.println(" ");
    }else{
        System.out.println("Debe ingresar datos del vector primero");
    }
    
    
    break;
 
case 3:
if(sw){
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.print("["+matriz[i][j]+"]");
        }
        System.out.println(" ");
    }
    int co=0,suma2=0; 
    System.out.println("Ingresar columna a sumar: ");
    co=leer.nextInt();
        for(int j=0;j<2;j++){
    suma2=suma2+matriz[j][co];
        }
        System.out.println("Suma de la columna: "+suma2);
    System.out.println(" ");
}else{
    System.out.println("Debe ingresar datos del vector primero");

}


break;

case 4: 
if(sw){
    int suma3=0;
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.print("["+matriz[i][j]+"]");
        }
        System.out.println(" ");
    }
    
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
           if(matriz[i]==matriz[j]){
    suma3=suma3+matriz[i][j];
           }
        }
    }
    System.out.println("Suma de diagonal principal de la matriz: "+suma3);
    System.out.println(" ");
}else{
    System.out.println("Debe ingresar datos del vector primero");

}

break;

case 5:
if(sw){
    int suma4=0;
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.print("["+matriz[i][j]+"]");
        }
        System.out.println(" ");
    }
    
    for(int i=2-1;i>=0;i--){
        for(int j=2-1;j>=0;j--){
           if(matriz[i]==matriz[j]){
    suma4=suma4+matriz[i][j];
           }
        }
    }
    System.out.println("Suma de diagonal inversa de la matriz: "+suma4);
    System.out.println(" ");
}else{
    System.out.println("Debe ingresar datos del vector primero");

}

break;


case 6:
if(sw){
    int suma5=0;
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.print("["+matriz[i][j]+"]");
        }
        System.out.println(" ");
    }
    
    for(int i=0;i<2;i++){
        
        for(int j=0;j<2;j++){
            suma5=suma5+matriz[i][j];
        }
    }
    int promedio=suma5/4;
    System.out.println("Promedio de la matriz: "+promedio);
}else{
    System.out.println("Debe ingresar datos del vector primero");

}

case 7:
System.out.println("Gracias, hasta pronto");

break;
default: System.out.println("Ingrese una opcion correcta");

}
}while(op!=7);

        
    }
}
