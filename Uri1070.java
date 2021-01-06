import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int num, qtdeimpares=0;
        num = teclado.nextInt();             

        while (qtdeimpares < 6) { 
            if (num % 2 != 0){
                System.out.println(num);
                qtdeimpares++;
            }
            num++;
        }
    }
}