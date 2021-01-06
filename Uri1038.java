import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);

        int cod, qnt;
        double valor;
        valor = 0;

        cod = teclado.nextInt();
        qnt = teclado.nextInt();

        if ( cod == 1 ) {
            valor = 4 * qnt;
        }
        else if (cod == 2){
            valor = 4.5 * qnt;
        }
        else if (cod == 3){
            valor = 5 * qnt;
        }
        else if (cod == 4){
            valor = 2 * qnt;
        }
        else if(cod == 5){
            valor = 1.5 * qnt;
        }

        System.out.printf("Total: R$ %.2f%n",valor);
    }
}