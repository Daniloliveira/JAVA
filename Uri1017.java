import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int tempo, veloc;
        float distancia, litros;
        tempo = teclado.nextInt();
        veloc = teclado.nextInt();
        distancia = veloc * tempo ;
        litros = distancia / 12 ;
        System.out.printf("%.3f%n",litros);
    }
}