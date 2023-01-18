import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        Scanner leer=new Scanner (System.in);
        electrodomestico [] elec=new electrodomestico[3];
        String color;
        double precioBase;
        char consumoEnergetico;
        double peso;
        double sumLavadora=0,sumTelevision=0,sumElectrodomestico=0;
for(int i=0;i<elec.length;i++){
    System.out.println("Ingresa color: ");
    color=leer.next();
    System.out.println("Ingresa precio base: ");
    precioBase=leer.nextInt();
    System.out.println("Ingresa peso: ");
    peso=leer.nextDouble();
    System.out.println("Ingresa consumo energetico: ");
    consumoEnergetico=leer.next().charAt(0);
   
elec[0]=new television(precioBase, peso, color, consumoEnergetico, 20, true);
elec[1]=new lavadora(precioBase, peso, color, consumoEnergetico, 50);
elec[2]=new lavadora(precioBase, peso, color, consumoEnergetico, 50);


if(elec[i] instanceof lavadora){
    sumLavadora=sumLavadora+elec[i].precioFinal();
    System.out.println("lavadora: "+sumLavadora);
}
else if (elec[i] instanceof television){
    sumTelevision=sumTelevision+elec[i].precioFinal();
    System.out.println("television: "+sumTelevision);
}

}
   double total=sumElectrodomestico+sumLavadora+sumTelevision;
System.out.println("suma de electrodomesticos: "+sumElectrodomestico);
System.out.println("suma de lavadoras: "+sumLavadora);
System.out.println("suma de televisores: "+sumTelevision);
System.out.println("total: "+total);


/*electrodomestico deberia ser una clase abstracta al igual que su metodo ya que de lo contrario causa inconsistencias */
    }
}
