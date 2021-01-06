import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int horaini, horafim, totalini, total;
        horaini = teclado.nextInt();
        horafim = teclado.nextInt();
        
        //totalini = 24 - horaini
        //totalfim = 


        if (horafim > horaini){
            total = horafim - horaini;
            System.out.println("O JOGO DUROU " + total + " HORA(S)");
        }
        else if (horafim == horaini){
            total = 24;
            System.out.println("O JOGO DUROU " + total + " HORA(S)");
        }
        else if (horafim < horaini){
            totalini = 24 - horaini;
            total = totalini + horafim;
            System.out.println("O JOGO DUROU " + total + " HORA(S)");
        }
    }
}