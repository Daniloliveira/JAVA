import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int diasvida, anos, meses , dias , restoanos;

        diasvida = teclado.nextInt();
        anos = diasvida / 365;
        restoanos = diasvida % 365;
        meses = restoanos / 30 ;
        dias = restoanos % 30;
        
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

    }
}