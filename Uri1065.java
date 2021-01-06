import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float num;
        int qtdepares=0, qtdeimpares=0, qtdepositivos=0, qtdenegativos=0 ; 


        for (int cont=1; cont <= 5; cont++){
            num = teclado.nextFloat();          
            if (num % 2 == 0 && num < 0 ){
                qtdepares++
                qtdenegativos++
            }
            else if (num % 2 == 0 && num > 0 ){
                qtdepares++
                qtdepositivos++
            }
            else if (num % 2 != 0 && num < 0 ){
                qtdeimpares++
                qtdenegativos++
            }
            else if (num % 2 != 0 && num > 0 ){
                qtdeimpares++
                qtdepositivos++
            }
            else if num % 2 == 0 && num == 0 ){
                qtdepares++
            }
            else if num % 2 != 0 && num == 0 ){
                qtdeimparespares++
            }
        }

        System.out.println(qtdepares + " valor(es) par(es)");
        System.out.println(qtdeimpares + " valor(es) impar(es)");
        System.out.println(qtdepositivos + " valor(es) positivo(s)");
        System.out.println(qtdenegativos + " valor(es) negativo(s)");
    }
}