import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int segundos, horas, minutos;
        int restohoras, restominutos;
        segundos = teclado.nextInt();
        // Obter a Hora
        horas = segundos / 3600;
        restohoras = segundos % 3600;
        minutos = restohoras / 60;
        segundos = restohoras % 60;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}