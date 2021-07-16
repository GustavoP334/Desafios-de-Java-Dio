import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class minhaClasse {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        String linha;
        int positivo = 0;
        int negativo = 0;
        int impar = 0;
        int par = 0;
        int  num;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//continue a solução
        for (int i = 0; i < 5; i++) {
          linha = br.readLine();
          num = Integer.parseInt(linha);
          
          if (num % 2 == 0){
            par++;
          }  else {
            impar++;
          }
          
          if (num > 0) positivo++;
          if (num < 0) negativo++;
        }
//insira suas variaveis corretamente
        System.out.println("" + par + " valor(es) par(es)");
        System.out.println("" + impar + " valor(es) impar(es)");
        System.out.println("" + positivo + " valor(es) positivo(s)");
        System.out.println("" + negativo + " valor(es) negativo(s)");
    }
	
}
