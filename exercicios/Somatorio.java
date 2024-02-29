import java.util.Scanner;

public class Somatorio {
    public static void main(String [] args){


      Scanner LerNumero = new Scanner(System.in);
      int cont = 0, somatorio=0, num, numDigitados;

      System.out.println("Digite quantos numeros deseja somar:");
      numDigitados = LerNumero.nextInt();

      while(cont<numDigitados){

        System.out.println("Digite o " + cont + "º Numero");
        num = LerNumero.nextInt();
        somatorio += num;
        cont++;

      }
      
      System.out.println("Resultado da soma: " + somatorio);

    }

}
