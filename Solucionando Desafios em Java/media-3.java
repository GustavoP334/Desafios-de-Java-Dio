import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Desafio{


	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Double n1,n2,n3,n4,media, exame;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();


		media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10;
		
		System.out.printf("Media: %.1f\n",media);


		//continue a solucao de acordo com o enunciado


		if (media >= 7.0) {
			  System.out.println("Aluno aprovado.");	
		}
		
		else if (media < 5.0 ){
			System.out.println("Aluno reprovado.");	
		}
		
		else if(media >= 5.0 && media <= 6.9) {
		  
			System.out.println("Aluno em exame.");
			
			exame = sc.nextDouble();
			System.out.printf("Nota do exame: %.1f\n", exame);
			media = (media + exame) / 2;
		
			if(media >= 5.0){
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f\n", media );
				
			}
			
			else{
				System.out.println("Aluno reprovado");
				System.out.printf("Media final: %.1f\n", media);
			}
		}


		sc.close();
	}
}
