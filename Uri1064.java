import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float num, soma=0, media=0;
        int qtde=0; 


        for (int cont=1; cont <= 6; cont++){
            num = teclado.nextFloat();          
            if (num > 0){
                qtde = qtde + 1;
                soma = soma + num;
            }
        }

        media = soma / qtde ;
        System.out.println(qtde + " valores positivos");
        //System.out.printf("%.1f%n",soma);
        System.out.printf("%.1f%n",media);
    }
}