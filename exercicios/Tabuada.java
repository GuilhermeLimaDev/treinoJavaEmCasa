import java.util.Scanner;
public class Tabuada {
    public static void main(String[]args){
         
        int numTab, i=1, resultado;
        Scanner lerTab = new Scanner(System.in);

        System.out.println("Digite o número que deseja fazer a tabuada: ");
        numTab = lerTab.nextInt();
        
        System.out.println("------ Tabuada de " + numTab + " -------");
        while(i<11){
            resultado= numTab * i;
            System.out.println(numTab + "x" + i + "=" + resultado);
            i++;
        }


    }
}
