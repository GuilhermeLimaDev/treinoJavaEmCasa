public class numerosPares {
    public static void main(String []args){
        int contador = 0, i=100;

        while(i<=999){
            i+=2;
            System.out.println(i);
            contador++;
        }
        System.out.println("Total de números pares entre 100 e 999 = "+ contador);
    }
}
