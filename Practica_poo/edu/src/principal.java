import java.util.Scanner;

public class principal {
    public static void main(String[] args){
      cole c=new cole();


       estudiante e1=new estudiante("frank", 17, "masculino", 2.3);
       estudiante e2=new estudiante("carlos", 18, "masculino", 4.0);
       estudiante e3=new estudiante("andrea", 15, "femenino", 2.5);
       estudiante e4=new estudiante("rosa", 16, "femenino", 4.5);
       estudiante e5=new estudiante("rosa", 16, "femenino", 4.5);
       estudiante e6=new estudiante("rosa", 16, "femenino", 4.5);

       profesor p1=new profesor("Pgonzalo", 40, "masculino", "fisica");
       profesor p2=new profesor("Pcamilo", 32, "masculino", "matematicas");

       aula a1=new aula(3, "fisica",p1,2);
       aula a2=new aula(2, "matematicas",p2,2);

       a1.agregarEstudiantes(e1);
       a1.agregarEstudiantes(e2);
       a1.agregarEstudiantes(e6);
  

       a2.agregarEstudiantes(e3);
       a2.agregarEstudiantes(e4);
       a2.agregarEstudiantes(e5);

       c.agregarAulas(a1);
       c.agregarAulas(a2);

       
       System.out.println(" ");
       c.comenzarClase();
       System.out.println(" ");

       
       
 }


 
 }


