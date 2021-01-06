import java.util.Scanner;

public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, X;
        N = teclado.nextInt();
        for (int cont=1; cont <= N; cont++){
            X = teclado.nextInt();          
            if (X % 2 == 0 && X < 0 ){
                System.out.println("EVEN NEGATIVE");
            }
            else if (X % 2 == 0 && X > 0 ){
                System.out.println("EVEN POSITIVE");
            }
            else if (X % 2 != 0 && X < 0 ){
                System.out.println("ODD NEGATIVE");
            }
            else if (X % 2 != 0 && X > 0 ){
                System.out.println("ODD POSITIVE");
            }
            else if ((X % 2 == 0 && X == 0 ) || (X % 2 != 0 && X == 0 )) {
                System.out.println("NULL");
            }
        }

    }
}