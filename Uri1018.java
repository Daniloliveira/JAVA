import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N, nota100, nota50, nota20, nota10, nota5, nota2, nota1;
        int resto100, resto50, resto20, resto10, resto5, resto2;
        N = teclado.nextInt();

        nota100 = N / 100;
        resto100 = N % 100;
        
        nota50 = resto100 / 50;
        resto50 = resto100 % 50;

        nota20 = resto50 / 20;
        resto20 = resto50 % 20;

        nota10 = resto20 / 10;
        resto10 = resto20 % 10;

        nota5 = resto10 / 5;
        resto5 = resto10 % 5;

        nota2 = resto5 / 2;
        nota1 = resto5 % 2;
        
        System.out.println(N);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");
    }
}