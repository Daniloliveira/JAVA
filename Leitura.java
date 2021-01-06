import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){
        Scanner teclado;

        teclado = new Scanner(System.in);

        int a;
        double b;
        
        System.out.println("Por favor digite um valor inteiro");
        a = teclado.nextInt();
        System.out.println("Por favor digite um valor real");
        b = teclado.nextDouble();

        System.out.println("Voce digitou os valores : " + a + " e " + b);



    }

}