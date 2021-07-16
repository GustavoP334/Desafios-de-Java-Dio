import java.io.IOException;
import java.util.Scanner;

public class Desafio {
	
    public static void main(String[] args) throws IOException {
       Scanner entrada = new Scanner(System.in);
       int positivo = 0;
       System.out.println("");
       double n1 = entrada.nextDouble();
       System.out.println("");
       double n2 = entrada.nextDouble();
       System.out.println("");
       double n3 = entrada.nextDouble();
       System.out.println("");
       double n4 = entrada.nextDouble();
       System.out.println("");
       double n5 = entrada.nextDouble();
       System.out.println("");
       double n6 = entrada.nextDouble();

           if(n1>0) 
           {
           positivo+=1;
           }
           if(n2>0) 
           {
           positivo+=1;
           }
           if(n3>0) 
           {
           positivo+=1;
           }
           if(n4>0) 
           {
           positivo+=1;
           }
           if(n5>0) 
           {
           positivo+=1;
           }
           if(n6>0) 
           {
           positivo+=1;
           }

           System.out.println(positivo+" valores positivos");
           entrada.close();
}
}
