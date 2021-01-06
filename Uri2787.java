import java.util.Scanner;

public class Uri2787{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int C, L, checkcor;

        L = teclado.nextInt();
        C = teclado.nextInt();
        checkcor = C * L;

        if ((L % 2 ) != 0 && (C % 2) != 0 ){
            System.out.println("1");
        }
        else if ((L % 2 ) != 0 && (C % 2) == 0 ){
            System.out.println("0");
        }
        else if ((L % 2 ) == 0 && (C % 2) != 0 ){
            System.out.println("0");
        }
        else if ((L % 2 ) == 0 && (C % 2) == 0 ){
            System.out.println("1");
        }

    }
}
