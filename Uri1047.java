import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int horaini, horafim, minini, minifim, totalminini, totalminfim, totalmin, hora, minuto;
        horaini = teclado.nextInt();
        minini = teclado.nextInt();
        horafim = teclado.nextInt();
        minifim = teclado.nextInt();

        totalminini = (horaini * 60 ) + minini;
        totalminfim = (horafim * 60 ) + minifim;

        totalmin = totalminfim - totalminini;

        //System.out.println(totalminini);
        //System.out.println(totalminfim);
        //System.out.println(totalmin);


        if (totalmin <= 0){
            totalmin = totalmin + 1440;
            hora = totalmin / 60;
            minuto = totalmin % 60;
        }
        else{
            hora = totalmin / 60;
            minuto = totalmin % 60;   
        }

        System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + minuto + " MINUTO(S)");
    }   
}