public class principal {
    public static void main (String[] args){
        float horas_t,tarifa,salario,boni,tarifa_e,horas_e,salario_t,boni1;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingresa horas trabajadas");
        horas_t=leer.nextFloat();
        System.out.println("ingresa tarifa horaria");
         tarifa=leer.nextFloat();
         salario=horas_t*tarifa;
      
          
         if(horas_t>=40&&salario<186000){
             tarifa_e=(float) (tarifa+(tarifa*0.50));
             horas_e=(horas_t-40);
             salario_t=(horas_e*tarifa_e)+(40*tarifa);
             boni=(float) (salario_t*1.6);
             System.out.println("el salario por las horas extras mas bonificacion: "+boni);
             
         }
         else if(horas_t<=40&&salario<186000){
             boni1=(float) (salario*1.6);
             System.out.println("su salario mas bonificacion es : "+boni1);
         }
              else{
             System.out.println("su salario es: "+salario);
         }
         }
         
    }


