import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tipo, check=0, Alcool=0, Gasolina=0, Diesel=0;

        while (check < 1){
            tipo = teclado.nextInt();
            if ( tipo == 1){
                Alcool++;
            }
            else if ( tipo == 2 ){
                Gasolina++;
            }
            else if ( tipo == 3 ){
                Diesel++;
            }
            else if ( tipo == 4 ){
                check ++;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + Alcool);
        System.out.println("Gasolina: " + Gasolina);
        System.out.println("Diesel: " + Diesel);
    }
}