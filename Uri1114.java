import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int senha=0, check=0;


        while (check < 1){
            senha = teclado.nextInt();
            if (senha != 2002){
                System.out.println("Senha Invalida");
            }
            else {
                System.out.println("Acesso Permitido");
                check ++;
            }
        }
    }
}