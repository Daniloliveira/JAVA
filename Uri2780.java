import java.util.Scanner;

public class Uri2780{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
         int D, pontos;

         pontos=0;

         D = teclado.nextInt();

         if (D <= 800){
             pontos = 1;
         }
         else if ( D > 800 && D <= 1400){
             pontos = 2;
         }
         else if ( D > 1400 && D <= 2000){
            pontos = 3;
        }
        
        System.out.println(pontos);

    }
}