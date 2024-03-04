import java.util.Scanner;

public class TesteJava {

    public static void main(String[] args) {
        int cod, resultado, n1, n2;

        Scanner lerOp = new Scanner(System.in);
         
        System.out.println("Escolha a operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        cod = lerOp.nextInt();

        switch(cod){
            case 1:
              System.out.println("Escolhido Soma");
              System.out.println("Digite os dois valores: ");
              n1 = lerOp.nextInt();
              n2 = lerOp.nextInt();
              System.out.println("Resultado = " + (n1+n2));
              
            break;

            case 2:
              System.out.println("Escolhido Subtração");
              System.out.println("Digite os dois valores: ");
              n1 = lerOp.nextInt();
              n2 = lerOp.nextInt();
              System.out.println("Resultado = " + (n1-n2));
            break;

            default:
               System.out.println("Operação invalida");
            break;
        } 
       
    }

}

//Testtando uma função que talvez de certo.
