import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codpeca1, codpeca2, numpeca1, numpeca2;
        double valorpeca1, valorpeca2, valorpagar;
        
        codpeca1 = teclado.nextInt();
        numpeca1 = teclado.nextInt();
        valorpeca1 = teclado.nextDouble();
        codpeca2 = teclado.nextInt();
        numpeca2 = teclado.nextInt();
        valorpeca2 = teclado.nextDouble();
        valorpagar = ((numpeca1 * valorpeca1) + (numpeca2 * valorpeca2));

        System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorpagar);
    }
}