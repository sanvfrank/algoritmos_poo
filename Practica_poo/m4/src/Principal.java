public class Principal {
    public static void main (String[] args){
       posnet p=new posnet();
       datosTitular d=new datosTitular("Frank","Castro","1065789","frank@hoddf");
       targetaDeCredito t1=new targetaDeCredito(entidadFinanciera.BIRZA,"Banco bogota", "1000524", (double) 35000,d);

       System.out.println("Targeta antes del pago: ");
       System.out.println(" ");
       System.out.println(t1);
       System.out.println(" ");

       ticket pp= p.efectuarPago(t1, 20000, 4);
       System.out.println(" ");
       if(pp!=null){
        System.out.println("Pago efectuado:");
        System.out.println(pp);
        System.out.println(" ");
       }else{
        System.out.println("Pago cancelado");
       }
       
      
       System.out.println(" ");
       System.out.println("Targeta despues del pago: ");
       System.out.println(t1);

    }
    
}
